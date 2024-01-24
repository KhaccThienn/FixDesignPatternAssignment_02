package impls;

import enums.DuckType;
import interfaces.Quackable;

public class QuackCounter implements Quackable {

    private Quackable duck;
    private static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    @Override
    public DuckType getType() {
        return duck.getType();
    }
}
