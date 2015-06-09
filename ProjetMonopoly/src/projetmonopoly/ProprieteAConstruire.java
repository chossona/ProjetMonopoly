package projetmonopoly;


public class ProprieteAConstruire extends CarreauPropriete {
	private int nb_Maisons;
	private int nb_Hotels;
	private java.util.ArrayList<Integer> _loyerMaison;
	private Groupe _groupePropriete;
      

    public ProprieteAConstruire(int _loyerBase, int _prixAchat, Joueur _proprietaire, int _numero, String _nomCarreau, Monopoly _monopoly,Groupe groupe,java.util.ArrayList<Integer> Lmaisons) {
        super(_loyerBase, _prixAchat, _proprietaire, _numero, _nomCarreau, _monopoly);
        this._loyerMaison = Lmaisons;
        this._groupePropriete =groupe;
        this.nb_Maisons =0;
        this.nb_Hotels =0;
        
    }

      /**
     * @return the nb_Maisons
     */
    public int getNb_Maisons() {
        return nb_Maisons;
    }

    /**
     * @param nb_Maisons the nb_Maisons to set
     */
    public void setNb_Maisons(int nb_Maisons) {
        this.nb_Maisons = nb_Maisons;
    }

    /**
     * @return the nb_Hotels
     */
    public int getNb_Hotels() {
        return nb_Hotels;
    }

    /**
     * @param nb_Hotels the nb_Hotels to set
     */
    public void setNb_Hotels(int nb_Hotels) {
        this.nb_Hotels = nb_Hotels;
    }

    /**
     * @return the _loyerMaison
     */
    public java.util.ArrayList<Integer> getLoyerMaison() {
        return _loyerMaison;
    }

    /**
     * @param _loyerMaison the _loyerMaison to set
     */
    public void setLoyerMaison(java.util.ArrayList<Integer> _loyerMaison) {
        this._loyerMaison = _loyerMaison;
    }

    /**
     * @return the _groupePropriete
     */
    public Groupe getGroupePropriete() {
        return _groupePropriete;
    }

    /**
     * @param _groupePropriete the _groupePropriete to set
     */
    public void setGroupePropriete(Groupe _groupePropriete) {
        this._groupePropriete = _groupePropriete;
    }

   public int calculLoyerPropriété() {
        return 3;
    }

    public void achatPropriete(Joueur j) {

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

    public boolean possedeCouleur(Joueur j) {
        boolean b = true;
        for (ProprieteAConstruire p : this.getGroupePropriete().getProprietes()) {
            if (!(p.getProprietaire() == j)) {
                b = false;
            }
        }
        return b;
    }

    private void construire(Joueur j) {
        if (possedeCouleur(j)) {
           

        }
    }

    public void payerLoyer(Joueur j) {
        this.getProprietaire().setCash(this.getProprietaire().getCash() + this.calculLoyerPropriété());
        j.setCash(j.getCash() - this.calculLoyerPropriété());
    }

    public void action(Joueur j) {
        this.getMonopoly().getInterf().afficherInfos(this);
        if (this.getProprietaire() == null) {

            achatPropriete(j);
        } else if (this.getProprietaire() == j) {
            construire(j);
        } else {
            payerLoyer(j);
        }
    }
  
  
    }

   
