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

@SequenceGenerator(name="customerSeq",sequenceName="customer_no_seq", initialValue=1, allocationSize=1)
@SequenceGenerator(name = "subscriptionSeq",sequenceName="subscription_no_seq",initialValue=1,allocationSize=1)
@SequenceGenerator(name = "storekeySeq",sequenceName="storekey_no_seq",initialValue=1,allocationSize=1)
@SequenceGenerator(name = "ffSeq",sequenceName="ff_no_seq",initialValue=1,allocationSize=1)
@SequenceGenerator(name = "contactSeq",sequenceName="contact_no_seq",initialValue=1,allocationSize=1)
public class SequenceNumber implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="customerSeq")
    private BigInteger customerId;

	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="subscriptionSeq")
    private BigInteger subscriptionId;
	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="storekeySeq")
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
