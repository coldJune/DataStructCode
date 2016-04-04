package com.jun.linkedstack;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.jun.linkedstack.*;
/**
*@author jun
*@version 1.0
*@date 2016/4/4
*/
public class LinkedStack01Test extends TestCase{
	public LinkedStack01Test(String testName){
		super(testName);
	}
	
	public void testLinkedStack() throws Exception{
		LinkedStack01 myStack = new LinkedStack01();
		myStack.push(new Integer(9));
		myStack.push(new Integer(8));
		myStack.push(new Integer(7));
		
		System.out.println("myStack.size()="+myStack.size());
		myStack.pop();
		System.out.println("myStack.size()="+myStack.size());
		System.out.println("myStack.top()="+myStack.top());
	}
}