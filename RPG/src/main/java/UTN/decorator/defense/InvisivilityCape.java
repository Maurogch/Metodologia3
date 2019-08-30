package UTN.decorator.defense;

import UTN.model.Player;

public class InvisivilityCape extends DefenseDecorator {

    public InvisivilityCape(Player decoratedPlayer){
        super(decoratedPlayer);
    }

    @Override
    public void performDefense() {
        decoratedPlayer.performDefense();
        System.out.println("I'm using an invisibility cape");
    }

    @Override
    public void display(){
        decoratedPlayer.display();
    }
}
