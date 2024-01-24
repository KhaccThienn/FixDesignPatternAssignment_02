package impls;

import enums.DuckType;
import interfaces.Quackable;

public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("MallardDuck Quack !");
    }

    @Override
    public DuckType getType() {
        return DuckType.MALLARDDUCK;
    }
}
