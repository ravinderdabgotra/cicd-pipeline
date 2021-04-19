package com.example.devops.test;

public interface InterfaceA {
	default void hello() {
		System.out.println("Interface A Hello");
	}

}
