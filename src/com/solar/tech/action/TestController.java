package com.solar.tech.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Controller")
public class TestController {
	
	@RequestMapping(value="/test.action")
	@ResponseBody
	public List<String> hello(String ages){
		   System.out.println(ages);
		   List<String> list = new ArrayList<String>();
		   list.add("ÄãºÃ");
	       return list;
    }
}
