public class Vertex {
    private String uniqueLabel;

    public Vertex(String uniqueLabel) {
        super();
        this.uniqueLabel = uniqueLabel;
    }

    public String getLabel() {
        return uniqueLabel;
    }

    public void setLabel(String uniqueLabel) {
        this.uniqueLabel = uniqueLabel;
    }

    public String toString() {
        return uniqueLabel;
    }
}