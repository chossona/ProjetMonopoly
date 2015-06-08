package projetmonopoly;

import java.util.ArrayList;
import java.util.LinkedList;

public class Monopoly_1 {
	private int _nbMaisons = 32;
	private int _nbHotels = 12;
	private Carreau _carreaux;
	private ArrayList<Joueur> _joueurs = new ArrayList<Joueur>();
	public Interface _interface_3;
        private LinkedList<Carte> carteChance;
        private LinkedList<Carte> carteCaisse;

    public int getNbMaisons() {
        return _nbMaisons;
    }

    public void setNbMaisons(int _nbMaisons) {
        this._nbMaisons = _nbMaisons;
    }

    public int getNbHotels() {
        return _nbHotels;
    }

    public void setNbHotels(int _nbHotels) {
        this._nbHotels = _nbHotels;
    }

    public Carreau getCarreaux() {
        return _carreaux;
    }

    public void setCarreaux(Carreau _carreaux) {
        this._carreaux = _carreaux;
    }

    public ArrayList<Joueur> getJoueurs() {
        return _joueurs;
    }

    public void setJoueurs(ArrayList<Joueur> _joueurs) {
        this._joueurs = _joueurs;
    }

    public Interface getInterface_3() {
        return _interface_3;
    }

    public void setInterface_3(Interface _interface_3) {
        this._interface_3 = _interface_3;
    }

    /**
     * @return the carteChance
     */
    public LinkedList<Carte> getCarteChance() {
        return carteChance;
    }

    /**
     * @return the carteCaisse
     */
    public LinkedList<Carte> getCarteCaisse() {
        return carteCaisse;
    }
    
 
}