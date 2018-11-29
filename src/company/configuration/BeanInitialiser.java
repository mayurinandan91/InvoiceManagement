package company.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanInitialiser
{
	
	
	@Bean(name={"India"})
	public VendorConfig getIndianVendor()
	{
		VendorConfig vendorI=new VendorConfig();
		vendorI.intialiseVendor("India");
		return vendorI;
	}
	
	@Bean(name={"China"})
	public VendorConfig getChinaVendor()
	{
		VendorConfig vendorC=new VendorConfig();
		vendorC.intialiseVendor("China");
		return vendorC;
	}
	
	

}
