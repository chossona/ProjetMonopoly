package projetmonopoly;

/**
 *
 * @author chossona
 */
public class RecevoirArgent extends Carte {

    private int argent;

    public RecevoirArgent(int numCarte, String nomCarte, boolean b, int argent, Monopoly m) {
        super(numCarte, nomCarte, b, m);
        this.argent = argent;
    }

    @Override
    public void action(Joueur j, Boolean b) {
        if (this.getNumCarte() == 19) {
            for (Joueur joueur : this.getMonopoly().getJoueurs()) {
                if (Joueur != j) {
                    j.setCash(joueur.payer(10) + j.getCash());
                    if (joueur.payer(10) != 10) {

                        this.getMonopoly().EstEliminé(joueur);
                    }

                }
            }
        } else {
            j.setCash(j.getCash() + this.getArgent());
        }

    }

    /**
     * @return the argent
     */
    public int getArgent() {
        return argent;
    }

    /**
     * @param argent the argent to set
     */
    public void setArgent(int argent) {
        this.argent = argent;
    }

}
