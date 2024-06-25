package FlyWeightDesignPattern.RoboticGame.Problem;

public class Robot {
    int coordinateX;
    int coordinateY;
    String type;
    Sprites body; // small 2d bitmap(graphic element)

    public Robot(int coordinateX, int coordinateY, String type, Sprites body) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.type = type;
        this.body = body;
    }

    //intrinsic data : type, body
    // extrinsic data : coordinateX, coordinateY
}
