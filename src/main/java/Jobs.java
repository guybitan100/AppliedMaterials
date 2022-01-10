import java.util.ArrayList;

public class Jobs {

    ArrayList<Job> nodes = new ArrayList<>();

    public void addNodes(Job... nodes) {
        for (Job node : nodes) {
            this.nodes.add(node);
        }
    }

    public void buildJobs() {
        Job nodeA = new Job("A");
        Job nodeB = new Job("B");
        Job nodeC = new Job("C");
        Job nodeD = new Job("D");
        Job nodeE = new Job("E");
        Job nodeF = new Job("F");
        Job nodeG = new Job("G");

        nodeA.build(nodeB, nodeC);
        nodeB.build(nodeD);
        nodeC.build(nodeD,nodeE);
        nodeF.build(nodeE, nodeG);
        addNodes(nodeA, nodeB, nodeC, nodeD, nodeE, nodeF, nodeG);

    }

    public ArrayList<Job> getNodes() {
        return nodes;
    }

}
