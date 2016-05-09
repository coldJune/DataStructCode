package com.jun.tree.priorityqueue01;

import com.jun.tree.priorityqueue01.*;

import java.util.*;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

/**
*@author jun
*@date 2016/5/9
*@version 1.0
*/

public class PriorityQueueTest extends TestCase{
	public PriorityQueueTest(String testName){
		super(testName);
	}
	
	public void testPriorityQueue() throws Exception{
		
		int n=10;
		ComparisonKey[] A = new ComparisonKey[n];
		for(int i=0;i<n;i++){
			A[i]=new PQItem(square(3*i-13));
			
		}
		System.out.println();
		priorityQueueSort(A);//对数组A进行排序
		for(int i = 0;i<n;i++){
			System.out.print(A[i]+",");
		}
	}
	
	public int square(int x){
		return x*x;
	}
	
	public void priorityQueueSort(ComparisonKey[] A){
		
		int i;
		int n = A.length;
		PriorityQueue PQ = new PriorityQueue();
		for(i=0;i<n;i++){
			PQ.insert(A[i]);
			
		}
		for(i=n-1;i>=0;i--){
			A[i]=PQ.remove();
		}
	}
}