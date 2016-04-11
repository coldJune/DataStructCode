package com.jun.list.orderlist;

import com.jun.list.orderlist.*;

import java.util.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
*@author jun
*@version 1.0
*@date 2016/4/11
*/

public class OrderList01Test extends TestCase{
	public OrderList01Test(String testName){
		super(testName);
	}
	public void testOrderList()throws Exception{
		OrderList01 myStrList = new OrderList01();
		Iterator iter = null;
		myStrList.add(new String("BenDan"));
		myStrList.add(new String("Xun"));
		myStrList.add(new String("Jun"));
		
		System.out.println("-------------ADDSTRING--------------------");
		iter = myStrList.elements();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		System.out.println("---------------------------------");

		
		
		System.out.println("-------------REMOVESTRING--------------------");
		try{
			myStrList.remove(new String("BenDan"));
		}catch(NoSuchElementException e){
			
		}
		iter = myStrList.elements();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		System.out.println("---------------------------------");
		
		OrderList01 myIntList = new OrderList01();
		myIntList.add(new Integer(2));
		myIntList.add(new Integer(4));
		myIntList.add(new Integer(1));
		myIntList.add(new Integer(5));
		
		System.out.println("-------------ADDINT--------------------");
		iter = myIntList.elements();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		System.out.println("---------------------------------");
		
		System.out.println("-------------REMOVEINT--------------------");
		myIntList.remove(new Integer(4));
		iter = myIntList.elements();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		System.out.println("---------------------------------");

	}
}