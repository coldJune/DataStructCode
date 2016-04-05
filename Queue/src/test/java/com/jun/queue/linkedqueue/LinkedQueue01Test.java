package com.jun.queue.linkedqueue;

import com.jun.queue.linkedqueue.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
*@author jun
*@version 1.0
*@date 2016/4/5
*/

public class LinkedQueue01Test extends TestCase{
	public LinkedQueue01Test (String testName){
		super(testName);
	}
	public void testLinkedQueue() throws Exception{
		LinkedQueue01 myQueue = new LinkedQueue01();
		myQueue.add(new Integer(8));
		myQueue.add(new Integer(7));
		myQueue.add(new Integer(6));
		
		System.out.println("myQueue.size()="+myQueue.size());
		myQueue.remove();
		System.out.println("myQueue.size()="+myQueue.size());
		System.out.println("myQueue.front()="+myQueue.front());
	}
}