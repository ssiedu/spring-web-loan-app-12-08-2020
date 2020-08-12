package com.ssi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoanController {

	//mapping-for-input-url (show the details.jsp)
	@RequestMapping("input")
	public String showInputPage() {
		return "details.jsp";	//it is the name of view we are returning to DispatcherServlet
	}
	
	
	//mapping-for-computeinstallment (installment compute using service class)
	@RequestMapping("computeinstallment")
	public ModelAndView installmentCalculation(@RequestParam("t1") int amount, @RequestParam("t2") int time) {
		
		LoanModel model=new LoanModel();
		model.setLoanAmount(amount);
		model.setTime(time);
		
		//call the method of service class to compute installment
		LoanService service=new LoanService();
		service.computeInstallment(model);
		
		//forward-the-request-to-view (using DispatcherServlet)
		ModelAndView mv=new ModelAndView("info.jsp");
		//mv.setViewName("info.jsp");
		mv.addObject("result", model);
		//returning this ModelAndView object (which contains view-name as well as model object) to DispatcherServlet
		return mv;
	}
	
}
