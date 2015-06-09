package projetmonopoly;

public abstract class Carreau {

    public int numero;
    public String nomCarreau;
    public Monopoly monopoly;
    
    public Carreau (int _numero, String _nomCarreau, Monopoly _monopoly) {
        this.numero= _numero;
        this.nomCarreau= _nomCarreau;
        this.monopoly = _monopoly;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int _numero) {
        this.numero = _numero;
    }

    public String getNomCarreau() {
        return nomCarreau;
    }

    public void setNomCarreau(String _nomCarreau) {
        this.nomCarreau = _nomCarreau;
    }

    public Monopoly getMonopoly() {
        return monopoly;
    }

    public void setMonopoly(Monopoly _monopoly) {
        this.monopoly = _monopoly;
    }

    public void action(Joueur j) {
        
    }

}
