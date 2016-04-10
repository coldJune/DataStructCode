package com.jun.list.singlylinkedlist;

import java.util.*;

/**
*@author jun
*@version 1.0
*@date 2016/4/10
*/

public class SinglyLinkedList01{
	private Node front,rear;
	private int numberElements;
	
	/**
	*从链表头开始添加元素
	*@param 加入的元素
	*/
	public void addFront(Object obj){
		Node newNode = new Node(obj,front);
		front=newNode;
		if(numberElements==0){
			rear=front;
		}
		numberElements++;
	}
	
	/**
	*从链表尾开始添加元素
	*@param 加入的元素
	*/
	public void addRear(Object obj){
		Node newNode = new Node(obj,null);
		if(numberElements==0){
			front = newNode;
			rear=newNode;
		}else{
			rear.next=newNode;
			rear=newNode;
		}
		numberElements++;
	}
	
	/**
	*在目标位置之前插入元素
	*@param item 加入的元素
	*@param target 元素位置
	*@exception NoSuchElementException
	*/
	public void addAfter(Object item,Object target){
		Node itemNode = getNode(target);
		if(itemNode==null){
			throw new NoSuchElementException("addAfter:target does not exist");
		}else{
			Node newNode = new Node(item,itemNode.next);
			itemNode.next=newNode;
			numberElements++;
			if(this.rear==itemNode){
				rear=newNode;
			}
		}
	}
	/**
	*在目标位置之前插入元素
	*@param item 加入的元素
	*@param target 元素位置
	*@exception NoSuchElementException
	*/
	public void addBefore(Object item,Object target){
		Node itemNode = getNode(target);
		if(itemNode==null){
			throw new NoSuchElementException("addBefore:target does not exist");
		}else{
			Node newNode = new Node(item,itemNode);
			if(this.front==itemNode){
				this.front=newNode;
			}else{
				Node beforeNode = nodeBefore(itemNode);
				beforeNode.next=newNode;
			}
			numberElements++;
		}
	}
	/**
	*删除目标位置之后一个的元素
	*@param 目标位置
	*@exception NoSuchElementException
	*/
	
	public void removeAfter(Object target){
		Node itemNode = getNode(target);
		if(itemNode==null){
			throw new NoSuchElementException("removeAfter:target does not exist");
		}else if(itemNode==rear){
			throw new NoSuchElementException("removeAfter:target is the last");
		}else{
			itemNode.next=itemNode.next.next;
			numberElements--;
		}
	}
	
	/**
	*删除目标位置之前的一个元素
	*@param 目标位置
	*@exception NoSuchElementException
	*/
	
	public void removeBefore(Object target){
		Node itemNode = getNode(target);
		Node beforeNode = nodeBefore(itemNode);
		if(itemNode == null){
			throw new NoSuchElementException("removeBefore:target does not exist");
		}else if(itemNode==front){
			throw new NoSuchElementException("removeBefore:target is the first");
		}else if(beforeNode==front){
			front=itemNode;
			beforeNode=null;
			numberElements--;
		}else{
			Node bbeforeNode = nodeBefore(beforeNode);
			bbeforeNode.next=itemNode;
			beforeNode=null;
			numberElements--;
		}
	}
	
	/**
	*打印目标元素之后的元素
	*@param 目标元素
	*@exception NoSuchElementException
	*@return 找到的元素
	*/
	public Object elementAfter(Object target){
		Node targetNode = getNode(target);
		if(!this.contains(target)||targetNode==this.rear){
			throw new NoSuchElementException("elementAfter:target does not exist or is last in list");
		}else{
			return targetNode.next.item;
		}
	}
	
	/**
	*打印目标元素之前的元素
	*@param 目标元素
	*@exception NoSuchElementException
	*@return 找到的元素
	*/
	
	public Object elementBefore(Object target){
		Node targetNode = getNode(target);
		if(!this.contains(target)||targetNode==this.front){
			throw new NoSuchElementException("elementBefore:target does not exist or is first in list");
		}else{
			return nodeBefore(targetNode).item;
		}
	}
	
	/**
	*在链表中找到对应的元素
	*@param 目标元素
	*@return 找的的元素
	*/
	
	protected Node getNode(Object target){
		Node frontNode = front;
		Node result=null;
		while(frontNode!=null){
			if(frontNode.item.equals(target)){
				result=frontNode;
				break;
			}
			frontNode = frontNode.next;
		}
		return result;
	}
	
	/**
	*在链表中找到目标元素之前的元素
	*@param 目标元素
	*@return 找到的元素
	*/
	
	protected Node nodeBefore(Node targetNode){
		if(targetNode!=null&&targetNode!=front){
			Node previous = front;
			while(previous.next!=targetNode){
				previous=previous.next;
			}
			return previous;
		}else{
			return null;
		}
	}
	
	/**
	*查找目标元素是否在链表中
	*@param 目标元素
	*@return 判断结果
	*/
	
	public boolean contains(Object obj){
		Node current = front;
		while(current!=null&&!current.item.equals(obj)){
			current=current.next;
		}
		return current!=null;
		
	}
	/**
	*显示出链表中所有元素
	*@元素的迭代器
	*/
	
	public Iterator elements(){
		Vector v = new Vector();
		Node current = front;
		while(current!=null){
			v.addElement(current.item);
			current=current.next;
		}
		return v.iterator();
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