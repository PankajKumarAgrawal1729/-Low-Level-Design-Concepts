package CreationDesignPatterns.BuilderDesignPattern;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }
    
    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineerStudent();
        }else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }

    public Student createEngineerStudent(){
        return studentBuilder.setRollNo(1).setAge(22).setName("s1").setSubjects().build(); 
    }

    public Student createMBAStudent(){
        return studentBuilder.setRollNo(2).setAge(24).setName("s2").setFatherName("F2").setMotherName("M2 ").setSubjects().build();
    }
}
