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

import java.util.LinkedList;
import java.util.Random;

public class Monopoly {

    public ArrayList<Groupe> groupes = new ArrayList<>();
    public ArrayList<Carreau> carreau = new ArrayList<>();

    public ArrayList<Joueur> Joueurs = new ArrayList<>();
    public int d1;
    public int d2;
    private Interface interf;
    public LinkedList<Carte> carteChance = new LinkedList<>();
    public LinkedList<Carte> carteCaisse = new LinkedList<>();

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
                    System.out.println(data.get(i)[0]);

                    //cherche le groupe de la propriete dans carreau
                    int g = 0;
                    boolean b = true;
                    while (g < getGroupes().size() && b) {
                        if (getGroupes().get(g).getCouleur().equals(CouleurPropriete.valueOf(data.get(i)[3]))) {
                            b = false;
                        }
                        g++;
                    }

                    /*creation d'un groupe */ if (b) {

                        Groupe groupe = new Groupe(
                                Integer.parseInt(data.get(i)[11]),
                                Integer.parseInt(data.get(i)[12]),
                                CouleurPropriete.valueOf(data.get(i)[3]));
                        getGroupes().add(groupe);
                    }

                    //comme dans le monopoly les propriétés d'un groupe se suivent, on sait que l'on doit ajouter la propriete sur sur dernier groupe => groupes.get(groupes.size()-1)             
                    //creation propriete 
                    ArrayList loyersMaisons = new ArrayList();//creation arraylist des loyers en fonction des constructions
                    for (int j = 6; j <= 10; j++) {
                        loyersMaisons.add(data.get(i)[j]);
                    }
                    ProprieteAConstruire carProp = new ProprieteAConstruire(
                            Integer.parseInt(data.get(i)[5]),
                            Integer.parseInt(data.get(i)[4]),
                            null,
                            Integer.parseInt(data.get(i)[1]),
                            data.get(i)[2],
                            this,
                            getGroupes().get(getGroupes().size() - 1),
                            loyersMaisons);

