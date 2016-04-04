package com.jun.linkedstack;

import java.util.*;

/**
*@author jun
*@version 1.0
*@date 2016/4/4
*/

public class LinkedStack01{
	private Node top = null;
	private int numberElements = 0;
	/**
	*@param 存储的数据
	*@return 无
	*/
	public void push(Object item){
		Node newNode = new Node(item,top);
		top=newNode;
		numberElements++;
	}
	/**
	*@exception NoSuchElementException
	*/
	public void pop(){
		if(isEmpty()){
			throw new NoSuchElementException("Stack is Empty");
		}else{
			Node oldNode = top;
			top=top.next;
			numberElements--;
			oldNode=null;
		}
	}
	
	public void makeEmpty(){
		while(top!=null){
			Node previous = top;
			top=top.next;
			previous=null;
		}
		numberElements=0;
	}
	
	/**
	*@return 栈顶元素
	*@exception NoSuchElementException
	*/
	public Object top(){
		if(isEmpty()){
			throw new NoSuchElementException("Stack is empty");
		}else{
			return top.item;
		}
	}
	/**
	*@return 布尔值
	*/
	public boolean isEmpty(){
		return top==null;
	}
	
	/**
	*@return 栈大小
	*/
	public int size(){
		return numberElements;
	}
	
	private class Node{
		private Object item;
		private Node next;
		
		private Node(Object item,Node next){
			this.item = item;
			this.next = next;
		}
	}
	
}