package projetmonopoly;

public class CarreauTirage extends CarreauAction {

    public CarreauTirage(int _numero, String _nomCarreau, Monopoly _monopoly) {
        super(_numero, _nomCarreau, _monopoly);
    }

    public void TirerUneCarte() {
        Carte c;

        if (this.getNumero() == 7 || this.getNumero() == 22 || this.getNumero() == 36) {
            c = this.getMonopoly().getCarteChance().getFirst();
            c.ActionCarte();
            if (c.getNumCarte() == 1) {
                this.getMonopoly().getCarteChance().remove(c);
            } else {
                this.getMonopoly().getCarteChance().remove(c);
                this.getMonopoly().getCarteChance().offer(c);

            }
        } else if (this.getNumero() == 2 || this.getNumero() == 17 || this.getNumero() == 33) {
            c = this.getMonopoly().getCarteCaisse().getFirst();
            c.ActionCarte();
            if (c.getNumCarte() == 1) {
                this.getMonopoly().getCarteCaisse().remove(c);
            } else {
                this.getMonopoly().getCarteCaisse().remove(c);
                this.getMonopoly().getCarteCaisse().offer(c);

            }

        }
    }
    

}

