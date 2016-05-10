package com.jun.tree.binarysearchtree01;
/**
*定义接口
*/
interface ComparisonKey{
	//如果k1和k2是ComparisonKey,那么根据k1==k2,k1>k2,k1<k2
	//k1.compareTo(k2)的结果为0,1，-1，其顺序是由compareTo
	//方法定义为
	int compareTo(ComparisonKey value);
	
	//将元素转化为可打印的串
	String toString();
}