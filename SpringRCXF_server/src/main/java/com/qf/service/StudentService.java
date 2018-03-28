package com.qf.service;

import com.qf.dto.StudentDTO;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Administrator on 2018\3\13 0013.
 */
@WebService
public interface StudentService {
    @GET
    @Produces(MediaType.APPLICATION_ATOM_XML)
    @Path("/stu/{id}")
    public StudentDTO findById(@PathParam("id")Long id);
}
