package desafio_gof;

import desafio_gof.facade.Facade;
import desafio_gof.singleton.SingletonEager;
import desafio_gof.singleton.SingletonLazy;
import desafio_gof.singleton.SingletonLazyHolder;
import desafio_gof.strategy.Comportamento;
import desafio_gof.strategy.ComportamentoAgressivo;
import desafio_gof.strategy.ComportamentoDefensivo;
import desafio_gof.strategy.ComportamentoNormal;
import desafio_gof.strategy.Robo;

public class Test {
    
    public static void main(String[] args) {
        
        // Singleton:
        
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy: 

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade:

        Facade facade = new Facade();
        facade.migrarCliente("Ana", "13300000");
    }
}