package com.jun.tree.binarysearchtree01;

import com.jun.tree.binarysearchtree01.*;
/**
*实现字符串接口
*/
class StringKey implements ComparisonKey{
	//key数据域中为key值的字符串
	private String key;
	
	//只有一个字符串的构造函数将key设为它的参数
	StringKey(String value){
		this.key=value;
	}
	
	public String toString(){
		return key;
	}
	
	public int compareTo(ComparisonKey value){
		String a = this.key;
		String b = ((StringKey)value).key;
		return a.compareTo(b);
	}
}