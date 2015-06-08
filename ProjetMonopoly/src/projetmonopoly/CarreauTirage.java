package projetmonopoly;

public class CarreauTirage extends CarreauAction {

    public CarreauTirage(int _numero, String _nomCarreau, Monopoly _monopoly) {
        super(_numero, _nomCarreau, _monopoly);
    }
    public void TirerUneCarte(){
        if (this.getNumero() == 7 ||this.getNumero() == 22 || this.getNumero() == 36 ){
            this.getMonopoly().getCarteChance().getFirst().ActionCarte();
        }
        else if (this.getNumero() == 2 ||this.getNumero() == 17 || this.getNumero() == 33 ){
            this.getMonopoly().getCarteCaisse().getFirst().ActionCarte();
        }
    }
}