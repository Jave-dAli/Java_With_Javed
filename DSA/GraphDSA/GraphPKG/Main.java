package GraphDSA.GraphPKG;

class Vertex{
    public char label;
    public boolean wasVisited;
    public Vertex(char lab){
        label = lab;
        wasVisited = false;
    }
}
class Graph{
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];    // array of vertices
    private int adjMat[][]; // adjacency matrix
    private int nVerts; // curr no of vertices
    public Graph(){
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for(int j=0; j<MAX_VERTS; j++){
            for(int k=0; k<MAX_VERTS; k++)
                adjMat[j][k] = 0;
        }
        
    }
}
public class Main {
}
