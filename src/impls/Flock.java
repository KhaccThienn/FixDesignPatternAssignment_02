package impls;

import enums.DuckType;
import interfaces.Quackable;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {

    private List<Quackable> quackers;
    private String flockName;
    private int countMallardDuck;
    private int countRedHeadDuck;
    private int countGoose;

    public Flock(String flockName) {
        this.quackers = new ArrayList<>();
        this.flockName = flockName;
    }

    public void add(Quackable quacker) {
        this.quackers.add(quacker);
        switch (quacker.getType()) {
            case MALLARDDUCK:
                this.countMallardDuck++;
                break;
            case REDHEADDUCK:
                this.countRedHeadDuck++;
                break;
            case GOOSE:
                this.countGoose++;
                break;
        }
    }

    public void countDuck() {
        System.out.println("Tổng số con vịt trong đàn: " + this.quackers.size());
        System.out.println("Số con vịt trời: " + this.countMallardDuck);
        System.out.println("Số con vịt cổ đỏ: " + this.countRedHeadDuck);
        System.out.println("Số con ngỗng: " + this.countGoose);
    }

    @Override
    public void quack() {
        for (Quackable quacker : this.quackers) {
            quacker.quack();
        }
    }

    @Override
    public DuckType getType() {
        return DuckType.FLOCK;
    }

    public String getFlockName() {
        return this.flockName;
    }

    public void setFlockName(String flockName) {
        this.flockName = flockName;
    }
}
