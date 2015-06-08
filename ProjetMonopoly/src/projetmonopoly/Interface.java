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
}
