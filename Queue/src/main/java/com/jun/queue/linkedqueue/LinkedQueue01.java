package com.jun.queue.linkedqueue;

import java.util.*;
/**
*@author jun
*@version 1.0
*@date 2016/4/5
*/

public class LinkedQueue01{
	private Node first = null;
	private int numberElements = 0;
	
	/*
	*@param 加入队列的数据
	*@return 无
	*/
	
	public void add(Object item){
		Node newNode;
		if(numberElements==0){
			newNode = new Node(item,null);
			first = newNode;
		}else{
			Node currentNode = first;
			Node previousNode = null;
			while(currentNode!=null){
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			newNode = new Node(item,null);
			previousNode.next=newNode;
		}
		numberElements++;
	}
	
	public void remove(){
		if(isEmpty()){
			throw new NoSuchElementException("Queue is empty");
		}else{
			Node oldNode = first;
			first = first.next;
			numberElements--;
			oldNode = null;
		}
	}
	public void makeEmpty(){
		while(first!=null){
			Node previous = first;
			first = first.next;
			previous=null;
		}
		numberElements=0;
	}
	/**
	*@return 队头元素
	*/
	public Object front(){
		if(isEmpty()){
			throw new NoSuchElementException("Queue is empty");
		}else{
			return first.item;
		}
	}
	/**
	*@return 是否为空
	*/
	public boolean isEmpty(){
		return first==null;
	}
	
	/**
	*@return 队列大小
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