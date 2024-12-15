public class AdjacencyList {
    private Vertex start;

    public AdjacencyList () {
        start = null;
    }

    public void insertBiDirection(String loc1, String loc2) {
        if (!isDirectConnected(loc1, loc2)) {
            insertUniDirection(loc1, loc2);
        }
        if (!isDirectConnected(loc2, loc1)) {
            insertUniDirection(loc2, loc1);
        }   
    }

    public void insertUniDirection(String loc1, String loc2){
		Vertex current = start;
		if(current == null){ // if the graph does not have any vertices (empty)
			start = new Vertex(loc1);
			Neighbour neighbourNode = new Neighbour(loc2);
			start.node = neighbourNode;
		}
		else{ 
			boolean added = false;
            // if the vertex already exists just add the neighbour at the end of it
			while(current.next != null){ 
				if(current.label.equals(loc1)){ 
					addNeighbour(current, loc2); 
					added = true;
					break;
				}
				current = current.next;
			} 

            // if we are at the last node, and the last node is the vertex for loc1
			if(!added && current.label.equals(loc1)){
				addNeighbour(current, loc2);
			}
            // if we still haven't added the vertex
			// We need to make a new vertex and it to the end of the list
			else if (!added) {
				current.next = new Vertex(loc1);
				Neighbour neighbourNode = new Neighbour(loc2);
				current.next.node = neighbourNode;
			}
		}
	}

    public void addNeighbour(Vertex addNeighbourTo, String locAdd){
		Neighbour temp = addNeighbourTo.node;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = new Neighbour(locAdd);
	}

    public boolean isDirectConnected(String loc1, String loc2){
		boolean connection = false;
		Vertex currentVertex = start;
		while(currentVertex != null){
			Neighbour currentNeighbour = currentVertex.node;

			if(currentVertex.label.equals(loc1)){
				while(currentNeighbour != null){
					if(currentNeighbour.label.equals(loc2)){
						connection = true;
					}
					currentNeighbour = currentNeighbour.next;
				}
			}
			currentVertex = currentVertex.next;
		}
		return connection;
	}
 
	public String toString() {
		String msg = "";
		Vertex currentVertex = start;
		while (currentVertex != null) {
			msg += currentVertex.label + "is connected to...";
			Neighbour currentNeighbour = currentVertex.node;
			while(currentNeighbour != null) {
				msg += currentNeighbour.label + ",";
				currentNeighbour = currentNeighbour.next;
			}
			msg += "\n";
			currentVertex = currentVertex.next;
		}
		return msg;
	}

    private class Neighbour {
        public String label;
        public Neighbour next;

        public Neighbour (String label) {
            this.label = label;
            next = null;
        }
    }

    private class Vertex {
        public String label;
        public Neighbour node;
        public Vertex next;

        public Vertex (String label) {
            this.label = label;
            node = null;
            next = null;
        }
    }
}