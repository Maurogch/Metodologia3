package UTN.model;

import UTN.strategy.attack.AttackBehaviour;
import UTN.strategy.attack.Sword;
import UTN.strategy.defense.DefenseBehaviour;
import UTN.strategy.defense.Shield;
import UTN.strategy.movement.MovementBehaviour;
import UTN.strategy.movement.Walk;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Player {
    private AttackBehaviour attackBehaviour;
    private DefenseBehaviour defenseBehaviour;
    private MovementBehaviour movementBehaviour;

    public Player(){
        this.attackBehaviour = new Sword();
        this.defenseBehaviour = new Shield();
        this.movementBehaviour = new Walk();
    }

    public abstract void display();

    public void performAttack(){
        attackBehaviour.attack();
    }

    public void performDefense(){
        defenseBehaviour.defense();
    }

    public void performMovement(){
        movementBehaviour.move();
    }
}
