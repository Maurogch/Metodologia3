package UTN.strategy.movement;

public class Run implements MovementBehaviour {
    @Override
    public void move() {
        System.out.println("I'm running");
    }
}
