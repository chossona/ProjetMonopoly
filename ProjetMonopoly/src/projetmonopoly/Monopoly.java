package projetmonopoly;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Monopoly {

    private HashMap<Integer, Carreau> Carreau;
    private LinkedList<Joueur> Joueurs;
    private int d1;
    private int d2;
    private Interface interf;

    public Monopoly(String dataFilename) {
        buildGamePlateau(dataFilename);
    }

    private void buildGamePlateau(String dataFilename) {
        try {
            ArrayList<String[]> data = readDataFile(dataFilename, ",");

            //TODO: create cases instead of displaying
            for (int i = 0; i < data.size(); ++i) {
                String caseType = data.get(i)[0];
                if (caseType.compareTo("P") == 0) {
                    System.out.println("Propriété :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                } else if (caseType.compareTo("G") == 0) {
                    System.out.println("Gare :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                } else if (caseType.compareTo("C") == 0) {
                    System.out.println("Compagnie :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                } else if (caseType.compareTo("CT") == 0) {
                    System.out.println("Case Tirage :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                } else if (caseType.compareTo("CA") == 0) {
                    System.out.println("Case Argent :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                } else if (caseType.compareTo("CM") == 0) {
                    System.out.println("Case Mouvement :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                } else {
                    System.err.println("[buildGamePleateau()] : Invalid Data type");
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("[buildGamePlateau()] : File is not found!");
        } catch (IOException e) {
            System.err.println("[buildGamePlateau()] : Error while reading file!");
        }
    }

    private ArrayList<String[]> readDataFile(String filename, String token) throws FileNotFoundException, IOException {
        ArrayList<String[]> data = new ArrayList<String[]>();

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = null;
        while ((line = reader.readLine()) != null) {
            data.add(line.split(token));
        }
        reader.close();

        return data;
    }

    public void SetDés() {
        Random x = new Random();
        setD1(x.nextInt(6) + 1);
        setD2(x.nextInt(6) + 1);
    }

    /**
     * @return the d1
     */
    public int getD1() {
        return d1;
    }

    /**
     * @return the d2
     */
    public int getD2() {
        return d2;
    }

    /**
     * @param d1 the d1 to set
     */
    private void setD1(int d1) {
        this.d1 = d1;
    }

    /**
     * @param d2 the d2 to set
     */
    private void setD2(int d2) {
        this.d2 = d2;
    }

    public Interface getInterf() {
        return interf;
    }
//coucou
    public void InistialiserPartie() {
        Scanner sc = new Scanner(System.in);
        int nbjoueur;
        String nom;
        this.getInterf().Afficher("Saississez le nombre de joueurs : ");
        nbjoueur = sc.nextInt();

        for (int i = 0; i < nbjoueur; i++) {
            this.getInterf().Afficher("Saisissez le nom du joueur n°" + i);
            nom = sc.next();
            this.getJoueurs().add(new Joueur(nom, this, this.getCarreau().get(1)));
            SetDés();

            this.getJoueurs().get(i).setCash(getD1() + getD2());        //stockage du lancer de dés dans cash (pour savoir qui commence)

        }
        Joueur j3 = new Joueur("d", this, this.getCarreau().get(1));    //Tri joueur par resultat dés
        for (Joueur j : this.getJoueurs()) {
            for(Joueur j2 : this.getJoueurs()) {
                if (j.getCash()<j2.getCash()) {
                    j3 = j;            //permut joueur
                    j = j2;
                    j2 = j3;        //fin permut
                }
            }
        }                                                               //fin tri joueur
        
        for (Joueur j : this.getJoueurs()) {                    //restauration du cash des joueur
            j.setCash(1500);
        }

    }

    /**
     * @return the Joueurs
     */
    private LinkedList<Joueur> getJoueurs() {
        return Joueurs;
    }

    /**
     * @param Joueurs the Joueurs to set
     */
    private void setJoueurs(LinkedList<Joueur> Joueurs) {
        this.Joueurs = Joueurs;
    }

    /**
     * @return the Carreau
     */
    private HashMap<Integer, Carreau> getCarreau() {
        return Carreau;
    }

    /**
     * @param Carreau the Carreau to set
     */
    private void setCarreau(HashMap<Integer, Carreau> Carreau) {
        this.Carreau = Carreau;
    }

}
