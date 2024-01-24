package impls;

import enums.DuckType;
import interfaces.Quackable;

public class RedHeadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("RedHeadDuck Quack !");
    }

    @Override
    public DuckType getType() {
        return DuckType.REDHEADDUCK;
    }
}
