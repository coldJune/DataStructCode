package com.jun.arraystack;

import com.jun.arraystack.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
*@author jun
*@version 1.0
*@date 2016/4/11
*/
public class ArrayStack02Test extends TestCase{
	public ArrayStack02Test(String testName){
		super(testName);
	}
	
	public void testArrayStack()throws Exception{
		ArrayStack02 myStack = new ArrayStack02();
		for(int i=0;i<10;i++){
			myStack.push(i);
		}
		System.out.println("myStack.size()="+myStack.size());
		System.out.println("myStack.top()="+myStack.top());
		
		myStack.pop();
		System.out.println("myStack.size()="+myStack.size());
		System.out.println("myStack.top()="+myStack.top());
		
	}
}