package UTN.strategy.movement;

public class Fly implements MovementBehaviour {
    @Override
    public void move() {
        System.out.println("I'm flying! Weee");
    }
}
