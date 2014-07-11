package com.sone.freshman.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sone.freshman.vo.AddressVO;

@Controller
public class Navigation {
	@RequestMapping(value="/navigatororg",method = RequestMethod.GET)
	public String showOrg() {
		return "org";
	}
	@RequestMapping(value="/navigatoraddrAdd",method = RequestMethod.GET)
	public String showAddressAdd(@ModelAttribute("address") AddressVO address) {
		return "vAddressAdd";
	}
	
}
