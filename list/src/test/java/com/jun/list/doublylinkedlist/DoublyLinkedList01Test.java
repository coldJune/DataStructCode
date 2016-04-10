package com.jun.list.doublylinkedlist;

import com.jun.list.doublylinkedlist.*;

import java.util.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
*@author jun
*@version 1.0
*@date 2016/4/10
*/

public class DoublyLinkedList01Test extends TestCase{
	public DoublyLinkedList01Test(String testName){
		super(testName);
	}
	
	public void testDoublyLinkedList()throws Exception{
		DoublyLinkedList01 myList= new DoublyLinkedList01();
		myList.addFront(new Integer(3));//3
		myList.addFront(new Integer(2));//2 3
		myList.addFront(new Integer(1));//1 2 3 
		myList.addRear(new Integer(4));//1 2 3 4
		myList.addRear(new Integer(5));//1 2 3 4 5 
		myList.addRear(new Integer(6));//1 2 3 4 5 6
		
		Iterator iter = myList.elements();
		
		System.out.print("---------------------------------");
		System.out.println();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.print("---------------------------------");
		System.out.println();
		System.out.println();
		
		myList.addAfter(new Integer(7),new Integer(6));
		iter=myList.elements();
		System.out.print("--------------ADDAFTERLAST(1 2 3 4 5 6 7 )-------------------");
		System.out.println();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.print("---------------------------------");
		System.out.println();
		System.out.println();
		
		myList.addAfter(new Integer(8),new Integer(4));
		iter=myList.elements();
		System.out.print("--------------ADDAFTERMID 1 2 3 4 8 5 6 7 )-------------------");
		System.out.println();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.print("---------------------------------");
		System.out.println();
		System.out.println();
		
		myList.addBefore(new Integer(8),new Integer(4));
		iter=myList.elements();
		System.out.print("--------------ADDBEFOREMID 1 2 3 8 4 8 5 6 7 )-------------------");
		System.out.println();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.print("---------------------------------");
		System.out.println();
		System.out.println();
		
		myList.addBefore(new Integer(9),new Integer(1));
		iter=myList.elements();
		System.out.print("--------------ADDBEFOREFIRST 9 1 2 3 8 4 8 5 6 7 )-------------------");
		System.out.println();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.print("---------------------------------");
		System.out.println();
		System.out.println();
		
		System.out.print("--------------REMOVEBEFOREFIRST 9 1 2 3 8 4 8 5 6 7 )-------------------");
		try{
		myList.removeBefore(new Integer(9));
		}catch(Exception e){
			
		}
		iter=myList.elements();
		System.out.println();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.print("---------------------------------");
		System.out.println();
		System.out.println();
	
		System.out.print("--------------REMOVEBEFOREMID 1 2 3 8 4 8 5 6 7 )-------------------");
		myList.removeBefore(new Integer(1));
		iter=myList.elements();
		System.out.println();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.print("---------------------------------");
		System.out.println();
		System.out.println();
		
		System.out.print("--------------REMOVEAFTERMID 1 2 8 4 8 5 6 7 )-------------------");
		try{
		myList.removeAfter(new Integer(2));
		}catch(Exception e){
			
		}
		iter=myList.elements();
		System.out.println();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.print("---------------------------------");
		System.out.println();
		System.out.println();
		
		System.out.print("--------------REMOVEAFTERLAST 1 2 8 4 8 5 6 7 )-------------------");
		try{
		myList.removeAfter(new Integer(7));
		}catch(Exception e){
			
		}
		iter=myList.elements();
		System.out.println();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.print("---------------------------------");
		System.out.println();
		System.out.println();
	}
}