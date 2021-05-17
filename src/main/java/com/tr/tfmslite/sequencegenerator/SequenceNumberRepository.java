package com.tr.tfmslite.sequencegenerator;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SequenceNumberRepository extends JpaRepository<SequenceNumber, BigInteger>{
	
	@Query(value = "SELECT nextval('customer_no_seq')", nativeQuery = true)
    BigInteger getNextCustomerSeqId();
	
	@Query(value = "SELECT nextval('contact_no_seq')", nativeQuery = true)
    BigInteger getNextContactSeqId();
	
	@Query(value = "SELECT nextval('storekey_no_seq')", nativeQuery = true)
    BigInteger getNextStoreKeySeqId();
	
	@Query(value = "SELECT nextval('subscription_no_seq')", nativeQuery = true)
    BigInteger getNextSubscriptionSeqId();
	
	@Query(value = "SELECT nextval('ff_no_seq')", nativeQuery = true)
    BigInteger getNextFFSeqId();

}
