package com.jun.linkedstack;

import java.util.*;

/**
*@author jun
*@version 2.0
*@date 2016/4/12
*/

public class LinkedStack02{
	private Node top=null;
	private int numberElements=0;
	
	/**
	*将对象压入栈中
	*@param item
	*/
	
	public void push(Object item){
		Node itemNode = null;
		if(numberElements==0){
			itemNode = new Node(item,null);
			top=itemNode;
		}else{
			itemNode = new Node(item,top);
			top=itemNode;
		}
		numberElements++;
	}
	
	/**
	*弹出栈顶元素
	*@exception NoSuchElementException
	*/
	
	public void pop(){
		if(isEmpty()){
			throw new NoSuchElementException("stack is empty");
		}else{
			top=top.next;
			numberElements--;
		}
	}
	
	/**
	*判断栈是否为空
	*@return boolean
	*/
	public boolean isEmpty(){
		return numberElements==0;
	}
	
	/**
	*清空栈
	*/
	public void makeEmpty(){
		while(top!=null){
			Node current=top;
			top=top.next;
			current=null;
		}
		numberElements=0;
	}
	/**
	*将栈对象放入迭代器返回
	*@return Iterator
	*/
	public Iterator elements(){
		Vector v= new Vector();
		Node current=top;
		while(current!=null){
			v.addElement(current.item);
			current=current.next;
		}
		return v.iterator();
	}
	/**
	*返回栈的大小
	*@return int 栈大小
	*/
	public int size(){
		return numberElements;
	}
	
	private class Node{
		private Node next;
		private Object item;
		private Node(Object item,Node next){
			this.item=item;
			this.next=next;
		}
	}
}