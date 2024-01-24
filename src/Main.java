import abstracts.AbstractDuckFactory;
import entities.Goose;
import factories.DuckFactory;
import impls.*;
import interfaces.Quackable;

public class Main {

    public static void main(String[] args) {
        // Create AbstractDuckFactory instance (choose factory type)
        AbstractDuckFactory factory = new DuckFactory(); // choose between DuckFactory or CountingDuckFactory

        // Create individual ducks and flocks
        Quackable mallard1 = factory.createMallardDuck();
        Quackable redhead1 = factory.createRedHeadDuck();
        Quackable redhead2 = factory.createRedHeadDuck();
        Quackable goose1 = factory.createGoose();
        Flock smallFlock = new Flock("Little Pond");
        Flock bigFlock = new Flock("Great Lake");

        // Add ducks and goose to flocks
        smallFlock.add(mallard1);


        bigFlock.add(mallard1);
        bigFlock.add(redhead1);
        bigFlock.add(redhead2);
        bigFlock.add(goose1);

        // Call all the ducks and flocks to quack
        System.out.println(smallFlock.getFlockName());
        smallFlock.quack();

        System.out.println();
        System.out.println(bigFlock.getFlockName());
        bigFlock.quack();

        System.out.println("\n");
        // Count ducks in each flock
        System.out.println(smallFlock.getFlockName());
        smallFlock.countDuck();

        System.out.println();
        System.out.println(bigFlock.getFlockName());
        bigFlock.countDuck();
    }
}
