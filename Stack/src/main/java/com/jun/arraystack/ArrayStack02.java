package com.jun.arraystack;

import java.util.*;

/**
*@author jun
*@version 2.0
*@date 2016/4/11
*/

public class ArrayStack02{
	private int capacity = 101;
	private Object[] data;
	private int top=0;
	
	public ArrayStack02(){
		this(101);
	}
	
	public ArrayStack02(int capacity){
		this.capacity=capacity;
		data = new Object[capacity+1];
	}
	/**
	*将对象压入栈中
	*/
	public void push(Object item){
		top++;
		try{
			data[top]=item;
		}catch(ArrayIndexOutOfBoundsException e){
			top--;
			throw new ArrayIndexOutOfBoundsException("stack capacity exceed");
		}
	}
	
	/**
	*将对象弹出栈外
	*/
	public void pop(){
		if(isEmpty()){
			throw new NoSuchElementException("stack is empty");
		}else{
			data[top]=null;
			top--;
		}
	}
	
	/**
	*判断栈是否为空
	*/
	public boolean isEmpty(){
		return top==0;
	}
	
	/**
	*清空栈
	*/
	public void makeEmpty(){
		top=0;
	}
	
	/**
	*返回栈顶对象
	*/
	public Object top(){
		if(isEmpty()){
			throw new NoSuchElementException("stack is empty");
		}else{
			return data[top];
		}
	}
	
	/**
	*返回栈的大小
	*/
	
	public int size(){
		return top;
	}
}