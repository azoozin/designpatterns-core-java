package designpatternsgof.strategy;

public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Bot se move normalmente...");
    }
}
