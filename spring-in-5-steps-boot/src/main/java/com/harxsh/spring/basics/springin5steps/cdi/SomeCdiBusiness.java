package com.harxsh.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {

	@Inject
	SomeCdiDAO someCdiDao;

	public SomeCdiDAO getSomeCdiDao() {
		return someCdiDao;
	}
	
	public void setSomeCdiDao(SomeCdiDAO someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
}
