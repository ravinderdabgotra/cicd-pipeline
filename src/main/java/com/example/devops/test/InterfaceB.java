package com.example.devops.test;

public interface InterfaceB {
	default void hello() {
		System.out.println("Interface B Hello");
	}
}
