package com.spring.Models;

import org.springframework.stereotype.Component;

import com.spring.Mobile.MobileInterface;

@Component("google")
public class Pixel implements MobileInterface {
	public void model() {
		System.out.println("Google Pixel");
	}
}
