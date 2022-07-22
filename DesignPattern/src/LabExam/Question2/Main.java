package LabExam.Question2;

public class Main {
    public static void main(String[] args) {
        Folder basic = new Folder("Basic Algorithm");
        Folder f1 = new Folder("f1");
        f1.addFiles(new File("Linear Search"));
        basic.addFiles(new File("Greedy Approach"));


        Folder advanced = basic.copy();
        advanced.rename("Advance Algorithm");
        advanced.addFiles(new File("Dynamic Program"));

        Folder f3 = new Folder("Graph Problem");
        f3.addFiles(new File("Spanning Tree"));




        System.out.println(basic);
        System.out.println(advanced);
    }
}
