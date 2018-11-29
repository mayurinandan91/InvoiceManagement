package company.model;

import java.util.ArrayList;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LoginModel {
	private ArrayList<String> vendorList;

	public ArrayList<String> getVendorList() {
		return vendorList;
	}

	public void setVendorList(ArrayList<String> vendorList) {
		this.vendorList = vendorList;
	}

}
