package GameLogic;

public class ViteFiniteException extends Exception {
    
    public ViteFiniteException() {
        super("Giocatore Morto!");
    }
    
    public ViteFiniteException(String pMessage) {
        super(pMessage);
    }
}
