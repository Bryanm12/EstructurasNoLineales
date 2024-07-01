package main.Materia.Controllers;
import main.Materia.Models.NodeG;

import java.util.ArrayList;
import java.util.List;
public class Graph {
    private List<NodeG> nodes;


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
        
    }
    public void getDFSUtil(NodeG node, boolean[] visited){

    }

    public void getBFS(NodeG starNode){

    }
    public int[][] getAdjacencyMatrix(){
        
    }
    public void printAdjacencyMatrix(){

    }
}
