package UTN.decorator.defense;

import UTN.model.Player;

public abstract class DefenseDecorator extends Player {
    protected Player decoratedPlayer;

    public DefenseDecorator(Player decoratedPlayer) {
        super();
        this.decoratedPlayer = decoratedPlayer;
    }

    /*public void deleteDecorator(DefenseDecorator toRemove){
        if (decoratedPlayer == null) {
            return;
        } else if (decoratedPlayer.equals(toRemove)) {
            decoratedPlayer = decoratedPlayer.getDecoratedPlayer(); //todo immplement remove decorator
        } else {
            decoratedPlayer.removeDecorator(toRemove);
        }
    }*/

    public abstract void performDefense();

    public Player getDecoratedPlayer() {
        return decoratedPlayer;
    }

    public void setDecoratedPlayer(Player decoratedPlayer) {
        this.decoratedPlayer = decoratedPlayer;
    }
}
