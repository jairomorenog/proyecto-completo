package com.prueba.pr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.prueba.bean.Auto;

@Controller
public class vercontroller {

	@RequestMapping(value = "/ver.pr", method = RequestMethod.POST)
	public String ver(@RequestParam("txtrup") String rup, Model md) {
		
		if(rup.equals("")) {
			md.addAttribute("mensaje","ok");
			return "home";
		}else {
			Auto a=new Auto(1, "gris", "form");
			md.addAttribute("auto",a);
			return "home";
		}
		
		
		
		
		
	}
	
	

}
