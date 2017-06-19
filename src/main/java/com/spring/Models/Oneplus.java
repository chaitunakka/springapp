package com.spring.Models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.spring.Mobile.MobileInterface;

@Component
public class Oneplus implements MobileInterface {
	public void model() {
		System.out.println("Oneplus");		
	}
}
