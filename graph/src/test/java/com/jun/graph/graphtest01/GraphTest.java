package com.jun.graph.graphtest01;

import com.jun.graph.graph01.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
*@author jun
*@date 2016/5/10
*@version 1.0
*/

public class GraphTest extends TestCase{
	public GraphTest(String testName){
		super(testName);
	}
	
	public void testGraph() throws Exception{
		String[] ver ={"A","B","C","D","E"};
		int num=ver.length;
		Graph g = new Graph();
		g.setVer(ver,num);
		g.initEdge();
		g.addEdge(0,3);
		g.addEdge(0,4);
		g.addEdge(1,2);
		g.addEdge(2,4);
		g.addEdge(2,3);
		
		System.out.println("-------------图的深度优先遍历-----------------");
		g.dfsTraverse();
		System.out.println();
		
		System.out.println("-------------图的广度优先遍历-----------------");
		g.bfsTraverse();
		System.out.println();
		
	}
}