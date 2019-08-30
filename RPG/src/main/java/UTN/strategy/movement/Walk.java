package UTN.strategy.movement;

public class Walk implements MovementBehaviour {
    @Override
    public void move() {
        System.out.println("I'm walking");
    }
}
