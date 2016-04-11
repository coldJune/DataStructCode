package com.jun.list.orderlist;

import java.util.*;

/**
*@author jun
*@version 1.0
*@date 2016/4/11
*/

public class OrderList01{
	private Node first;
	private int numberElements;
	
	/**
	*删除所链表中有对象
	*/
	public void makeEmpty(){
		while(first!=null){
			Node previous = first;
			first=first.next;
			previous=null;
		}
		numberElements=0;
	}
	
	/**
	*向链表中加入对象，必须是可排序的
	*@param obj 加入的对象
	*@exception NoSuchElementException
	*/
	public void add(Comparable obj){
		if(isEmpty()){
			first=new Node(obj,null);
		}else{
			Node current = first;
			Node previous = null;
			if(current.item.compareTo(obj)==0){
				throw new NoSuchElementException("add:obj already in list");
			}
			while(current!=null&&current.item.compareTo(obj)<0){
				previous = current;
				if(current.item.compareTo(obj)==0){
					throw new NoSuchElementException("add:obj already in list");
				}
				current = current.next;
			}
			
			Node newNode= new Node(obj,current);
			if(previous!=null){
				previous.next=newNode;
			}else{
				first=newNode;
			}
		}
		numberElements++;
	}
	
	/**
	*删除找到的对象
	*@param obj 要删除的对象
	*/
	public void remove(Comparable obj){
		Node previous = first;
		Node current = first;
		if(!contains(obj)){
			throw new NoSuchElementException("remove:obj is not in list");
		}else{
			if(current!=first){
				while(current!=null){
					if(current.item.equals(obj)){
						previous.next=current.next;
						break;
					}
					previous=current;
					current=current.next;
				}
			}else{
				first=current.next;
			}
			numberElements--;
		}
	}
	
	/**
	*链表是否为空
	*/
	public boolean isEmpty(){
		return numberElements==0;
	}
	
	/**
	*链表包含的对象个数
	*/
	public int size(){
		return numberElements;
	}
	
	/**
	*所查找对象是否在链表中
	*/
	
	public boolean contains(Comparable obj){
		Node current = first;
		
		while(current!=null&&current.item.compareTo(obj)!=0){
			current=current.next;
		}
		return current!=null;
	}
	
	/**
	*返回链表的迭代器
	*/
	public Iterator elements(){
		Vector v = new Vector();
		Node current = first;
		while(current!=null){
			v.addElement(current.item);
			current=current.next;
		}
		return v.iterator();
	}

	
	private class Node{
		private Node next;
		private Comparable item;
		
		private Node(Comparable item,Node next){
			this.item=item;
			this.next=next;
		}
	}
}