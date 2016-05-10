package com.jun.tree.binarysearchtree01;

import com.jun.tree.binarysearchtree01.*;
import java.util.*;

/**
*@author jun
*@date 2016/5/10
*@version 1.0
*/
public class BinarySearchTree{
	//指向二叉树根节点
	private TreeNode rootNode;
	
	/**
	*插入一个元素
	*@param T 插入的树
	*@param K 插入的元素值
	*@return 返回这棵树
	*/
	private TreeNode insertKey(TreeNode T,ComparisonKey K){
		if(T==null){
			TreeNode N=new TreeNode();		//构建一棵新的树
			N.key=K;					//将其key设为K
			return N;
		}else{
			if(K.compareTo(T.key)<0){	//如果K小于T的key，那么将
				T.llink=insertKey(T.llink,K);//K插入T的左子树
				return T;
			}else{
				T.rlink=insertKey(T.rlink,K);//否则插入右子树
				return T;
			}
		}
	}
	/**
	*执行真正的插入操作
	*/
	public void insert(ComparisonKey K){
		rootNode = insertKey(rootNode,K);
	}
	
	public void insert(String K){
		rootNode = insertKey(rootNode,new StringKey(K));
	}
	
	/**
	*查找树中的值
	*@param K 要查找的值
	*/
	public TreeNode find(ComparisonKey K){
		TreeNode T = rootNode;
		int result;
		while(T!=null){
			if((result=K.compareTo(T.key))<0){
				T=T.llink;
			}else if(result>0){
				T=T.rlink;
			}else{
				return T;
			}
		}
		return T;
	}
	
	public TreeNode find(String K){
		return find(new StringKey(K));
	}
	
	/**
	*打印出这棵树
	*/
	
	private void printNode(TreeNode T){
		if(T!=null){
			System.out.print("(");
			printNode(T.llink);
			System.out.print(" "+T.key+" ");
			printNode(T.rlink);
			System.out.print(")");
		}
	}
	
	public void print(){
		printNode(rootNode);
		System.out.println();
	}
	
}