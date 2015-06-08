package projetmonopoly;

/**
 *
 * @author chossona
 */
public class RecevoirArgent extends Carte  {
    private int argent;
    
     public RecevoirArgent(int numCarte, String nomCarte, boolean b,int argent) {
        super(numCarte, nomCarte, b);
        this.argent = argent;
     
    }
}
