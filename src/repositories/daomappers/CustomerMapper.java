package repositories.daomappers;

import models.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet result, int i) throws SQLException {
		return new Customer(result.getLong(1), result.getString(2), result.getString(3), result.getString(4),
				result.getString(5), result.getString(6), result.getString(7));
	}
}
