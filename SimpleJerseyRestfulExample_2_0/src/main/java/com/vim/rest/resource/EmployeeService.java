package com.vim.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import com.vim.rest.vo.EmployeeVO;

@Provider
@Path("/employees")
public class EmployeeService {

	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public Response list() {
		EmployeeVO employeeVO = new EmployeeVO();
		employeeVO.setAge(30);
		employeeVO.setDesignation("Developer");
		employeeVO.setName("Vimal");
		
		return Response.status(200).entity(employeeVO).build();
	}
}
