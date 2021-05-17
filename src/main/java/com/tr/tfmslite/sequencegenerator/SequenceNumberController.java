package com.tr.tfmslite.sequencegenerator;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SequenceNumberController {
	
	@Autowired
	private SequenceNumberService sequenceService;
	
	@RequestMapping("/{name}")
	public ResponseEntity<BigInteger> sequence(@PathVariable String name) {
		HttpStatus status = HttpStatus.OK;
		BigInteger output=sequenceService.getSequenceByName(name);
		
		if (output == null) {
			status = HttpStatus.NOT_FOUND;
		}

		return ResponseEntity.status(status).body(output);
	}	
	
	
	
}
