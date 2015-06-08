
package projetmonopoly;

/**
 *
 * @author chossona
 */
public class CarteArgent extends Carte  {
    private int argent;
    
     public CarteArgent(int numCarte, String nomCarte, boolean b,int argent) {
        super(numCarte, nomCarte, b);
        this.argent = argent;
     
    }
}
