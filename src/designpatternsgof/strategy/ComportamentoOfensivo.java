package designpatternsgof.strategy;

public class ComportamentoOfensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Bot se move de forma ofensiva.");
    }
}
