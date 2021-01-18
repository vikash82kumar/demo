package com.vikash.autowire_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("humanheart")
	private Heart heart;
	
public void startpumping() {
	if (heart !=null)
	{
		heart.pump();
		
	}
	else
	{
		System.out.println("U r dead");
	}
}
}
