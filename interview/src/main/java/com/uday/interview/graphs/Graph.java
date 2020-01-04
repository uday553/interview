package com.uday.interview.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph<T,E> {
	Graph(boolean isDirected)
	{
		this.isDirected = isDirected; 
	}
	Boolean isDirected;
	Map<T,Set<Edge<T,E>>> graph = new HashMap<T,Set<Edge<T,E>>>();

	public void addVertex(T vertex)
	{
		graph.put(vertex, new HashSet<Edge<T,E>>());
	}
	
	public void addEdge(T vertex1, T vertex2, E weight)
	{
		if(isDirected) {
			Set<Edge<T,E>> adjList= graph.get(vertex1);
			adjList.add(new Edge<T,E>(vertex1, vertex2, weight));
			graph.put(vertex1, adjList);
		}else {
			Set<Edge<T,E>> adjList= graph.get(vertex1);
			adjList.add(new Edge<T,E>(vertex1, vertex2, weight));
			graph.put(vertex1, adjList);

			adjList= graph.get(vertex2);
			adjList.add(new Edge<T,E>(vertex2, vertex1, weight));
			graph.put(vertex2, adjList);
		}
	}
	public void removeEdge(T vertex)
	{
		if(isDirected) {
			Set<Edge<T,E>> adjList= graph.get(vertex);
			for (Edge edge : adjList) 
			{ 
				Set<Edge<T,E>> destList = graph.get(edge.getDestination());
				destList.remove(new Edge(edge.getSource()));
				graph.put((T) edge.getDestination(), destList);
			}
			adjList.remove(vertex);
			graph.put(vertex, adjList);
			
		}else {
			Set<Edge<T,E>> adjList= graph.get(vertex);
			for (Edge edge : adjList) 
			{ 
				Set<Edge<T,E>> list= graph.get(edge.getDestination());
				list.remove(new Edge(edge.getSource()));
				graph.put((T) edge.getDestination(), list);
			}
			adjList.remove(vertex);
			graph.remove(vertex);
		}
	}
	
	public static void main(String args[])
	{
		Graph g = new Graph<Character, Integer>(false);
		g.addVertex('a');
		g.addVertex('b');
		g.addVertex('c');
		
		g.addEdge('c', 'b', 3);
		g.addEdge('a', 'b', 4);
		System.out.println(g.graph);
		System.out.println(g.graph.get('b'));
		System.out.println(g.graph.get('c'));
		g.removeEdge('b');
		System.out.println(g.graph);
		System.out.println(g.graph.get('b'));
		System.out.println(g.graph.get('c'));
		g.addEdge('a', 'c', 4);
		System.out.println(g.graph);
		int a[] = {1,2};
		
	}

}

class Edge<T,E>
{
	private T source;
	private T destination;
	private E weight;

	public T getSource() {
		return source;
	}

	public void setSource(T source) {
		this.source = source;
	}

	public T getDestination() {
		return destination;
	}

	public void setDestination(T destination) {
		this.destination = destination;
	}

	public E getWeight() {
		return weight;
	}

	public void setWeight(E weight) {
		this.weight = weight;
	}

	Edge(T destination)
	{
		this.destination=destination;
	}
	
	Edge(T source, T destination)
	{
		this.source=source;
		this.destination=destination;
	}
	
	Edge(T source, T destination, E weight)
	{
		this.source=source;
		this.destination=destination;
		this.weight=weight;
	}

	@Override
	public boolean equals(Object obj) 
	{  
		if(this == obj) 
			return true; 
		if(obj == null || obj.getClass()!= this.getClass()) 
			return false; 
		Edge<T,E> edge = (Edge<T,E>) obj;
		return (edge.destination.equals(this.destination)); 
	} 
	@Override
	public int hashCode()
	{
		return String.valueOf(this.destination).hashCode();
	}
	@Override
	public String toString() 
	{   
		return "("+String.valueOf(this.source) +" -- "+String.valueOf(this.destination)+ " -- "+String.valueOf(this.weight)+")";
	} 
	
}