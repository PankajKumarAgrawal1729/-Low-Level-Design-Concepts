package FlyWeightDesignPattern.RoboticGame.Solution;

public class HumanoidRobot implements IRobot {

    private String type;
    private Sprites body;

    public HumanoidRobot(String type, Sprites body) {
        this.type = type;
        this.body = body;   // small 2d bitmap(graphic element)
    }

    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }

    @Override
    public void display(int x, int y) {
        // use the hunamoid sprites object
        // and X and Y Co-ordinates to render the image 
    }
    
}
