package MiscDSA.TaskManagement;

public class Main {
    public static void main(String[] args) {
        TaskManagement tasks = new TaskManagement(3);
        tasks.add("Programming", "Write a java code", "Not done");
        tasks.add("Coding", "Write a Python code", "Not done");
        tasks.add("Writing", "Write a thesis statement", "Done");

        tasks.changeStatusOf("Coding");
//        tasks.print();

        // For user-involvement, un-comment the next line.
//        tasks.getStarted();


    }
}