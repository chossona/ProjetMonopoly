/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmonopoly;


/**
 *
 * @author callaite
 */
public class Main {

    public static void main(String[] args) {
        Monopoly m = new Monopoly("/home/georges/workspace/Monopoly/data/case.data");
        CarreauArgent c1 = new CarreauArgent(1,"Départ", m, 200);
        ProprieteAConstruire c2 = new ProprieteAConstruire(2,"Bd de Belleville,mauve",m,2,60,null);
    CT,3,Caisse de Communauté
    P,4,Rue Lecourbe,mauve,60,4,20,60,180,320,450,50,50
    CA,5,Impôt sur le revenu,-200
    G,6,Gare Montparnasse,200
    P,7,Rue de Vaugirard,bleuCiel,100,6,30,90,270,400,550,50,50
    CT,8,Chance
    P,9,Rue de Courcelles,bleuCiel,100,6,30,90,270,400,550,50,50
    P,10,Av. de la République,bleuCiel,120,8,40,100,300,450,600,50,50
    CA,11,Simple Visite / En Prison,0
    P,12,Bd de la Villette,violet,140,10,50,150,450,625,750,100,100
    C,13,Companie de distribution d'électricité,150
    P,14,Rue de Paradis,violet,160,12,60,180,500,700,900,100,100
    P,15,Av. de Neuilly,violet,140,10,50,150,450,625,750,100,100
    G,16,Gare de Lyon,200
    P,17,Bd Saint-Michel,orange,180,14,70,200,550,750,950,100,100
    CT,18,Caisse de Communauté
    P,19,Av. Mozart,orange,180,14,70,200,550,750,950,100,100
    P,20,Place Pigalle,orange,200,16,80,220,600,800,1000,100,100
    CA,21,Parc Gratuit,0
    P,22,Bd Malesherbes,rouge,220,18,90,250,700,875,1050,150,150
    CT,23,Chance
    P,24,Av. Matignon,rouge,220,18,90,250,700,875,1050,150,150
    P,25,Av. Henri-Martin,rouge,240,20,100,300,750,925,1100,150,150
    G,26,Gare du Nord,200
    P,27,Faub. Saint-Honoré,jaune,260,22,110,330,800,975,1150,150,150
    P,28,Place de la Bourse,jaune,260,22,110,330,800,975,1150,150,150
    C,29,Companie de distribution des eaux,150
    P,30,Rue La Fayette,jaune,280,24,120,360,850,1025,1200,150,150
    CM,31,Allez en prison
    P,32,Av. de Breteuil,vert,300,26,130,390,900,1100,1275,200,200
    P,33,Av. Foch,vert,300,26,130,390,900,1100,1275,200,200
    CT,34,Caisse de Communauté
    P,35,Bd des Capucines,vert,320,28,150,450,1000,1200,1400,200,200
    G,36,Gare Saint-Lazare,200
    CT,37,Chance
    P,38,Av. des Champs-Elysées,bleuFonce,350,35,175,500,1100,1300,1500,200,200
    CA,39,Taxe de Luxe,-100
    P,40,Rue de la Paix,bleuFonce,400,50,200,600,1400,1700,2000,200,200
    }

}
