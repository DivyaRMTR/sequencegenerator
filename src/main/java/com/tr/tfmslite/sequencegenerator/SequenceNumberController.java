package com.tr.tfmslite.sequencegenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SequenceNumberController {
	
	@Autowired
	private SequenceNumber sequence;
	
	
	
}
