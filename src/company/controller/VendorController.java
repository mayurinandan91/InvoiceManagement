package company.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import company.configuration.VendorConfig;
import company.model.LoginModel;

@Controller
public class VendorController 
{
	@Autowired
	@Qualifier("India")
	VendorConfig vendorI;
	
	@Autowired
	@Qualifier("China")
	VendorConfig vendorC;
	
	@Autowired
	LoginModel loginModel;
	
	@RequestMapping("/getIndianVendors")
	public ModelAndView getIndianVendors()
	{
		
		ModelAndView model=new ModelAndView();
		ArrayList<String> vList;
		vList=vendorI.getVendorList();
		loginModel.setVendorList(vList);
		model.setViewName("Login");
		model.addObject("loginModel", loginModel);
		
		
		return model;
	}
	
	@ResponseBody
	@RequestMapping("/getChinaVendors")
	public ModelAndView getChinaVendors()
	{
		
		ModelAndView model=new ModelAndView();
		ArrayList<String> vList;
		vList=vendorC.getVendorList();
		loginModel.setVendorList(vList);
		model.setViewName("Login");
		model.addObject("loginModel", loginModel);
		
		
		return model;
	}
	
}
