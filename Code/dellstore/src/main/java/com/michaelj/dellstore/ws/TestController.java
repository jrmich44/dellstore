package com.michaelj.dellstore.ws;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping(value="/test", method=RequestMethod.GET, produces=MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> getTest(){
		return new ResponseEntity<String>("Test", HttpStatus.OK);
		
	}

}
