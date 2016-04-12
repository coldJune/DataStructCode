package com.jun.queue.arrayqueue;

import com.jun.queue.arrayqueue.*;

import java.util.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
*@author jun
*@version 2.0
*@date 2016/4/12
*/

public class ArrayQueue02Test extends TestCase{
	public ArrayQueue02Test(String testName){
		super(testName);
	}
	
	public void testArrayQueue() throws Exception{
		ArrayQueue02 myQueue = new ArrayQueue02(10);
		Iterator iter =null;
		for(int i=0;i<10;i++){
			myQueue.add(i);
		}
		
		System.out.println("------------add【(front)0 1 2 3 4 5 6 7 8 9】---------");
		iter=myQueue.elements();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------");
		
		System.out.println("------------remove【(front)1 2 3 4 5 6 7 8 9】---------");
		myQueue.remove();
		iter=myQueue.elements();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.println("---------------------size(9)----------------------------");
		System.out.println(myQueue.size());
		System.out.println("---------------------front(1)----------------------------");
		System.out.println(myQueue.front());
		System.out.println("-----------------------------------------------------");
	}
}