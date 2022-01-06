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

    public void setName(String name) {
        this.name = name;
    }

    public void build() {

    }

    public void printDependencies() {
        StringBuilder sb = new StringBuilder();

        sb.append("Job: " + name + " dependent on: ");

        for (Node node : dependencies.values()) {
            sb.append("Job:" + node.name + ", ");
        }
        System.out.println(sb.toString());
    }
}
