import java.util.ArrayList;

public class Nodes {

    ArrayList<Node> nodes = new ArrayList<>();

    public void addNodes(Node... nodes) {
        for (Node node : nodes) {
            this.nodes.add(node);
        }
    }


    public void buildJobs() {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");

        nodeA.addDependence(nodeA,nodeB, nodeC);
        nodeB.addDependence(nodeC);
        nodeC.addDependence(nodeD);
        nodeF.addDependence(nodeE, nodeG);
        addNodes(nodeA, nodeB, nodeC, nodeD, nodeE, nodeF, nodeG);

    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

}
