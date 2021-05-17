package com.tr.tfmslite.sequencegenerator;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeDetails")
@SequenceGenerator(name="customerSeq", initialValue=1, allocationSize=1)
@SequenceGenerator(name = "subscriptionSeq",initialValue=1,allocationSize=1)
@SequenceGenerator(name = "storagekeySeq",initialValue=1,allocationSize=1)
@SequenceGenerator(name = "ffSeq",initialValue=1,allocationSize=1)
@SequenceGenerator(name = "contactSeq",initialValue=1,allocationSize=1)
public class SequenceNumber implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="customerSeq")
	@Column(name="customer_no_seq")
    private BigInteger customerId;

	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="subscriptionSeq")
    private BigInteger subscriptionId;
	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="storageSeq")
    private BigInteger storagekeyId;
	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ffSeq")
    private BigInteger ffId;
	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="contactSeq")
    private BigInteger contactId;
	
	public BigInteger getCustomerId() {
		return customerId;
	}

	public void setCustomerId(BigInteger customerId) {
		this.customerId = customerId;
	}

	public BigInteger getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(BigInteger subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public BigInteger getStoragekeyId() {
		return storagekeyId;
	}

	public void setStoragekeyId(BigInteger storagekeyId) {
		this.storagekeyId = storagekeyId;
	}

	public BigInteger getFfId() {
		return ffId;
	}

	public void setFfId(BigInteger ffId) {
		this.ffId = ffId;
	}

	public BigInteger getContactId() {
		return contactId;
	}

	public void setContactId(BigInteger contactId) {
		this.contactId = contactId;
	}

	public SequenceNumber()
	{
		
	}

	
}
