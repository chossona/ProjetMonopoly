package projetmonopoly;

import java.util.ArrayList;
import java.util.Scanner;
import sun.org.mozilla.javascript.ast.Loop;

public class Interface {

    private Monopoly _monopoly;
    private final String  ligne = "______________________________________________________________________________________________________________________";

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
        String proprietaire = "Aucun Propriétaire";
        if (!(prop.getProprietaire() ==null )){ proprietaire = prop.getProprietaire().getNomJoueur();}
        System.out.println("Propiétaire carreau : " + proprietaire);
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
            String a = sc.next();
            if ("1".equals(a)) {
                return true;
            } else if ("2".equals(a)) {
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

    private String afficherLigneText(String t) {
        
        String txt = "|   " + t;
        while (txt.length() < ligne.length()) {
            txt = txt + ' ';
        }
        txt = txt + '|';
        return txt;
    }
    
    public String couleurTexte(Carreau c){
        if (c.getNumero() == 2 || c.getNumero() == 4){
            return  "\u001b[35m";   //pink
        }
        else if (c.getNumero() == 7 || c.getNumero() == 9 || c.getNumero() == 10){
            return "\u001B[36m"; //cyan
        }
        else if (c.getNumero() == 12 || c.getNumero() == 14 || c.getNumero() == 15){
            return "\u001B[35m"; //violet
        }
        else if (c.getNumero() == 17 || c.getNumero() == 19 || c.getNumero() == 20){
               return "\u001b[30m";                     //orange
        }
        else if (c.getNumero() == 22 || c.getNumero() == 24 || c.getNumero() == 25){
            return "\u001B[31m"; //rouge
        }
        else if (c.getNumero() == 27 || c.getNumero() == 29 || c.getNumero() == 30){
            return "\u001B[33m"; //yellow
        }
        else if (c.getNumero() == 32 || c.getNumero() == 33 || c.getNumero() == 35){
            return "\u001B[32m"; //green
        }
        else if (c.getNumero() == 38 || c.getNumero() == 40){
            return "\u001B[34m"; //bleu
        }
        else if (c.getNumero() == 11 || c.getNumero() == 31 || c.getNumero() == 21 || c.getNumero() == 29 || c.getNumero() == 6 || c.getNumero() == 16 || c.getNumero() == 26 || c.getNumero() == 36){
           return    "\u001B[30m"; // black                
        }
        else {
                   return "\u001b[1m";                 //idk
        }
        
    }

    public void affichagePlateau() {

        

        String contourExt = "|";

        while (contourExt.length()
                < ligne.length()) {
            contourExt = contourExt + ' ';
        }
        contourExt = contourExt + '|';

        
        
        for (Carreau c: this.getMonopoly().getCarreau()) {
            System.out.println(ligne);
            String s = "";
            for (int i = 1; i < ligne.length() - c.getNomCarreau().length() - 1; i++) {
                s = s + ' ';

            }
            s = s + '|';
            System.out.println( "| "+ couleurTexte(c) + c.getNomCarreau() + s+"\u001b[0m");
            System.out.println(ligne);
            System.out.println(contourExt);
            System.out.println(afficherLigneText("**Joueur Present : **"));
            for (int i =0; i<c.joueurPresent().size();i++){
            System.out.println(afficherLigneText("  -"+c.joueurPresent().get(i).getNomJoueur() + ' '+c.joueurPresent().get(i).getCash() + "€"));
            }
            System.out.println(contourExt);
            
        }
        System.out.println(ligne);
    }
    
    public void demandeConstruction(ArrayList<ProprieteAConstruire> Prop){
        System.out.println("Voici les endroits où vous pouvez construire");
        System.out.print(Prop.toString());
        Scanner sc = new Scanner(System.in);
        System.out.println("Où voulez vous construire ? Ecrire '69' pour arrêter");
         int  x;
         x=sc.nextInt();
         if (69==x){
             System.out.println("Vous avez arrêté de construire");
             
         }
         else {
             System.out.println("Vous avez décidé de construire sur le terrain"+Prop.get(x));     }
         
        
         
    }
}
