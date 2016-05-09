package com.jun.tree.priorityqueue01;
import com.jun.tree.priorityqueue01.*;

public class PQItem implements ComparisonKey{
	private int key;
	public PQItem(int value){
		this.key=value;
	}
	
	public String toString(){
		return Integer.toString(key);
	}
	
	public int compareTo(ComparisonKey value){
		int a =this.key;
		int b = ((PQItem)value).key;
		return ((a==b)?0:((a>b)?1:-1));
	}
	
}