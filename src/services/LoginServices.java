package services;

import models.Customer;
import repositories.interfaces.CustomerRepository;
import repositories.oraclerepositoryimpl.CustomerRepositoryOracleImpl;

public class LoginServices {

	public boolean login(Customer cust) {

		CustomerRepository customerRepository = new CustomerRepositoryOracleImpl();

		Customer storedCust = customerRepository.getByUsername(cust.getUsername());

		if (storedCust.getPassword().equals(cust.getPassword())) {
			return true;
		}

		return false;
	}
}
