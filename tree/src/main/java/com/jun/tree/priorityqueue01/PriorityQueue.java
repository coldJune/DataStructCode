package com.jun.tree.priorityqueue01;

import com.jun.tree.priorityqueue01.*;
import java.util.*;

/**
*堆排序实现
*@author jun
*@date 2016/5/9
*@version 1.0 
*/

class PriorityQueue{
	private int count;//优先队列中元素的数量
	private int capacity;//可用数组位置的数量
	private int capacityIncrement;//在数组扩展过程中
	
	private ComparisonKey[] itemArray;//存放PQ元素的数组
	
	/**
	*定义无参的构造函数
	*/
	public PriorityQueue(){
		count=0;			//所存元素为capacity-1
		capacity=16;
		capacityIncrement=8;
		itemArray=new ComparisonKey[capacity];
	}
	
	/**
	*队列中的元素个数
	*@return int 元素个数
	*/
	public int size(){
		return count;
	}
	
	/**
	*插入一个元素
	*@param newItem 插入的元素值
	*@return void
	*/
	public void insert(ComparisonKey newItem){
		//如果itemArray容量不够
		//可通过capacityIncrement扩展itemArray
		if(count==capacity-1){
			capacity+=capacityIncrement;
			ComparisonKey[] tempArray = new ComparisonKey[capacity];
			for(int i=1;i<=count;i++){
				tempArray[i]=itemArray[i];
			}
			itemArray=tempArray;
		}
		
		//优先队列数量递增1，并在当前优先队列元素顺序的末端插入newItem
		count++;
		int childLoc = count;
		int parentLoc = childLoc/2;
		
		while(parentLoc!=0){//当仍存在一个父亲
			if(newItem.compareTo(itemArray[parentLoc])<=0){
				itemArray[childLoc]=newItem;
				return;
			}else{
				itemArray[childLoc]=itemArray[parentLoc];
				childLoc=parentLoc;
				parentLoc=childLoc/2;
			}
		}
		itemArray[childLoc]=newItem;
	}
	
	/**
	*删除队列中的元素
	*@return ComparisonKey 队列中删除的元素值
	*/
	public ComparisonKey remove(){
		if(count==0){		//如果优先队列为空，返回null
			return null;
		}else{			//否则返回根元素并重新堆化
			//声明
			int currentLoc;		//当前查看的位置
			int childLoc;		//currentLoc的孩子
			ComparisonKey itemToPlace;	//重定位的元素值
			ComparisonKey itemToReturn;	//返回删除的元素值
			
			//初始化
			itemToReturn = itemArray[1];//存储稍后返回的根元素
			itemToPlace = itemArray[count--];//末端叶子的元素
			currentLoc=1;					//从根开始currentLoc
			childLoc=currentLoc*2;			//从根的左孩子开始childLoc
			
			while(childLoc<=count){		//当仍然存在孩子
				//设childLoc为currentLoc的较大的孩子
				if(childLoc<count){		//如果存在右孩子
					if(itemArray[childLoc+1].compareTo(itemArray[childLoc])>0){
						childLoc++;
					}
				}
				//如果childLoc的元素大于itemToPlace
				//那么将这个较大元素移到currentLoc
				//并将currentLoc向下移
				if(itemArray[childLoc].compareTo(itemToPlace)>0){
					itemArray[currentLoc]=itemArray[childLoc];
					currentLoc=childLoc;
					childLoc=currentLoc*2;
				}else{
					itemArray[currentLoc]=itemToPlace;
					return itemToPlace;
				}
			}
			
			itemArray[currentLoc]=itemToPlace;
			return itemToReturn;
		}
	}
}