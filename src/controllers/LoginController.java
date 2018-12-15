package controllers;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import models.Customer;
import repositories.interfaces.CustomerRepository;
import repositories.oraclerepositoryimpl.CustomerRepositoryOracleImpl;
import services.CustomerServices;
import services.LoginServices;

@Controller
public class LoginController {

	// map request to jsp page

	@RequestMapping(value = "/")
	public String addService(ModelMap model) {

		System.out.println("Root");
		return "menu";
	}

	@RequestMapping(value = "userdashboard/{username}")
	public String showAllEmployee(@PathVariable("username") String username, ModelMap model) {

		System.out.println(username);
		CustomerRepository customerRepository = new CustomerRepositoryOracleImpl();
		Customer cust = customerRepository.getByUsername(username + ".com");
		model.addAttribute("customer", cust);

		System.out.println("Got cust");
		
		return "userdashboard";
	}

	@RequestMapping(value = "login")
	public String viewloginform(ModelMap map) {

		System.out.println("Login");
		map.addAttribute("command", new Customer());

		return "login";
	}

	@RequestMapping(value = "loginservice")
	public String login(@ModelAttribute Customer cust) {

		// TODO: Redirect to user dashboard
		LoginServices loginServices = new LoginServices();

		if (loginServices.login(cust)) {

			System.out.println("Logged in!");
			return "redirect:userdashboard/" + cust.getUsername();
		}

		return "redirect:login";

	}

}
