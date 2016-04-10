package com.jun.list.singlylinkedlist;

import com.jun.list.singlylinkedlist.*;

import java.util.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SinglyLinkedList01Test extends TestCase{
	public SinglyLinkedList01Test(String testName){
		super(testName);
	}
	
	public void testSinglyLinkedList(){
		SinglyLinkedList01 myList = new SinglyLinkedList01();
		myList.addFront(new Integer(1));//1
		myList.addFront(new Integer(2));//2 1
		myList.addFront(new Integer(3));//3 2 1
		myList.addRear(new Integer(4));//3 2 1 4
		myList.addRear(new Integer(5));//3 2 1 4 5
		myList.addRear(new Integer(6));//3 2 1 4 5 6
		myList.addRear(new Integer(7));//3 2 1 4 5 6 7
		
		Iterator iter = myList.elements();
		System.out.print("------------------------------------------------------------");
		System.out.println();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.print("------------------------------------------------------------");
		System.out.println();
		
		System.out.print("---------------------ADDBEFOREMID(3 2 1 4 5 5 6 7)-----------------------------------");
		System.out.println();
		myList.addBefore(new Integer(5),new Integer(6));
		iter = myList.elements();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.print("------------------------------------------------------------");
		System.out.println();//3 2 1 4 5 5 6 7;
		
		System.out.print("---------------------ADDBEFOREFIRST(5 3 2 1 4 5 5 6 7)-----------------------------------");
		System.out.println();
		myList.addBefore(new Integer(5),new Integer(3));
		iter = myList.elements();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.print("------------------------------------------------------------");
		System.out.println();//5 3 2 1 4 5 5 6 7;
		
		System.out.print("---------------------ADDAFTERMID(5 3 9 2 1 4 5 5 6 7)-----------------------------------");
		System.out.println();
		myList.addAfter(new Integer(9),new Integer(3));
		iter = myList.elements();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.print("------------------------------------------------------------");
		System.out.println();//5 3 9 2 1 4 5 5 6 7;
		
		System.out.print("---------------------ADDAFTERLAST(5 3 9 2 1 4 5 5 6 7 8)-----------------------------------");
		System.out.println();
		myList.addAfter(new Integer(8),new Integer(7));
		iter = myList.elements();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.print("------------------------------------------------------------");
		System.out.println();//5 3 9 2 1 4 5 5 6 7 8;
		
		System.out.print("---------------------REMOVEBEFIREMID(5 3 9 2 1 4 5 5 6 8)-----------------------------------");
		System.out.println();
		myList.removeBefore(new Integer(8));
		iter = myList.elements();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.print("------------------------------------------------------------");
		System.out.println();//5 3 9 2 1 4 5 5 6 8
		
		System.out.print("---------------------REMOVEBEFOREFIRST(error)-----------------------------------");
		System.out.println();
		try{
		myList.removeBefore(new Integer(5));
		}catch(NoSuchElementException e){
			e.printStackTrace();
		}
		iter = myList.elements();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.print("------------------------------------------------------------");
		System.out.println();
		
		System.out.print("---------------------REMOVEAFTERMID(5 3 2 1 4 5 5 6 8)-----------------------------------");
		System.out.println();
		myList.removeAfter(new Integer(3));
		iter = myList.elements();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.print("------------------------------------------------------------");
		System.out.println();//5 3 2 1 4 5 5 6 8
		
		System.out.print("---------------------REMOVEAFTERLAST(error)-----------------------------------");
		System.out.println();
		try{
		myList.removeAfter(new Integer(8));
		}catch(NoSuchElementException e){
			e.printStackTrace();
		}
		iter = myList.elements();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		System.out.print("------------------------------------------------------------");
		System.out.println();
	}
}