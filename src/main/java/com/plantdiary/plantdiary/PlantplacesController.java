package com.plantdiary.plantdiary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PlantplacesController {

	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read(){ 
		return "start"; 
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, headers="{content-type=text/json}")
	public String startJson(){ 
		return "start"; 
	}
	
	@RequestMapping(value="/start", params={"loyalty=blue"})
	public String create(){ 
		return "start"; 
	}
	
}
