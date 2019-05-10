package org.jbpm.controller;

import java.util.Map;

import org.jbpm.models.JBPMDataModel;
import org.jbpm.service.JBPMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JBPMRestController {

	@Autowired
	JBPMService jbpmService;
	
	@RequestMapping(value = "/startProcess", method = RequestMethod.POST)
	public ResponseEntity<Map<String,String>> startProcess(@RequestBody JBPMDataModel dataModel) {
		System.out.println("Input Datamodel is: " + dataModel);
		return new ResponseEntity<Map<String,String>>(jbpmService.startProcess(dataModel), HttpStatus.OK);

	}
}
