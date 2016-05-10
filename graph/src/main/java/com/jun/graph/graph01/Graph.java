package com.jun.graph.graph01;

import java.util.*;

/**
*@author jun
*@date 2016/5/10
*@version 1.0
*/


public class Graph {
	private int num;//存储节点的长度
	private boolean[] isVisited;//布尔数组标记当前节点是否已经访问过
	private String[] ver;//存储节点的关键字
	private int[][] edge;//二维数组存储节点之间边的信息的列表
	
	public void setVer(String[] ver,int num){
		this.ver=ver;
		this.num=num;
	}
	
	/**
	*初始化边
	*/
	
	public void initEdge(){
		edge=new int[num][num];
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				edge[i][j]=0;
			}
		}
	}
	/**
	*图的深度优先遍历
	*/
	public void dfsTraverse(){
		//将所有节点标记为未访问
		isVisited=new boolean[num];
		for(int i=0;i<num;i++){
			if(isVisited[i]==false){
				dfs(i);
			}
		}
	}
	private void dfs(int i){
		isVisited[i]=true;
		System.out.print(ver[i]+" ");
		for(int j=0;j<num;j++){
			if(isVisited[j]==false&&edge[i][j]==1){
				dfs(j);
			}
		}
	}
	
	/**
	*图的广度优先遍历
	*/
	public void bfsTraverse(){
		isVisited=new boolean[num];	//标记所有节点均为被访问
		Queue<Integer> queue=new LinkedList<Integer>();//存储节点的队列
		for(int i=0;i<num;i++){				//访问节点
			if(isVisited[i]==false){
				isVisited[i]=true;
				System.out.print(ver[i]+" ");
				queue.add(i);
				while(!queue.isEmpty()){
					int j=queue.poll();
					for(int k=0;k<num;k++){
						if(edge[j][k]==1&&isVisited[k]==false){
							isVisited[k]=true;
							System.out.print(ver[k]+" ");
							queue.add(k);
						}
					}
				}
			}
		}
	}
	
	/**
	*将边的信息列表构造成一个完整的边信息列表
	*/
	
	public void addEdge(int i,int j){
		if(i==j){
			return;
		}
		edge[i][j]=1;
		edge[j][i]=1;
	}
}