package CreationDesignPatterns.ProtoTypeDesignPattern.Problem;

public class Main {
    public static void main(String[] args) {
        Student objStudent = new Student(20, 76, "Ram");

        // creating clone of objStudent
        Student cloneObjStudent = new Student();
        cloneObjStudent.age = objStudent.age;
        cloneObjStudent.name = objStudent.name;
        // cloneObjStudent.rollNumber = objStudent.rollNumber;
    }
}
 