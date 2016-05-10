package com.jun.tree.binarysearchtree01test;

import com.jun.tree.binarysearchtree01.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
*@author jun
*@date 2016/5/10
*@version 1.0
*/

public class BinarySearchTreeTest extends TestCase{
	public BinarySearchTreeTest(String testName){
		super(testName);
	}
	public void testBinarySearchTree() throws Exception{
		BinarySearchTree T = new BinarySearchTree();
		
		T.insert("BenDan");
		T.insert("GuaiGuai");
		T.insert("Wang");
		T.insert("Jun");
		T.insert("Si");
		T.insert("Xiao");
		T.insert("Xun");
		T.insert("Deng");
		T.insert("Ni");
		T.insert("Sha");
		T.insert("Hei");
		T.insert("Ai");
		T.insert("Xiang");
		
		System.out.println("------------打印构造的树----------");
		T.print();
		System.out.println();
		
		System.out.println("------------搜索Xun----------");
		TreeNode N =T.find("Xun");
		System.out.print("找到Xun"+N.key);
		System.out.println();
		
		System.out.println("------------搜索关键字不在树中----------");
		TreeNode P = T.find("Gua");
		if(P!=null){
			System.out.print("找到Gua"+P.key);
		}else{
			System.out.print("未找到Gua");
		}
		System.out.println();
	}
}