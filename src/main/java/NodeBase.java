import java.util.HashMap;


public abstract class NodeBase {

    HashMap<String, Node> dependencies = new HashMap<>();
    String name;

    public NodeBase(String name) {
        this.name = name;
    }

    public void addDependence(Node... nodes) {
        for (Node node : nodes) {
            dependencies.put(node.getName(), node);
        }
    }

    public String getName() {
        return name;
    }


    public void printDependencies() {
        StringBuilder sb = new StringBuilder();
        sb.append("Node:" + name + " dependent on Nodes: ");

        for (Node dependentNode : dependencies.values()) {
            sb.append(dependentNode.name + " ");
        }
        System.out.println(sb);
    }
}
