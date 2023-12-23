package GraphDSA;

import java.util.Arrays;

public class Graph {
    private int[][] adjacencyMatrix;
    private int numVertices;
    public Graph(int numVertices){
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[numVertices][numVertices];
    }
    public void addVertex(){
        if(numVertices >= adjacencyMatrix.length){
            int[][] newMatrix = new int[numVertices*2][numVertices*2];
            for(int i=0; i<numVertices; i++)
                newMatrix[i] = Arrays.copyOf(adjacencyMatrix[i], numVertices*2);
            for(int i=numVertices; i<numVertices*2; i++)
                newMatrix[i] = new int[numVertices*2];
            numVertices*=2;
            adjacencyMatrix = newMatrix;
        }else
            numVertices++;
    }
    public void addEdge(int src, int dest){

    }
}
