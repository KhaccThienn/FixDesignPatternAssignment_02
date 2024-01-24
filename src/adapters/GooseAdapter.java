package adapters;

import entities.Goose;
import enums.DuckType;
import interfaces.Quackable;

public class GooseAdapter implements Quackable {

    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.hnok();
    }

    @Override
    public DuckType getType() {
        return DuckType.GOOSE;
    }
}
