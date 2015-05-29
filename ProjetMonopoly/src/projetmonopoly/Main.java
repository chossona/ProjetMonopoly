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
        CarreauArgent c1 = new CarreauArgent(1, "Départ", m, 200);
        ProprieteAConstruire c2 = new ProprieteAConstruire(2, "Bd de Belleville", m, 2, 60);
        CarreauTirage c3 = new CarreauTirage(3, "Caisse de Communauté", m);
        ProprieteAConstruire c4 = new ProprieteAConstruire(4, "Rue Lecourbe", m, 4, 60);
        CarreauArgent c5 = new CarreauArgent(5, "Impôt sur le revenue", m, -200);
        Gare c6 = new Gare(6, "Gare Montparnasse", m, 25, 200);
        ProprieteAConstruire c7 = new ProprieteAConstruire(7, "Rue de Vaugirard", m, 6, 100);
        CarreauTirage c8 = new CarreauTirage(8, "Chance", m);
        ProprieteAConstruire c9 = new ProprieteAConstruire(9, "Rue de Courcelles", m, 6, 100);
        ProprieteAConstruire c10 = new ProprieteAConstruire(10, "Av. de la Republique", m, 8, 120);
        CarreauArgent c11 = new CarreauArgent(11, "Simple Visite / En Prison", m, 0);
        ProprieteAConstruire c12 = new ProprieteAConstruire(12, "Bd de la Vilette", m, 10, 140);
        Compagnie c13 = new Compagnie(13, "Compagnie de distribution d'éléctricité", m, 4, 150);
        ProprieteAConstruire c14 = new ProprieteAConstruire(14, "Rue de Paradis", m, 12, 160);
        ProprieteAConstruire c15 = new ProprieteAConstruire(15, "Av. de Neuilly", m, 10, 140);
        Gare c16 = new Gare(16, "Gare de Lyon", m, 25, 200);
        ProprieteAConstruire c17 = new ProprieteAConstruire(17, "Bd Saint-Michel", m, 14, 180);
        CarreauTirage c18 = new CarreauTirage(18, "Caisse de Communauté", m);
        ProprieteAConstruire c19 = new ProprieteAConstruire(19, "Av. Mozart ", m, 14, 180);
        ProprieteAConstruire c20 = new ProprieteAConstruire(20, "Place Pigalle", m, 16, 200);
        CarreauArgent c21 = new CarreauArgent(21, "Parc gratuit", m, 0);
        ProprieteAConstruire c22 = new ProprieteAConstruire(22, "Bd Malesherbes", m, 18, 220);
        CarreauTirage c23 = new CarreauTirage(23, "Chance", m);
        ProprieteAConstruire c24 = new ProprieteAConstruire(24, "Av. Matignon", m, 18, 220);
        ProprieteAConstruire c25 = new ProprieteAConstruire(25, "Av. Henri-Martin", m, 20, 240);
        Gare c26 = new Gare(26, "Gare du Nord", m, 25, 200);
        ProprieteAConstruire c27 = new ProprieteAConstruire(27, "Faub. Saint-Honoré", m, 22, 260);
        ProprieteAConstruire c28 = new ProprieteAConstruire(28, "Place de la Bourse", m, 22, 260);
        Compagnie c29 = new Compagnie(29, "COmpagnie de Distribution des eaux", m, 4, 150);
        ProprieteAConstruire c30 = new ProprieteAConstruire(30, "Rue de la Fayette", m, 24, 280);
        CarreauMouvement c31 = new CarreauMouvement(31, "Aller en Prison", m);
        ProprieteAConstruire c32 = new ProprieteAConstruire(32, "Av. de Breteuil", m, 26, 300);
        ProprieteAConstruire c33 = new ProprieteAConstruire(33, "Av. Foch", m, 26, 300);
        CarreauTirage c34 = new CarreauTirage(34, "Caisse de Communauté", m);
        ProprieteAConstruire c35 = new ProprieteAConstruire(35, "Bd des Capucines", m, 28, 320);
        Gare c36 = new Gare(36, "Gare Saint-Lazarre", m, 25, 200);
        CarreauTirage c37 = new CarreauTirage(37, "Chance", m);
        ProprieteAConstruire c38 = new ProprieteAConstruire(38, "Av. des Champs-Elysées", m, 35, 350);
        CarreauArgent c39 = new CarreauArgent(39, "Taxe de Luxe", m, -100);
        ProprieteAConstruire c40 = new ProprieteAConstruire(40, "Rue de la Paix", m, 50, 400);

    }

}
