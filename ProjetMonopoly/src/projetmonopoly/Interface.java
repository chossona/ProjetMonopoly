package projetmonopoly;

import java.util.Scanner;
import sun.org.mozilla.javascript.ast.Loop;

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
        System.out.println("*****************************************************************************************************************");
        System.out.println("nom joueur : " + j.getNomJoueur());

        System.out.println("argent joueur : " + j.getCash());

        System.out.println("position joueur : " + j.getPositionCourante().getNomCarreau());
        if (j.getCompagnies() != null) {
            for (Compagnie compagnies : j.getCompagnies()) {

                System.out.println("compagnies joueur" + compagnies);

            }
        }
        if (j.getProprietesAConstruire() != null) {
            for (ProprieteAConstruire PAC : j.getProprietesAConstruire()) {

                System.out.println("Propriétés joueur : " + PAC);

            }
        }
        if (j.getProprietesAConstruire() != null) {
            for (Gare gare : j.getGares()) {

                System.out.println("Gares joueur : " + gare);

            }
        }
            System.out.println("*****************************************************************************************************************");
        System.out.println();
        System.out.println();
        
    }

    public void afficherInfos(ProprieteAConstruire prop) {
        System.out.println("*****************************************************************************************************************");
        System.out.println("Information Propriété : ");
        System.out.println("*****************************************************************************************************************");
        System.out.println();
        System.out.println("Nom carreau : " + prop.getNomCarreau());
        System.out.println("Prix carreau : " + prop.getPrixAchat());
        System.out.println("Propiétaire carreau : " + prop.getProprietaire());
        System.out.println("Groupe carreau : " + prop.getGroupePropriete().getCouleur().name());
        System.out.println("Maison carreau : " + prop.getNb_Maisons());
        System.out.println("Hotel carreau : " + prop.getNb_Hotels());
         System.out.println();
        System.out.println("*****************************************************************************************************************");

    }

    public void afficher(String s) {
    }

    ;
   
   public boolean reponse() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Oui : 1");
        System.out.println("Non : 2");
        System.out.println();
        while (1 == 1) {
            if (sc.nextInt() == 1) {
                return true;
            } else if (sc.nextInt() == 2) {
                return false;
            } else {
                System.out.println("Mauvaise saisie, recommencer (1/2)  :");
            }
        }
    }

    public void afficherDés(int d1, int d2) {
        System.out.println();
        System.out.println("Dé n°1 : " + d1);
        System.out.println("Dé n°2 : " + d2);
        System.out.println();

    }

    public void EstMort(Joueur j) {
        System.out.println();
        System.out.println("joueur : " + j.getNomJoueur() + "est éliminé");
        System.out.println();
    }

    public void AGagner(Joueur j) {
System.out.println();
        System.out.println("Le joueur : " + j.getNomJoueur() + " a gagné");
        System.out.println();
    }
    
    public void affichagePlateau() {
        String s = "";
        String ligne = "_____________________________________";
        for(Carreau c : this.getMonopoly().getCarreau()) {
            System.out.println(ligne);
            for (int i = 1; i<ligne.length() - c.getNomCarreau().length()-3; i++ ){
                s= s + ' ';
                
            }
            s =s + '|';
            System.out.println("| " + c.getNomCarreau() + s);
            System.out.println(ligne);
        }
    }
}
