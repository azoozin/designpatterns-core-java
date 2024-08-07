package designpatternsgof.singleton;

/**
 * Singleton lazy "apressado"
 * 
 * @author azoozin
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instancia;
    }
}