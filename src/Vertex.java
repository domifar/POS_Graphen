import java.util.ArrayList;

public class Vertex {
    private String data;
    private ArrayList<Edge> edges;

    public Vertex(String data) {
        this.data = data;
        edges = new ArrayList<Edge>();
    }

    public void addEdge(Vertex endVertex, Integer weight) {
        edges.add(new Edge(this, endVertex, weight));
    }

    public ArrayList<Edge> getEdges(){
        return edges;
    }
}