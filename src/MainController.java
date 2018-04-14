public class MainController {
    public static void main(String[] args) {
        Vertex lviv = new Vertex("Lviv");
        Vertex luck = new Vertex("Luck");
        Vertex ivf = new Vertex("Ivano-Frankivsk");
        Vertex kyiv = new Vertex("Kyiv");
        Vertex odessa = new Vertex("Odessa");

        Edge e1 = new Edge(ivf, lviv);
        Edge e2 = new Edge(lviv, luck);
        Edge e3 = new Edge(lviv, kyiv);
        Edge e4 = new Edge(ivf, kyiv);
        Edge e5 = new Edge(ivf, odessa);
        Edge e6 = new Edge(kyiv, odessa);

        Graph firstGraph = new Graph();

        firstGraph.addVertex(lviv);
        firstGraph.addVertex(luck);
        firstGraph.addVertex(ivf);
        firstGraph.addVertex(kyiv);
        firstGraph.addVertex(odessa);

        firstGraph.addEdge(e1);
        firstGraph.addEdge(e2);
        firstGraph.addEdge(e3);
        firstGraph.addEdge(e4);
        firstGraph.addEdge(e5);
        firstGraph.addEdge(e6);

        System.out.println(firstGraph.getAdjList());
    }
}
