package FlyWeightDesignPattern.RoboticGame.Problem;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < 500000; i++) {
            Sprites humunoidSprites = new Sprites();
            Robot humanoidRobotObject = new Robot(x + i, y + i, "HUMANOID", humunoidSprites);
            System.out.println(humanoidRobotObject.toString());
        }
        for (int i = 0; i < 500000; i++) {
            Sprites roboticDogSprites = new Sprites();
            Robot roboticDogObject = new Robot(x + i, y + i, "ROBOTIC_DOG", roboticDogSprites);
            System.out.println(roboticDogObject.toString());
        }
    }
}
