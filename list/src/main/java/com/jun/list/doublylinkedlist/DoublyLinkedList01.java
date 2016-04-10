package com.jun.list.doublylinkedlist;

import java.util.*;

/**
*@author jun
*@version 1.0
*@date 2016/4/10
*/

public class DoublyLinkedList01{
	private Node front,rear;
	private int numberElements;
	
	/**
	*在列表头加入元素
	*@param 加入的元素
	*/
	public void addFront(Object item){
		Node newNode = new Node(item,null,front);
		if(numberElements==0){
			front=newNode;
			rear=front;
		}else{
			front.before=newNode;
			front=newNode;
		}
		numberElements++;
	}
	/**
	*在链表尾加入元素
	*@param 加入的元素
	*/
	public void addRear(Object item){
		Node newNode = new Node(item,null,null);
		if(numberElements==0){
			front=newNode;
			rear=newNode;
		}else{
			rear.next=newNode;
			newNode.before=rear;
			rear=newNode;
		}
		numberElements++;
	}
	
	/**
	*在目标元素之后插入
	*@param item 插入的元素值
	*@param target 目标元素
	*@exception NoSuchElementException
	*/
	public void addAfter(Object item,Object target){
		Node itemNode = getNode(target);
		if(itemNode==null){
			throw new NoSuchElementException("addAfter:target does not exist");
		}else{
			Node newNode = new Node(item,itemNode,itemNode.next);
			if(itemNode.next!=null){
				itemNode.next.before=newNode;
			}else{
				rear=newNode;
			}
			itemNode.next=newNode;
			numberElements++;
		}
	}
	/**
	*在目标元素之前插入元素
	*@param item 插入的元素值
	*@param target 目标元素
	*@exception NoSuchElementException
	*/
	
	public void addBefore(Object item,Object target){
		Node itemNode=getNode(target);
		if(itemNode==null){
			throw new NoSuchElementException("addAfter:target does not exist");
		}else{
			Node beforeNode = itemNode.before;
			Node newNode = new Node(item,beforeNode,itemNode);
			if(front==itemNode){
				newNode.next=itemNode;
				itemNode.before=newNode;
				front=newNode;
			}else{
				beforeNode.next=newNode;
				itemNode.before=newNode;
			}
			numberElements++;
		}
	}
	
	/**
	*删除目标元素之后的节点
	*@param 目标元素
	*@exception NoSuchElementException
	*/
	public void removeAfter(Object target){
		Node itemNode = getNode(target);
		if(itemNode==null||itemNode.next==null){
			throw new NoSuchElementException("removeAfter:target does not exist or is last in list");
		}else{
			Node aafterNode = itemNode.next.next;
			itemNode.next=aafterNode;
			aafterNode.before=itemNode;
			numberElements--;
		}
	}
	
	/**
	*删除目标元素之前的节点
	*@param 目标元素
	*@exception NoSuchElementException
	*/
	public void removeBefore(Object target){
		
		Node itemNode = getNode(target);
		if(itemNode==null||itemNode.before==null){
			throw new NoSuchElementException("removeBefore:target does not exist or is first in list");
		}else if(itemNode.before==front){
			front = itemNode;
			numberElements--;
		}else{
			Node beforeNode = itemNode.before;
			Node bbeforeNode = beforeNode.before;
			bbeforeNode.next=itemNode;
			itemNode.before=bbeforeNode;
			beforeNode=null;
			numberElements--;
		}
	}
	/**
	*找到目标元素对应节点
	*@param 目标元素
	*@return 目标节点
	*/
	
	protected Node getNode(Object target){
		Node current = front;
		Node result=null;
		while(current!=null){
			if(current.item.equals(target)){
				result=current;
				break;
			}
			current=current.next;
		}
		return result;
	}
	/**
	*将链表元素放入一个迭代器
	*@return 一个迭代器
	*/
	
	public Iterator elements(){
		Vector v = new Vector();
		Node current= front;
		while(current!=null){
			v.addElement(current.item);
			current=current.next;
		}
		return v.iterator();
	}
	private class Node{
		private Node before,next;
		private Object item;
		private Node(Object item,Node before,Node next){
			this.item=item;
			this.before=before;
			this.next=next;
		}
	}
}