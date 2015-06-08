package projetmonopoly;

import java.util.Scanner;

public class Interface {

    private Monopoly _monopoly;

    public int DemandeInformationsNB_Joueur() {
          System.out.println("Saisissez le nombre de joueur");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public String DemandeInformaionNom_Joueur(int i) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez le nom du joueur n°" + i);
        return sc.next();

    }

    /**
     * @return the _monopoly
     */
    public Monopoly getMonopoly() {
        return _monopoly;
    }

    /**
     * @param _monopoly the _monopoly to set
     */
    public void setMonopoly(Monopoly _monopoly) {
        this._monopoly = _monopoly;
    }
   public void afficherInfos(Joueur j) {

System.out.println("nom joueur : " + j.getNomJoueur());

System.out.println("argent joueur : " + j.getCash());

System.out.println("position joueur : " + j.getPositionCourante());

for (Compagnie compagnies : j.getCompagnies()) {

System.out.println("compagnies joueur" + compagnies);

}

for (ProprieteAConstruire PAC : j.getProprietesAConstruire()) {

System.out.println("Propriétés joueur : " + PAC);

}

for (Gare gare : j.getGares()) {

System.out.println("Gares joueur : " + gare);

}

}
   
   public void afficherInfos(ProprieteAConstruire prop){
       System.out.println("Nom carreau : " + prop.getNomCarreau());
       System.out.println("Prix carreau : "+ prop.getPrixAchat());
       System.out.println("Propiétaire carreau : "+prop.getProprietaire());
       System.out.println("Groupe carreau : "+prop.getGroupePropriete());
       System.out.println("Maison carreau : "+prop.getNb_Maisons());
       System.out.println("Hotel carreau : "+prop.getNb_Hotels());
   }
   
   public void afficher(String s){};
   
   public boolean reponse(){
       return true;
   }
   
   public void afficherDés(Monopoly monopoly){
       System.out.println("Dé n°1 : "+monopoly.getD1());
        System.out.println("Dé n°2 : "+monopoly.getD2());
        System.out.println("Total : "+monopoly.getD1()+monopoly.getD2());
       
   }
   
   public void EstMort(Joueur j) {      
           System.out.println("joueur : " + j.getNomJoueur() + "est éliminé");             
   }
}
