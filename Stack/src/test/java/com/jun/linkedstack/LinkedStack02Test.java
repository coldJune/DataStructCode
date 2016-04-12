package com.jun.linkedstack;

import com.jun.linkedstack.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.*;

/**
*@author jun
*@version 2.0
*@date 2016/4/12
*/
public class LinkedStack02Test extends TestCase{
	public LinkedStack02Test(String testName){
		super(testName);
	}
	
	public void testLinkedStack()throws Exception{
		LinkedStack02 myStack = new LinkedStack02();
		Iterator iter = null;
		
		for(int i=0;i<9;i++){
			myStack.push(i);
		}
		iter=myStack.elements();
		System.out.println("---------------push(8 7 6 5 4 3 2 1 0 )------------------");
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.println("---------------------------------------------------------");
		
		myStack.pop();
		iter=myStack.elements();
		System.out.println("---------------pop(7 6 5 4 3 2 1 0 )------------------");
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.println("----------------------size-----------------------------------");
		System.out.println(myStack.size());
		System.out.println("------------------------------------------------------------");
	}
} 