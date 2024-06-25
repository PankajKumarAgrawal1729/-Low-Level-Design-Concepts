package BehavioralDesignPattern.MementoDesignPattern;

public class ConfigurationOriginator {
    int height;
    int width;
    public ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public ConfigurationMemento createMemeto(){
         return new ConfigurationMemento(this.height, this.width);
    }
    
    public void restoreMemento(ConfigurationMemento mementoToBeRestored){
        this.setHeight(mementoToBeRestored.height);
        this.setWidth(mementoToBeRestored.width );
    }
}
