package UTN.strategy.defense;

public class CantDefend implements DefenseBehaviour {
    @Override
    public void defense() {
        System.out.println("Can't defend");
    }
}
