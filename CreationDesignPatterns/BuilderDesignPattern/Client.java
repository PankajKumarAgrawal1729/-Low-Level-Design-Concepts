package CreationDesignPatterns.BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {
        Director director1 = new Director(new EngineeringStudentBuilder());
        Director director2 = new Director(new MBAStudentBuilder());

        Student engineer = director1.createEngineerStudent();
        Student mba = director2.createMBAStudent();

        System.out.println(engineer.toString());
        System.out.println(mba.toString());
    }
}
