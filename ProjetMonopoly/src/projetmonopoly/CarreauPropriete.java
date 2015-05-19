package projetmonopoly;

public abstract class CarreauPropriete extends Carreau {
	private int _loyerBase;
	private int _prixAchat;
	private Joueur _proprietaire;

    public int getLoyerBase() {
        return _loyerBase;
    }

    public void setLoyerBase(int _loyerBase) {
        this._loyerBase = _loyerBase;
    }

    public int getPrixAchat() {
        return _prixAchat;
    }

    public void setPrixAchat(int _prixAchat) {
        this._prixAchat = _prixAchat;
    }

    public Joueur getProprietaire() {
        return _proprietaire;
    }

    public void setProprietaire(Joueur _proprietaire) {
        this._proprietaire = _proprietaire;
    }
        
}