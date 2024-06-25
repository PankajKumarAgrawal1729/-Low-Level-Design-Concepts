package FlyWeightDesignPattern.RoboticGame.Solution;

public class RoboticDog implements IRobot {
    private String type;
    private Sprites body;  // small 2d bitmap(graphic element)
    
    public RoboticDog(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }

    @Override
    public void display(int x, int y) {
        // use the robotic Dog sprites object
        // and X and Y Co-ordinates to render the image 
    }
}
