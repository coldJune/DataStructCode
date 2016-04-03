package com.jun.arraystack;

import java.util.*;
/**
*@author jun
*@version 1.0
*@date 2016/4/3
*/
public class ArrayStack01{
	private int capacity = 101;//默认大小
	private Object[] data;//放置数据
	private int top = 0;//栈顶位置
	
	public ArrayStack01(){
		this(101);
	}
	
	public ArrayStack01(int capacity){
		this.capacity = capacity;
		data = new Object[capacity+1];
	}
	/**
	*@param 压栈数据
	*@return 无
	*@exception ArrayIndexOutOfBoundsException
	*/
	public void push(Object item){
		top++;
		try{
			data[top] = item;
		}catch(ArrayIndexOutOfBoundsException e){
			top--;
			throw new ArrayIndexOutOfBoundsException("Stack capacity exceeded.");
		}
	}
	
	/**
	*@exception NoSuchElementException
	*/
	public void pop(){
		if(isEmpty()){
			throw new NoSuchElementException("Stack is empty");
		}else{
			data[top]=null;
			top--;
		}
	}
	
	public void makeEmpty(){
		top=0;
	}
	
	/**
	*@exception NoSuchElementException
	*@return 栈顶位置
	*/
	public Object top(){
		if(isEmpty()){
			throw new NoSuchElementException("Stack is empty");
		}else{
			return data[top];
		}
	}
	
	public boolean isEmpty(){
		return top==0;
	}
	
	public int size(){
		return top;
	}
}