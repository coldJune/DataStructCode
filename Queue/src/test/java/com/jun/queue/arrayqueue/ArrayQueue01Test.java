package com.jun.queue.arrayqueue;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.jun.queue.arrayqueue.*;
/**
*@author jun
*@version 1.0
*@date 2016/4/6
*/
public class ArrayQueue01Test extends TestCase{
	public ArrayQueue01Test(String testName){
		super(testName);
	}
	
	public void testArrayQueue() throws Exception{
		ArrayQueue01 myQueue = new ArrayQueue01();
		myQueue.add(new Integer(8));//1
		myQueue.add(new Integer(7));//2
		myQueue.add(new Integer(6));//3
		
		System.out.println("myQueue.size()="+myQueue.size());//3
		myQueue.remove();
		System.out.println("myQueue.size()="+myQueue.size());//2
		System.out.println("myQueue.front()="+myQueue.front());//2
	}
}