package com.websystique.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.websystique.spring.model.Employee;
import com.websystique.spring.model.Result;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
public class AppMainController {

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	@RequestMapping("/save")
	public Result save() {
		Result rs = new Result();
		rs.setStatus("hi");
		return rs; 
	}
}
