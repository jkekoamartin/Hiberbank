package src.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import src.services.AdminServices;
import src.models.Customer;

@Controller
public class AdminController {
	
	@RequestMapping(value = "/")
	public String showallemployees(ModelMap allcustomermap) {
		List<Customer> allcustomers = new AdminServices().AllNewCustomer();
		allcustomermap.addAttribute("allcustomers", allcustomers);
		return "AdminOverview";

	}

	


	@RequestMapping(value = "approve/{custid}")
	public String approveCustomer(@PathVariable("custid") int id) {
		// check if the update to approved happened or not
		if (new AdminServices().editCustomer("approve", id)==1) {
			return "redirect:/";
		} 
			return "error";
		

	}
	
	@RequestMapping(value = "deny/{custid}")
	public String denyCustomer(@PathVariable("custid") int id) {
		// check if the update to deny happened or not
		if (new AdminServices().editCustomer("deny", id)==1) {
			return "redirect:/";
		} 
			return "error";
	}
}
