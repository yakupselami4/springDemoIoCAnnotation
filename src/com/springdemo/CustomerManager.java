package com.springdemo;

public class CustomerManager implements ICustomerService{
	
	//dependency injection
	
	private ICustomerDal customerDal;
	

	//constructor injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	@Override
	public void add() {
		customerDal.add();
		
	}

}
