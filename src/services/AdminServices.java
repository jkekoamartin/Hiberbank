package src.services;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import src.models.Customer;

public class AdminServices {
	//need a customer class
	//need a mapper for the customer class
	//need to change the query for the list of new customers
	public List <Customer> AllNewCustomer() {
		
		JdbcTemplate jtemp = (JdbcTemplate) new ClassPathXmlApplicationContext("spring-config.xml").getBean("jt");
		List <Customer> allcustomers = jtemp.query("Select * from TestCustomer where status = 'new' order by cid", new src.repositories.daomappers.AdminCustomerMapper());
		return allcustomers;

	}
	public int editCustomer(String status,int id)
	{
		JdbcTemplate jtemp = (JdbcTemplate) new ClassPathXmlApplicationContext("spring-config.xml").getBean("jt");
		return jtemp.update("update TestCustomer set status = ? where cid = ?", new Object []{status,id});
	}
	/*public static void main(String s[])
	{
		System.out.println(new AdminServices().AllNewCustomer().size());
	}*/
}
