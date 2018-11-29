package company.configuration;

import java.util.ArrayList;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class VendorConfig 
{

	private ArrayList<String> vendorList;

	public ArrayList<String> getVendorList() 
	{
		ArrayList< String> tempList=new ArrayList<>();
		for(String vendor:vendorList)
		{
			tempList.add(vendor);
		}
		return tempList;
	}
	
	public void intialiseVendor(String country)
	{
		vendorList=new ArrayList<String>();
		if("India".equalsIgnoreCase(country))
		{
			vendorList.add("India1");
			vendorList.add("India2");
			vendorList.add("India3");
		}
		else if("China".equalsIgnoreCase(country))
		{
			vendorList.add("chin1");
			vendorList.add("china2");
			vendorList.add("china3");
		}
	}
	
	
	
	
}
