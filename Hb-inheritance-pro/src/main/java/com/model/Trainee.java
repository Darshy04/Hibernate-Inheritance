package com.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity 
@DiscriminatorValue (value="trainee")
public class Trainee extends Employee{
float payperhour;
String contractperiod;
public Trainee() {
	
}

public Trainee(float payperhour, String contractperiod) {
	super(name);
	this.payperhour = payperhour;
	this.contractperiod = contractperiod;
}

public float getPayperhour() {
	return payperhour;
}
public void setPayperhour(float payperhour) {
	this.payperhour = payperhour;
}
public String getContractperiod() {
	return contractperiod;
}
public void setContractperiod(String contractperiod) {
	this.contractperiod = contractperiod;
}
}
