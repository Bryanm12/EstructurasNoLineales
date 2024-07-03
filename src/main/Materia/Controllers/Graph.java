package main.Materia.Controllers;
import main.Materia.Models.NodeG;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Graph {
    private List<NodeG> nodes;
    private int[][] matrizAdy;

    public Graph(){
        this.nodes = new ArrayList<>();
    }
    public NodeG addNode(int value){
        NodeG newNode = new NodeG(value);
        nodes.add(newNode);
        return newNode;
    }

    public void addEdge(NodeG src, NodeG dest){
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }
    public void printGraph(){
        for(NodeG node: nodes){
            System.out.print("Vertex "+ node.getValue()+" : ");
            for(NodeG neighbor : node.getNeighbors()){
                System.out.print(" -> "+ neighbor.getValue());
            }
            System.out.println();
        }
    }
    public void getDFS(NodeG starNode){
        boolean visited[] = new boolean [starNode.getValue()];
        getDFSUtil(starNode, visited);
    }
    public void getDFSUtil(NodeG node, boolean[] visited){
        visited[node.getValue()]= true;
        System.out.print(node.getValue()+" ");

        Iterator<NodeG> i = nodes.listIterator();
        while(i.hasNext()){
            NodeG n = i.next();
            if(!visited[n.getValue()])
            getDFSUtil(n, visited);
        }
    }

    public void getBFS(NodeG starNode){
        boolean visitado[] = new boolean[starNode.getValue()];

        LinkedList<Integer> cola = new LinkedList<>();

        visitado[starNode.getValue()] = true;
        cola.add(starNode.getValue());

        while(!cola.isEmpty()){
            int node = cola.poll();
            System.out.print(node+" ");

            Iterator<NodeG> it = nodes.listIterator();
            while(it.hasNext()){
                NodeG n = it.next();
                if(!visitado[n.getValue()]){
                    visitado[n.getValue()]=true;
                    cola.add(n.getValue());
                }
            }
        }
    }
    public int[][] getAdjacencyMatrix(){
        return matrizAdy;
    }
    public void printAdjacencyMatrix(){
        System.out.println("Matriz de adyacencia de grafo");

        for(int i=0 ; i<nodes.size();i++){
            for(int j=0; j<nodes.size();j++){
                System.out.print(matrizAdy[i][j]+" ");
            }
            System.out.println();
        }
    }
}
