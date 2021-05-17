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
			return getNextCustomerSeqId();
		case "contact":
			return getNextContactSeqId();
		case "storekey":
			return getNextStoreKeySeqId();
		case "subscription":
			return getNextSubscriptionSeqId();
		
		}
		return null;
	}
	
	  public BigInteger  getNextCustomerSeqId() {
	        return sequenceRepo.getNextCustomerSeqId();
	    }
	
	  public BigInteger  getNextContactSeqId() {
	        return sequenceRepo.getNextContactSeqId();
	    }
	
	  public BigInteger  getNextStoreKeySeqId() {
	        return sequenceRepo.getNextStoreKeySeqId();
	    }
	  public BigInteger  getNextSubscriptionSeqId() {
	        return sequenceRepo.getNextSubscriptionSeqId();
	    }
	

}
