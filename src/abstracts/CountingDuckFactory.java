package abstracts;

import adapters.GooseAdapter;
import entities.Goose;
import impls.*;
import interfaces.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter(new RedHeadDuck());
    }

    @Override
    public Quackable createGoose() {
        // Not counting goose quacks in this example
        return new GooseAdapter(new Goose());
    }
}
