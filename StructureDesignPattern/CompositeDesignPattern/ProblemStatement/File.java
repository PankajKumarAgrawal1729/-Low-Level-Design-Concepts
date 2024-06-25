package CompositeDesignPattern.ProblemStatement;

public class File {
    public String fileName;

    public File(String fileName){
        this.fileName = fileName;
    }

    public void ls(){
        System.out.println("File name: " + fileName);
    }
}
