package com.mango.ctrls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class CtrlMain {
	
	@GetMapping(value = "/msg")
	public String getMethodName(@RequestParam String param) {
		return new String("Hello : " + param);
	}

}
