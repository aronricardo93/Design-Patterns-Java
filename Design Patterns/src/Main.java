import Game.Jogo;
import facade.Facade;
import strategy.*;


public class Main {

    public static void main(String[] args) {

        //Facade
        Facade facadePC = new Facade();
        facadePC.montarPC();

        //Strategy
        Jogo jogo = new Jogo();

        jogo.jogar();

        jogo.setStrategy(new DificilStrategy());
        jogo.jogar();
    }

}
