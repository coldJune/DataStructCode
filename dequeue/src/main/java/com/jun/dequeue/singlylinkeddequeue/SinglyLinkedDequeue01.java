package com.jun.dequeue.singlylinkeddequeue;

import java.util.*;

/**
*@author jun
*@version 1.0
*@date 2016/4/7
*/

public class SinglyLinkedDequeue01{
	private Node front,rear;
	private int numberElements;
	
	public void makeEmpty(){
		while(front!=null){
			Node previous =front;
			front=front.next;
			previous=null;
		}
		numberElements=0;
		rear = null;
	}
	/*
	*@param 加入列表头的元素
	*/
	public void addFront(Object item){
		Node newNode = new Node(item,front);
		front = newNode;
		if(numberElements==0){
			rear=front;
		}
		numberElements++;
	}
	
	/**
	*@param  加入列表尾的元素
	*/
	
	public void addRear(Object item){
		Node newNode = new Node(item,null);
		if(numberElements==0){
			front=newNode;
			rear=newNode;
		}else{
			rear.next=newNode;
			rear=newNode;
		}
		numberElements++;
	}
	
	/**
	*@exception NoSuchElementException
	*/
	public void removeFront(){
		if(isEmpty()){
			throw new NoSuchElementException("Dequeue is empty");
		}else{
			front=front.next;
			numberElements--;
			if(numberElements==0){
				rear=null;
			}
		}
	}
	
	/**
	*@exception NoSuchElementException
	*/
	
	public void removeRear(){
		if(isEmpty()){
			throw new NoSuchElementException("Dequeu is empty");
		}else if(numberElements==1){
			front=null;
			rear=null;
		}else{
			Node previous = front;
			while(previous.next!=rear){
				previous=previous.next;
			}
			previous.next=null;
			rear=previous;
		}
		numberElements--;
	}
	/**
	*@return 是否为空
	*/
	public boolean isEmpty(){
		return numberElements==0;
	}
	
	/**
	*@return 列表元素个数
	*/
	public int size(){
		return numberElements;
	}
	/**
	*@return 列表头元素
	*@exception NoSuchElementException
	*/
	public Object front(){
		if(isEmpty()){
			throw new NoSuchElementException("Dequeue is empty");
		}else{
			return front.item;
		}
	}
	
	/**
	*@return 列表尾元素
	*@exception NoSuchElementException
	*/
	
	public Object rear(){
		if(isEmpty()){
			throw new NoSuchElementException("Dequeue is empty");
		}else{
			return rear.item;
		}
	}
	
	/**
	*@param 查找元素
	*@return  param是否在列表中
	*/
	
	public boolean contains(Object obj){
		Node current = front;
		while(current!=null&&!current.item.equals(obj)){
			current=current.next;
		}
		return current!=null;
	}
	
	/**
	*@return 元素迭代器
	*/
	
	public Iterator elements(){
		Node current=front;
		Vector v = new Vector();
		while(current!=null){
			v.addElement(current.item);
			current=current.next;
		}
		return v.iterator();
	}
	
	private class Node {
		private Object item;
		private Node next;
		
		public Node(Object item,Node next){
			this.item = item;
			this.next=next;
		}
	}
	
}