package Graph;

public class Edges {
    int source, destination;
    public Edges(int source, int destination){
        this.source = source;
        this.destination = destination;
    }
    
    public int getSource() {
        return source;
    }
    public void setSource(int source) {
        this.source = source;
    }

    public int getDestination() {
        return destination;
    }
    public void setDestination(int destination) {
        this.destination = destination;
    }

}
