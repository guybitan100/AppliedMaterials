import java.util.HashMap;


public abstract class NodeBase {

    private HashMap<String, Node> dependencies = new HashMap<>();
    private String name;

    public NodeBase(String name) {
        this.name = name;
    }

    public void addDependence(Node... nodes) {
        for (Node node : nodes) {
            if (node.getDependencies().size() > 0) {
                if (node.getDependencies().get(name).getName() == name) {
                    System.out.println("Node:" + node.getName() + " Already depended on node:" + name);
                }
            } else if (node.getName() == name) {
                System.out.println("Node:" + node.getName() + " Can't depend on itself");
            } else {
                dependencies.put(node.getName(), node);
            }

        }
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Node> getDependencies() {
        return dependencies;
    }

    public void printDependencies() {
        StringBuilder sb = new StringBuilder();
        sb.append("Node:" + name + " dependent on Nodes: ");
        for (Node dependentNode : dependencies.values()) {
            sb.append(dependentNode.getName() + " ");
        }
        System.out.println(sb);
    }
}
