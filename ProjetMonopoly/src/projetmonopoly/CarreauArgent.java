package projetmonopoly;

public class CarreauArgent extends CarreauAction {
	private int _montant;

    public CarreauArgent(int _numero, String _nomCarreau, Monopoly _monopoly, int _montant) {
        super(_numero, _nomCarreau, _monopoly);
        this._montant = _montant;
    }

    public int getMontant() {
        return _montant;
    }

    public void setMontant(int _montant) {
        this._montant = _montant;
    }
    @Override
    public void action(Joueur j){
      j.setCash(j.getCash()+getMontant());
    }
    
    
}