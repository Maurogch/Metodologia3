package UTN.decorator.defense;

import UTN.model.Player;

public class AntiDamageCarcass extends DefenseDecorator {

    public AntiDamageCarcass(Player decoratedPlayer){
        super(decoratedPlayer);
    }

    @Override
    public void performDefense() {
        decoratedPlayer.performDefense();
        System.out.println("I'm using an anti damage carcass spell");
    }

    @Override
    public void display(){
        decoratedPlayer.display();
    }
}
