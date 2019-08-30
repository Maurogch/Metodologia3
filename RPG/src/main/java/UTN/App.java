package UTN;


import UTN.decorator.defense.AntiDamageCarcass;
import UTN.decorator.defense.DefenseDecorator;
import UTN.decorator.defense.InvisivilityCape;
import UTN.model.Mage;
import UTN.model.Player;
import UTN.model.Warrior;
import UTN.strategy.attack.AttackBehaviour;
import UTN.strategy.attack.Sword;

public class App
{
    public static void main( String[] args )
    {
        Player mage = new InvisivilityCape(
                new AntiDamageCarcass(
                        new Mage())
        );

        mage.display();
        mage.performMovement();
        mage.performAttack();
        mage.performDefense();

        /*((DefenseDecorator)((DefenseDecorator)mage).getDecoratedPlayer()).setDecoratedPlayer(
                ((DefenseDecorator)((DefenseDecorator)((DefenseDecorator)mage).getDecoratedPlayer()).getDecoratedPlayer()).getDecoratedPlayer()
        );*/

        System.out.println("-------------");

        mage.performDefense();
    }
}
