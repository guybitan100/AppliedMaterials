public class Main {

    public static void main(String[] args) {
        Jobs jobs = new Jobs();
        jobs.buildJobs();
        for (Node node : jobs.getNodes()) {
            node.printDependencies();
        }
    }
}
