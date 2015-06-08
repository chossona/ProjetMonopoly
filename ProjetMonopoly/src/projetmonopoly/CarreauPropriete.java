package projetmonopoly;

public abstract class CarreauPropriete extends Carreau {
	private int _prixAchat;
	private Joueur _proprietaire;
        private int _loyerBase;

    public CarreauPropriete(int _loyerBase, int _prixAchat, Joueur _proprietaire, int _numero, String _nomCarreau, Monopoly _monopoly) {
        super(_numero, _nomCarreau, _monopoly);
        this._prixAchat = _prixAchat;
        this._proprietaire = _proprietaire;
        this._loyerBase = _loyerBase;
    }

    /**
     * @return the _prixAchat
     */
    private int getPrixAchat() {
        return _prixAchat;
    }

    /**
     * @param _prixAchat the _prixAchat to set
     */
    private void setPrixAchat(int _prixAchat) {
        this._prixAchat = _prixAchat;
    }

    /**
     * @return the _proprietaire
     */
    private Joueur getProprietaire() {
        return _proprietaire;
    }

    /**
     * @param _proprietaire the _proprietaire to set
     */
    private void setProprietaire(Joueur _proprietaire) {
        this._proprietaire = _proprietaire;
    }

    /**
     * @return the _loyerBase
     */
    private int getLoyerBase() {
        return _loyerBase;
    }

    /**
     * @param _loyerBase the _loyerBase to set
     */
    private void setLoyerBase(int _loyerBase) {
        this._loyerBase = _loyerBase;
    }
}

   
    