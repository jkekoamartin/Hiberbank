package src.repositories.daomappers;

import src.models.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminCustomerMapper implements RowMapper<Customer> {


    @Override
    public Customer mapRow(ResultSet result, int i) throws SQLException {
    	Customer customer = new Customer();
    	customer.setId(result.getLong(1));
    	customer.setName(result.getString(4));
    	customer.setAddress(result.getString(5));
    	customer.setPhone(result.getString(6));
    	customer.setStatus(result.getString(7));
    	
        return customer;
    }
}
