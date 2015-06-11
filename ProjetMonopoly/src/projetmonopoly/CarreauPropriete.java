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
    public int getPrixAchat() {
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
    public Joueur getProprietaire() {
        return _proprietaire;
    }

    /**
     * @param _proprietaire the _proprietaire to set
     */
    protected void setProprietaire(Joueur _proprietaire) {
        this._proprietaire = _proprietaire;
    }

    /**
     * @return the _loyerBase
     */
    public int getLoyerBase() {
        return _loyerBase;
    }
        protected void payerLoyer(Joueur j) {
        this.getProprietaire().setCash(this.getProprietaire().getCash() + this.calculLoyerPropriété());
        j.setCash(j.getCash() - this.calculLoyerPropriété());
    }
    

    /**
     * @param _loyerBase the _loyerBase to set
     */
    private void setLoyerBase(int _loyerBase) {
        this._loyerBase = _loyerBase;
    }
    
    protected void achatPropriete(Joueur j) {

        if (this.getPrixAchat() <= j.getCash()) {
            this.getMonopoly().getInterf().afficher("Voulez vous acheter la propriété ?");
            if (this.getMonopoly().getInterf().reponse()) {
                j.setCash(j.getCash() - this.getPrixAchat());
                this.setProprietaire(j);
            }
            this.getMonopoly().getInterf().afficherInfos(this);

        } else {
            this.getMonopoly().getInterf().afficher("Vous n'avez pas assez de Cash");
        }

    }
    
    
       public int calculLoyerPropriété() {
        return this.getLoyerBase();
    }
       
       
    @Override
    public void action(Joueur j) {
        this.getMonopoly().getInterf().afficherInfos(this);
        if (this.getProprietaire() == null) {

            achatPropriete(j);
        } else if (this.getProprietaire() != j) {
            this.getMonopoly().getInterf().attente();
            payerLoyer(j);

    
 
}
    }
}

   
    