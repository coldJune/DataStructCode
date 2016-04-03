package com.jun.arraystack;

import java.util.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.jun.arraystack.*;

/**
*@author jun
*@version 1.0
*@date 2016/4/3
*Unit test for ArrayStack01
*/

public class ArrayStack01Test extends TestCase{
	public ArrayStack01Test(String testName){
		super(testName);
	}
	
	public void testArrayStack() throws Exception{
		ArrayStack01 myStack = new ArrayStack01(9);
		myStack.push(new Integer(1));
		myStack.push(new Integer(2));
		myStack.push(new Integer(3));
		System.out.println("myStack.size()="+myStack.size());
		myStack.pop();
		System.out.println("myStack.size()="+myStack.size());
		System.out.println("myStack.top()="+myStack.top());
		
	}
}