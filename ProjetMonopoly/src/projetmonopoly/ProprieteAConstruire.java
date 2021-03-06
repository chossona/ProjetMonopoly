package projetmonopoly;

import java.util.ArrayList;


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

 

  

    public boolean possedeCouleur(Joueur j) {
        boolean b = true;
        for (ProprieteAConstruire p : this.getGroupePropriete().getProprietes()) {
            if (!(p.getProprietaire() == j)) {
                b = false;
            }
        }
        return b;
    }

    private ArrayList<ProprieteAConstruire> oùConstruire(Groupe g){
        int i=construction(this.getGroupePropriete().getProprietes().get(0));//prend le nombre de constuction de la premiere construction
            for (int j =1;j<this.getGroupePropriete().getProprietes().size();j++) {//regarde les autres
                if(i>this.getGroupePropriete().getProprietes().indexOf(j)){
                i=j;
                }
            }
            //regarde si il reste des maisons ou hotel et regarde si il n'y a pas que des hotels
            if(i<4 && (this.getMonopoly().getNbMaisons())!=32){
            return null;
            }
            else if(i==4 && (this.getMonopoly().getNbHotels()!=12)){
                 return null;
            }
            else if (i==5){return null;}//la rigesse si il n'y a plus rien a construire
            
            ArrayList<ProprieteAConstruire> PAC = new ArrayList<>();
            for (ProprieteAConstruire propriete : this.getGroupePropriete().getProprietes()) {
                if(construction(propriete)==i){
                PAC.add(propriete);
                }
            }
          return PAC;              
    }
    private int construction(ProprieteAConstruire p){
    if(p.getNb_Hotels()==1){
    return 5;} 
    else{return p.getNb_Maisons();}
    }
 
    
    private void construire(Joueur j) {
        int construire;
        if (possedeCouleur(j)) {
            boolean b=true;
            while(b){
            if(oùConstruire(this.getGroupePropriete())!=null){//regarde si le vecteur est null
            if(oùConstruire(this.getGroupePropriete()).get(0).getPrixAchat()>=j.getCash()){
                for (ProprieteAConstruire oùConstruire : oùConstruire(this.getGroupePropriete())) {
                construire=this.getMonopoly().getInterf().demandeConstruction(this.getGroupePropriete().getProprietes());//A ffiche les numro des propriete et demande saisir le num 
                if(this.oùConstruire(this.getGroupePropriete()).contains(this.getGroupePropriete().getProprietes().get(construire))){
                this.construire(this.getGroupePropriete().getProprietes().get(construire));
                }
                else{b=false;}
                }
            }
            else{b=false;}
            }
            else{b=false;}
            
        }
    }
    }

    public void construire(ProprieteAConstruire p){
        //construction des maison
        if (p.getNb_Maisons() == 4) {
            this.setNb_Maisons(0);
            this.setNb_Hotels(1);
            
        }
        else {
            this.setNb_Maisons(this.getNb_Maisons() + 1);
        }
    }

    @Override
    public void action(Joueur j) {
        this.getMonopoly().getInterf().afficherInfos(this);
        if (this.getProprietaire() == null) {

            achatPropriete(j);
        } else if (this.getProprietaire() == j) {
            this.getMonopoly().getInterf().attente();
            construire(j);
        } else {
            this.getMonopoly().getInterf().attente();
            payerLoyer(j);
        }
    }
    
  
    

    @Override
   public int calculLoyerPropriété() {
       if (this.possedeCouleur(this.getProprietaire()) && this.getNb_Maisons() ==0 && this.getNb_Hotels() == 0){
           return (this.getLoyerBase()*2);
       }
       else if (this.nb_Maisons != 0) {
           return (this.getLoyerMaison().get(this.getNb_Maisons()));
       }
       else if (this.getNb_Hotels() != 0){
           return this.getLoyerMaison().get(5);
       }
       else {
           return this.getLoyerBase();
       }
       
           
           
                   
       
    }
   
}
