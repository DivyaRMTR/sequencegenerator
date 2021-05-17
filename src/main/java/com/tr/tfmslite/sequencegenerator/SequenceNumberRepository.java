package com.tr.tfmslite.sequencegenerator;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SequenceNumberRepository extends JpaRepository<SequenceNumber, BigInteger>{

}
