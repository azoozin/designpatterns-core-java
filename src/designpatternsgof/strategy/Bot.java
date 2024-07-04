package designpatternsgof.strategy;

public class Bot {

    private Comportamento strategy;

    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }

    public void mover() {
        this.strategy.mover();
    }
}
