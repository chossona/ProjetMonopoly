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
    public void AfficheInfos (Joueur j){
        System.out.println("Infos joueur " +j.getNomJoueur()+" :");
        System.out.println("Ca$h : " + j.getCash());

        for (Compagnie compagnie : j.getCompagnies()){
      //      System.out.println(compagnie.);
        
        }
           
          
                    
                       //     j.getGares()
                          //          j.getPositionCourante()
                                         //   j.getProprietesAConstruire()
                    }
}