                    //ajout d'une propriete dans groupe
                    getGroupes().get(getGroupes().size() - 1).ajouterropriete(carProp);
                    //ajout du carrreau    
                    //  carreau.put(1, null);  
                    getCarreau().add(carProp);

                } else if (caseType.compareTo("G") == 0) {
                    System.out.println(data.get(i)[0]);
                    Gare gare = new Gare(
                            25,
                            Integer.parseInt(data.get(i)[3]),
                            null,
                            Integer.parseInt(data.get(i)[1]),
                            data.get(i)[2],
                            this);
                    getCarreau().add(gare);

                } else if (caseType.compareTo("C") == 0) {
                    System.out.println(data.get(i)[0]);
                    Compagnie compagnie = new Compagnie(
                            10,
                            Integer.parseInt(data.get(i)[3]),
                            null,
                            Integer.parseInt(data.get(i)[1]),
                            data.get(i)[2],
                            this
                    );
                    getCarreau().add(compagnie);

                } else if (caseType.compareTo("CT") == 0) {
                    System.out.println(data.get(i)[0]);
                    CarreauTirage carreauTirage = new CarreauTirage(
                            Integer.parseInt(data.get(i)[1]),
                            data.get(i)[2],
                            this);
                    getCarreau().add(carreauTirage);

                } else if (caseType.compareTo("CA") == 0) {
                    System.out.println(data.get(i)[0]);
                    CarreauArgent carreauArgent = new CarreauArgent(
                            Integer.parseInt(data.get(i)[1]),
                            data.get(i)[2],
                            this,
                            Integer.parseInt(data.get(i)[3]));
                    getCarreau().add(carreauArgent);

                } else if (caseType.compareTo("CM") == 0) {
                    System.out.println(data.get(i)[0]);
                    CarreauMouvement carreauMouvement = new CarreauMouvement(
                            Integer.parseInt(data.get(i)[1]),
                            data.get(i)[2],
                            this);
                    getCarreau().add(carreauMouvement);

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
        ArrayList<String[]> data = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = null;
        while ((line = reader.readLine()) != null) {
            data.add(line.split(token));
        }
        reader.close();

        return data;
    }

    public Joueur getJoueur(int j) {
        return getJoueurs().get(j);
    }

    public void SetDés() {
        Random x = new Random();
        setD1(x.nextInt(5)+1);
        setD2(x.nextInt(5)+1);
    }

    public int getD1() {
        return d1;
    }

    public int getD2() {
        return d2;
    }

    private void setD1(int d1) {
        this.d1 = d1;
    }

    private void setD2(int d2) {
        this.d2 = d2;
    }

    public Interface getInterf() {
        return interf;
    }

    public void InitialiseInterface(Interface interf) {
        this.interf = interf;
    }

    public void InitialiserPartie() {
        ArrayList<Joueur> noms = new ArrayList<>();

        //Initialise Joueur avec leurs noms 
        int nbjoueurs = this.interf.DemandeInformationsNB_Joueur();
        for (int i = 0; i < nbjoueurs; i++) {
            Joueur j = new Joueur(
                    this.interf.DemandeInformaionNom_Joueur(i),
                    0,
                    this,
                    this.getCarreau().get(0)
            );
            noms.add(j);
        }

        LanceDesDepart(noms);//fait lancer les d
        noms = metDansOrdre(noms); //met dans l'ordre les joueur
        for (int i = 0; i < noms.size(); i++) {
            noms.get(i).setCash(1500); //initialise l'argent
            this.getJoueurs().add(i, noms.get(i));//met joueur dans monopoly
        }

    }

    public ArrayList<Joueur> metDansOrdre(ArrayList<Joueur> Noms) {

        int i = 0;
        boolean b = true;
        String saveNomsJoueur;
        int saveNumDes;

        // met joueur dans l'ordre
        while (i < Noms.size() && b) {
            b = false;
            for (int j = 0; j < Noms.size() - 1; j++) {

                if (Noms.get(j).getCash() > Noms.get(j++).getCash()) {
                    b = true;

                    saveNomsJoueur = Noms.get(j).getNomJoueur();//svg du joueur j
                    saveNumDes = Noms.get(j).getCash();

                    Noms.get(j).setNomJoueur(Noms.get(j + 1).getNomJoueur());//met joueur j++ a la place de j
                    Noms.get(j).setCash(Noms.get(j + 1).getCash());

                    Noms.get(j).setNomJoueur(saveNomsJoueur);//met joueur j a la place de j++
                    Noms.get(j).setCash(saveNumDes);
                }
            }
            i++;
        }

        return Noms;
    }

    private ArrayList<Joueur> LanceDesDepart(ArrayList<Joueur> Noms) {
        int des12;
        for (Joueur Nom : Noms) {
            SetDés();
            System.out.println(getD1() + getD2());
            des12 = getD1() + getD2();
            Nom.setCash(des12); //stockage du lancer de dés dans cash (pour savoir qui commence)
        }
        return Noms;
    }

    public ArrayList<Groupe> getGroupes() {
        return groupes;
    }

    public ArrayList<Carreau> getCarreau() {
        return carreau;
    }



    public int lancerDésAvancer(Joueur j) {
        int position;
        SetDés();  
        this.interf.afficherDés(this.getD1(), this.getD2());
        position=j.getPositionCourante().getNumero()+getD1()+getD2();
        if(position>39){
                   position=position-40;
                   j.setCash( j.getCash()+200);
                }
        return (position);
    }

    public void InitialiseCartes(String dataFilename, boolean b) {

        try {

            ArrayList<String[]> data = readDataFile(dataFilename, ";");

            //TODO: create cases instead of displaying
            for (int i = 0; i < data.size(); ++i) {
                String caseType = data.get(i)[0];
                if (caseType.compareTo("Prison") == 0) {
                    System.out.println(data.get(i)[0]);

                    Carte carte = new Carte(
                            Integer.parseInt(data.get(i)[2]),
                            data.get(i)[1],
                            b,
                            this);

                    if (b) {

                        getCarteChance().add(carte);
                    } else {
                        getCarteCaisse().add(i, carte);
                    }

                } else if (caseType.compareTo("Déplacer") == 0) {
                    System.out.println(data.get(i)[0]);
                    CarteDeplacer deplacer = new CarteDeplacer(
                            Integer.parseInt(data.get(i)[2]),
                            data.get(i)[1],
                            b,
                            Integer.parseInt(data.get(i)[3]
                                    ),
                            this
                    );

                    if (b) {
                        getCarteChance().add(i, deplacer);
                    } else {
                        getCarteCaisse().add(i, deplacer);
                    }

                } else if (caseType.compareTo("Pargent") == 0) {
                    System.out.println(data.get(i)[0]);

                    CarteArgent carteArgent = new CarteArgent(
                            Integer.parseInt(data.get(i)[2]),
                            data.get(i)[1],
                            b,
                            Integer.parseInt(data.get(i)[3]),
                            this);

                    if (b) {
                        getCarteChance().add(i, carteArgent);
                    } else {
                        getCarteCaisse().add(i, carteArgent);
                    }

                } else if (caseType.compareTo("Voyager") == 0) {
                    System.out.println(data.get(i)[0]);

                    CarteVoyager carteVoyager = new CarteVoyager(//int numCarte, String nomCarte, boolean b,Carreau carreau
                            Integer.parseInt(data.get(i)[2]),
                            data.get(i)[1],
                            b,
                            this.carreau.get(Integer.parseInt(data.get(i)[3])),
                            this);

                    if (b) {
                        getCarteChance().add(i, carteVoyager);
                    } else {
                        getCarteCaisse().add(i, carteVoyager);
                    }
                } else if (caseType.compareTo("Rargent") == 0) {
                    System.out.println(data.get(i)[0]);

                    RecevoirArgent recevoirArgent = new RecevoirArgent(//int numCarte, String nomCarte, boolean b,int argent
                            Integer.parseInt(data.get(i)[2]),
                            data.get(i)[1],
                            b,
                            Integer.parseInt(data.get(i)[3]),
                            this);

                    if (b) {
                        getCarteChance().add(i, recevoirArgent);
                    } else {
                        getCarteCaisse().add(i, recevoirArgent);
                    }

                } else {
                    System.err.println("[buildCartes()] : Invalid Data type");

                }

            }

        } catch (FileNotFoundException e) {
            System.err.println("[buildCartes()] : File is not found!");
        } catch (IOException e) {
            System.err.println("[buildCarte()] : Error while reading file!");
        }

    }

    public LinkedList<Carte> getCarteChance() {
        return carteChance;
    }

    public void LinkedList(LinkedList<Carte> carteChance) {
        this.carteChance = carteChance;
    }

    public LinkedList<Carte> getCarteCaisse() {
        return carteCaisse;
    }

    public void setCarteCaisse(LinkedList<Carte> carteCaisse) {
        this.carteCaisse = carteCaisse;
    }

    public void initialiseTas() {
        this.carteCaisse = initialiseTa(this.carteCaisse);
        this.carteChance = initialiseTa(this.carteChance);

    }

    public LinkedList<Carte> initialiseTa(LinkedList<Carte> carte) {
        Random p = new Random();
        LinkedList<Carte> cartes = new LinkedList<>();

        int c;

        for (int i = 0; i <= carte.size(); i++) {

            c = p.nextInt(carte.size());
            cartes.add(carte.get(c));
            carte.remove(c);

        }
        return cartes;
    }

    public void EstEliminé(Joueur j) {
        if (j.joueurVie(j.getCash()) == false) {
            for (int i = 0; i <= j.getProprietesAConstruire().size(); i++) {
                j.getProprietesAConstruire().get(i).setProprietaire(null);

            }
            for (int i = 0; i <= j.getCompagnies().size(); i++) {
                j.getCompagnies().get(i).setProprietaire(null);
            }

            for (int i = 0; i <= j.getGares().size(); i++) {
                j.getGares().get(i).setProprietaire(null);
            }

            j.getProprietesAConstruire().removeAll(carreau);
            j.getCompagnies().removeAll(carreau);
            j.getGares().removeAll(carreau);

            this.getJoueurs().remove(j);

        }
    }

    public boolean fin_du_jeu() {
        return (this.getJoueurs().size()==1);
    }

    public void Jouer() {
       
        for (Joueur j : this.getJoueurs()) {
           
            this.interf.afficherInfos(j);
        }
        int position,compteurDouble;
        
        
        int i =0;
        while (!fin_du_jeu()) {
            compteurDouble = 0;
            
                
                
            if (this.getJoueurs().get(i).getTempsPrison() == -1){
            position = this.lancerDésAvancer(this.getJoueurs().get(i));
            
            position = position-1;
            this.carreau.get(position);
            
             
               
                
                
            this.getJoueurs().get(i).setPositionCourante(this.carreau.get(position));//change position du joueur
            this.interf.afficherInfos( this.getJoueurs().get(i));
            this.carreau.get(position).action(this.getJoueurs().get(i));//appelle l'action du carreau2
            getInterf().affichagePlateau();
            if ((getD1() == getD2())){
            compteurDouble = compteurDouble+1; if(compteurDouble ==3){this.getJoueur(i).setTempsPrison(0);this.getJoueur(i).setPositionCourante(this.getCarreau().get(9));}
            if (i<this.getJoueurs().size()-1){i++;}
            else{i=0;}  
            }
           
            }
            else {
                this.getInterf().GererPrison(i);
            }
        }
        this.interf.AGagner(this.getJoueurs().get(0));
    }

    /**
     * @return the Joueurs
     */
    public ArrayList<Joueur> getJoueurs() {
        return Joueurs;
    }

    /**
     * @param Joueurs the Joueurs to set
     */
    public void setJoueurs(ArrayList<Joueur> Joueurs) {
        this.Joueurs = Joueurs;
    }
    public int getNbHotels(){
        int nbHotels=0;
        for (Joueur joueur : this.Joueurs) {
            
                    for(int j=0;j<joueur.getProprietesAConstruire().size();j++){
                      nbHotels=nbHotels+joueur.getProprietesAConstruire().get(j).getNb_Hotels();
                    }
        }
        return nbHotels;
    }
    public int getNbMaisons(){
        int nbMaisons=0;
        for (Joueur joueur : this.Joueurs) {
            
                    for(int j=0;j<joueur.getProprietesAConstruire().size();j++){
                      nbMaisons=nbMaisons+joueur.getProprietesAConstruire().get(j).getNb_Maisons();
                    }
        }
        return nbMaisons;
    }
     public void payer(int $prix$,Joueur j){
             j.payer($prix$);
           if($prix$!= j.payer($prix$)){
             this.EstEliminé(j);
           }
}
}  

