package UTN.strategy.movement;

public class DontMove implements MovementBehaviour {
    @Override
    public void move() {
        System.out.println("I can't move!!!");
    }
}
