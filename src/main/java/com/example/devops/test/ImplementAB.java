package com.example.devops.test;

public class ImplementAB implements InterfaceA,InterfaceB {
	@Override
	public void hello() {
		System.out.println("ImplementAB Hello");
	}
}
