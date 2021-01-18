package com.vikash.autowire_qualifier;

import org.springframework.beans.factory.annotation.Value;

public class Heart {

	
	private String nameofanimal;
	private int noofheart;

	
	  public String getNameofanimal() 
	  {
		  return nameofanimal;
		  }
	  
	  public void setNameofanimal(String nameofanimal) 
	  { 
		  this.nameofanimal =	  nameofanimal;
		  }
	  
	  public int getNoofheart() { return noofheart; }
	  
	  public void setNoofheart(int noofheart) { this.noofheart = noofheart; }
	 
	public void pump() {
		System.out.println("you are alive");
		System.out.println("name of animal is: " +nameofanimal   +"  "  + "and no of heart is: " + noofheart);
	}

}
