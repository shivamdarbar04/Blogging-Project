package com.nst.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCntroller 
{
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}

	
}
