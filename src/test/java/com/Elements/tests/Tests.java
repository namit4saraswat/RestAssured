package com.Elements.tests;

import org.testng.annotations.Test;

import com.tests.base.BaseTest;

public class Tests extends BaseTest{

	@Test
	public void Test1() {
		System.out.println("This is Test1");
		System.out.println("This is Test1");
	}
	
	
	
	@Test
	public void Test2() {
		System.out.println("This is Test2");
		System.out.println("This is Test2");
	}
	
	@Test
	public void Test3() {
		System.out.println("This is Test3");
		System.out.println("This is Test3");
	}
	
	@Test(enabled=true)
	public void Test4() {
		System.out.println("This is Test4");
		System.out.println("This is Test4");
	}
	
	@Test(enabled=true)
	public void Test5() {
		System.out.println("This is Test5");
		System.out.println("This is Test5");
	}
	
	
	@Test(enabled=false)
	public void Test6() {
		System.out.println("This is Test6");
	}
	
	@Test(enabled=false)
	public void Test7() {
		System.out.println("This is Test7");
	}
	
	
}
