package projetmonopoly;

public abstract class Carreau {

    private int _numero;
    private String _nomCarreau;
    private Monopoly _monopoly;
    
    public Carreau (int _numero, String _nomCarreau, Monopoly _monopoly) {
        this._numero= _numero;
        this._nomCarreau= _nomCarreau;
        this._monopoly= _monopoly;
    }

    public int getNumero() {
        return _numero;
    }

    public void setNumero(int _numero) {
        this._numero = _numero;
    }

    public String getNomCarreau() {
        return _nomCarreau;
    }

    public void setNomCarreau(String _nomCarreau) {
        this._nomCarreau = _nomCarreau;
    }

    public Monopoly getMonopoly() {
        return _monopoly;
    }

    public void setMonopoly(Monopoly _monopoly) {
        this._monopoly = _monopoly;
    }

}
