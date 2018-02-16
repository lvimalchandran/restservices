package com.vim.rest.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.vim.rest.vo.EmployeeVO;

@Path("/employee")
public class EmployeeService {

	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listEmployees() {
		System.out.println("Recevied list employee call..!");
		List<EmployeeVO> empList = new ArrayList<EmployeeVO>();
		
		EmployeeVO  employeeVO1 = new EmployeeVO();
		employeeVO1.setName("Vimal");
		employeeVO1.setAge(30);
		employeeVO1.setDesignation("Developer");
		empList.add(employeeVO1);
		
		EmployeeVO employeeVO2 = new EmployeeVO();
		employeeVO2.setName("Pinku");
		employeeVO2.setAge(23);
		employeeVO2.setDesignation("Developer");
		empList.add(employeeVO2);
		
		return Response.status(200).entity(empList).build();
		
	}
}
