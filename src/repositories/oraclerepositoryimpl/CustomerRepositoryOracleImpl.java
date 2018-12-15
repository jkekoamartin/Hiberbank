package repositories.oraclerepositoryimpl;

import models.Customer;
import repositories.daomappers.CustomerMapper;
import repositories.interfaces.CustomerRepository;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class CustomerRepositoryOracleImpl implements CustomerRepository {

	@Override
	public Customer getById(Long aLong) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jt");

		Customer customer = jdbcTemplate.queryForObject("select * from customer where username = ?",
				new Object[] { aLong }, new CustomerMapper());

		return customer;

	}

	public Customer getByUsername(String username) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jt");

		Customer customer = jdbcTemplate.queryForObject("select * from customer where username = ?",
				new Object[] { username }, new CustomerMapper());

		return customer;

	}

	@Override
	public List<Customer> getAll() {
		return null;
	}

	@Override
	public void deleteById(Long aLong) {

	}

	@Override
	public void save(Customer object) {

	}

	@Override
	public void update(Customer object) {

	}
}
