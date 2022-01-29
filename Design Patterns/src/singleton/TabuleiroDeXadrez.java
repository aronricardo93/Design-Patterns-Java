package singleton;

public class TabuleiroDeXadrez {

    private static TabuleiroDeXadrez instancia = new TabuleiroDeXadrez();

    private TabuleiroDeXadrez() {
    }

    static TabuleiroDeXadrez getInstancia() {
        return instancia;
    }

    public static void main(String[] args) {
        TabuleiroDeXadrez tabuleiro = TabuleiroDeXadrez.getInstancia();
    }
}