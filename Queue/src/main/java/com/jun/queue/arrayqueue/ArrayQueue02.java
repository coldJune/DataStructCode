package com.jun.queue.arrayqueue;

import java.util.*;

/**
*@author jun
*@version 2.0
*@date 2016/4/12
*/

public class ArrayQueue02{
	private int capacity = 101;
	private  Object[] data;
	private int numberElements = 0;
	
	public ArrayQueue02(){
		this(101);
	}
	
	public ArrayQueue02(int capacity){
		this.capacity=capacity;
		data = new Object[capacity+1];
	}
	/**
	*向队列中加入对象
	*@param item 加入的对象
	*@exception ArrayIndexOutOfBoundsException
	*/
	public void add(Object item){
		numberElements++;
		try{
			data[numberElements]=item;
		}catch(ArrayIndexOutOfBoundsException e){
			numberElements--;
			throw new ArrayIndexOutOfBoundsException("queue capacity exceeds");
		}
	}
	
	/**
	*删除队头对象
	*@exception NoSuchAttributeException
	*/
	
	public void remove(){
		if(isEmpty()){
			throw new NoSuchElementException("queue is empty");
		}else{
			for(int i=1;i<numberElements;i++){
				data[i]=data[i+1];
			}
			data[numberElements-1]=data[numberElements];
		}
		numberElements--;
	}
	
	/**
	*返回队列中所有对象
	*@return Iterator
	*/
	
	public Iterator elements(){
		Vector v = new Vector();
		int num = numberElements;
		for(int i = 1;i<=num;i++){
			v.addElement(data[i]);
		}
		return v.iterator();
	}
	
	/**
	*判断队列是否为空
	*@return numberElements==0
	*/
	public boolean isEmpty(){
		return numberElements==0;
	}
	
	/**
	*返回队头对象
	*@return 队头对象
	*/
	public Object front(){
		if(isEmpty()){
			throw new NoSuchElementException("queue is empty");
		}else{
			return data[1];
		}
	}
	
	/**
	*返回队列大小
	*@return 队列大小
	*/
	
	public int size(){
		return numberElements;
	}
}
