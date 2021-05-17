package com.tr.tfmslite.sequencegenerator;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SequenceNumberService {
	@Autowired
	private SequenceNumberRepository sequenceRepo;
	
	public Optional<SequenceNumber> getCustomer(SequenceNumber sno, BigInteger customerId ) {
		return sequenceRepo.findById(customerId);
	}

}
