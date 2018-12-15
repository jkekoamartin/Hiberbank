package repositories.interfaces;

import models.Customer;

public interface CustomerRepository extends CrudOperations<Customer, Long> {

	Customer getByUsername(String username);
}
