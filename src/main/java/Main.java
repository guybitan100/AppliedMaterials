public class Main {

    public static void main(String[] args) {
        Nodes nodes = new Nodes();
        nodes.buildJobs();
        for (Node node : nodes.getNodes()) {
            node.printDependencies();
        }
    }
}
