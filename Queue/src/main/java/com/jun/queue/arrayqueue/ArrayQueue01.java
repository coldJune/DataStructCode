package com.jun.queue.arrayqueue;

import java.util.*;

/**
*@author jun
*@version 1.0
*@date 2016/4/6
*/

public class ArrayQueue01{
	private int capacity = 101; //默认队列大小
	private Object[] data;//队列数组
	private int numberElements=0;//队列元素个数
	
	public ArrayQueue01(){
		this(101);
	}
	
	public ArrayQueue01(int capacity){
		this.capacity=capacity;
		data = new Object[capacity+1];
	}
	/**
	*@param 入队数据
	*/
	public void add(Object item){
		numberElements++;
		try{
			data[numberElements]=item;
		}catch(ArrayIndexOutOfBoundsException e){
			numberElements--;
			throw new ArrayIndexOutOfBoundsException("queue capacity exceeded");
		}
	}
	
	public void remove(){
		if(isEmpty()){
			throw new NoSuchElementException("queue is empty");
		}else{
			for(int i=1;i<numberElements;i++){
				data[i]=data[i+1];
			}
			data[numberElements]=null;
			numberElements--;
		}
	}
	
	public void makeEmpty(){
		for(int i=0;i<numberElements+1;i++){
			data[i]=null;
		}
		numberElements=0;
	}
	
	/**
	*@return 队头元素
	*/
	public Object front(){
		if(isEmpty()){
			throw new NoSuchElementException("queue is empty");
		}else{
			return data[1];
		}
	}
	
	/**
	*@return  队列是否为空
	*/
	public boolean isEmpty(){
		return numberElements==0;
	}
	
	/**
	*@return 队列大小
	*/
	public int size(){
		return numberElements;
	}
}