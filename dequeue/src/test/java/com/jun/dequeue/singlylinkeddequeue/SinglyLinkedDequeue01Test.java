package com.jun.dequeue.singlylinkeddequeue;

import com.jun.dequeue.singlylinkeddequeue.*;

import java.util.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
*@author jun
*@version 1.0
*@date 2016/4/7
*/

public class SinglyLinkedDequeue01Test extends TestCase{
	public SinglyLinkedDequeue01Test(String testName){
		super(testName);
	}
	
	public void testSinglylinkedDequeue01() throws Exception{
		SinglyLinkedDequeue01 myDequeue = new SinglyLinkedDequeue01();
		
		myDequeue.addFront(new Integer(3));//3
		myDequeue.addFront(new Integer(2));//2 3
		myDequeue.addFront(new Integer(1));//1 2 3
		
		myDequeue.addRear(new Integer(4));//1 2 3 4 
		myDequeue.addRear(new Integer(5));//1 2 3 4 5
		myDequeue.addRear(new Integer(6));//1 2 3 4 5 6
		
		myDequeue.removeFront();//2 3 4 5 6 
		Iterator iter = myDequeue.elements();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		
		myDequeue.removeRear();//2 3 4 5
		iter = myDequeue.elements();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		
		if(myDequeue.contains(new Integer(5))){
			System.out.println("5 is in the Dequeue");
		}else{
			System.out.println("5 is not in the Dequeue");
		}
		
		if(myDequeue.contains(new Integer(9))){
			System.out.println("9 is in the Dequeue");
		}else{
			System.out.println("9 is not in the Dequeue");
		}
	}
}