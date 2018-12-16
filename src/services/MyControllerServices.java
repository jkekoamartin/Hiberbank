package pkg;

import java.util.List;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.Customer;
import dao.CustomerDaoServices;

@Controller
public class MyControllerServices {

	@RequestMapping(value="/")
	public String menu()
	{
		return "viewCustInfo";
	}
	
//	@RequestMapping(value="viewemployee")
//	public String viewallemployees(ModelMap allemployeemap)
//	{
//		//ModelMap allemployeemap = new ModelMap();
//		List<Employee> allemployees = new EmployeeDaoServices().getAllEmployees();
//		allemployeemap.addAttribute("allemployees",allemployees);
//		return "viewallemployee";
//	}
//
//	@RequestMapping(value="insertnewemployeeform")
//	public String viewnewemployeeform(ModelMap map)
//	{
//		map.addAttribute("command", new Employee());  
//		return "newemployeeform";
//	}
//	
//	@RequestMapping(value="saveemployeeservice")
//	public String save(@ModelAttribute("emp") Employee emp)
//	{
//		if(new EmployeeDaoServices().addNewEmployee(emp)==1)
//			return "redirect:/viewemployee";
//		else
//			return "error";
//	}
//	
//	@RequestMapping(value="deleteemployee/{eid}")
//	public String deleteEmployee(@PathVariable("eid") int eid)
//	{
//		if(new EmployeeDaoServices().deleteEmployee(eid)==1)
//			return "redirect:/viewemployee";
//		else
//			return "error";
//	}
//	
//	
//	@RequestMapping(value="updateemployee/{eid}")
//	public String updateEmployee(@PathVariable("eid") int eid,ModelMap map)
//	{
//		Employee employee = new dao.EmployeeDaoServices().findEmployee(eid);
//		map.addAttribute("command",employee);
//		return "editEmployeeForm";
//	}
//	
//	@RequestMapping(value="saveupdatedInfo")
//	public String saveupdate(@ModelAttribute("emp") Employee emp)
//	{
//		if(new EmployeeDaoServices().updateEmployee(emp.getEmpid(), emp.getEmpcity(), emp.getEmpphone())==1)
//			return "redirect:/viewemployee";
//		else
//			return "error";
//	}
	
}


