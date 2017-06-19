package com.spring.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.Mobile.MobileInterface;

@Component
public class Mobile {
	private String name;
	
	@Autowired
	@Qualifier("oneplus")
	private MobileInterface mobile;
	
	public void getMobile() {
		mobile.model();
	}
	public void setMobile(MobileInterface mobile) {
		this.mobile = mobile;
	}
	public Mobile() {
		super();
		System.out.println("creating mobile");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
