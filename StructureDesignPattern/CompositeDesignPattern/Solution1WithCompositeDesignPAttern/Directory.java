package CompositeDesignPattern.Solution1WithCompositeDesignPAttern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> fileSystemList;

    public Directory(String directoryName){
        this.directoryName = directoryName;
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem object){
        this.fileSystemList.add(object);
    }

    public void ls(){
        System.out.println("Directory Name: " + directoryName);
        for(FileSystem obj : fileSystemList){
           obj.ls();
        }
    }
}
