package com.prueba.pr;

import javax.jws.WebParam.Mode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ircontroller {
	
	@RequestMapping("/irhola.jsp")
	public ModelAndView redireccion() {
		
		ModelAndView md=new ModelAndView();
		md.setViewName("hola");
		return md;
	}
}
