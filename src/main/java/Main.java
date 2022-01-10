public class Main {

    public static void main(String[] args) {
        Jobs nodes = new Jobs();
        nodes.buildJobs();
        for (Job node : nodes.getNodes()) {
            node.printNodeBuild();
        }
    }
}
