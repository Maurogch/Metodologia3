package UTN.strategy.attack;

public class CantAttack implements AttackBehaviour {
    @Override
    public void attack() {
        System.out.println("I can't attack");
    }
}
