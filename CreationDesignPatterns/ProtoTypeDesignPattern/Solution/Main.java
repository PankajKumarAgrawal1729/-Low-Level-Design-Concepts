package CreationDesignPatterns.ProtoTypeDesignPattern.Solution;

public class Main {
    public static void main(String[] args) {
        Student objStudent = new Student(20, 76, "Ram");

        // creating clone of objStudent
        Student cloneObjStudent = (Student) objStudent.clone();
        System.out.println(cloneObjStudent.toString());
    }
}
