package designpatternsgof.strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Bot se move de forma defensiva.");
    }
}
