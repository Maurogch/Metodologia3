package UTN.strategy.movement;

public class Swim implements MovementBehaviour {
    @Override
    public void move() {
        System.out.println("I'm swimming");
    }
}
