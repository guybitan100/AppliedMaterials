import java.util.HashMap;


public abstract class JobBase {

    private HashMap<String, Job> buildList = new HashMap<>();
    private String name;

    public JobBase(String name) {
        this.name = name;
    }

    public void build(Job... nodes) {
        for (Job node : nodes) {
            if (node.getBuildList().size() > 0) {
                if (node.getBuildList().get(name).getName() == name) {
                    System.out.println("Job:" + node.getName() + " Already depended on job:" + name);
                }
            } else if (node.getName() == name) {
                System.out.println("Job:" + node.getName() + " Can't depend on itself");
            } else {
                buildList.put(node.getName(), node);
            }

        }
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Job> getBuildList() {
        return buildList;
    }

    public void printNodeBuild() {
        StringBuilder sb = new StringBuilder();
        sb.append("Node:" + name + " build Nodes: ");
        for (Job dependentNode : buildList.values()) {
            sb.append(dependentNode.getName() + " ");
        }
        System.out.println(sb);
    }
}
