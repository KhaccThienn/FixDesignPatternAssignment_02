package factories;

import abstracts.AbstractDuckFactory;
import adapters.GooseAdapter;
import entities.Goose;
import impls.*;
import interfaces.Quackable;

public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}
