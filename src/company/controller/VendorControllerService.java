package company.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import company.configuration.VendorConfig;
import company.model.LoginModel;

@EnableWebMvc
@RestController
@RequestMapping("/service")
public class VendorControllerService 
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
	public LoginModel getIndianVendors()
	{
		
		ModelAndView model=new ModelAndView();
		ArrayList<String> vList;
		vList=vendorI.getVendorList();
		loginModel.setVendorList(vList);
		return loginModel;
		
	}
	
	@RequestMapping("/getChinaVendors")
	@ResponseBody
	public LoginModel getChinaVendors()
	{
		ArrayList<String> vList;
		vList=vendorC.getVendorList();
		loginModel.setVendorList(vList);
		
		return loginModel;
	}


	
}
