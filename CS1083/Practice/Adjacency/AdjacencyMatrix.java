public class AdjacencyMatrix {
    private boolean [][] graph;

    public AdjacencyMatrix(int numVertices) {
        graph = new boolean[numVertices][numVertices]; // kinda like a square with number of vertices we have
    }

    public void insertBiDirection(int loc1, int loc2) {
        insertUniDirection(loc1, loc2);
        insertUniDirection(loc2, loc1);
    }

    public void insertUniDirection(int loc1, int loc2) {
        if(loc1 < graph.length && loc2 < graph.length) {
            graph[loc1][loc2] = true;
        }
    }

    public boolean isDirectConnected(int loc1, int loc2) {
        if(loc1 < graph.length && loc2 < graph.length) {
            return graph[loc1][loc2];
        } else {
            return false;
        }
    }
}