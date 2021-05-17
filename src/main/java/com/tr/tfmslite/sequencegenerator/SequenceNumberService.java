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
	
	public BigInteger getSequenceByName(String name)
	{
		switch(name) {
		case "customer":
			return sequenceRepo.getNextCustomerSeqId();
		case "contact":
			return sequenceRepo.getNextContactSeqId();
		case "storekey":
			return sequenceRepo.getNextStoreKeySeqId();
		case "subscription":
			return sequenceRepo.getNextSubscriptionSeqId();
		
		}
		return null;
	}
}
