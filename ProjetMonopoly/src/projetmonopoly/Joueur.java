package projetmonopoly;

import java.util.ArrayList;

public class Joueur {
	public String _nomJoueur;
	public int _cash;
	public Monopoly _monopoly;
	public ArrayList<Compagnie> _compagnies = new ArrayList<>();
	public ArrayList<Gare> _gares = new ArrayList<>();
	public Carreau _positionCourante;
	public ArrayList<ProprieteAConstruire> _proprietesAConstruire = new ArrayList<>();

        public int tempsPrison; 
     public Joueur(String _nomJoueur, int _cash, Monopoly _monopoly, Carreau _positionCourante) {
         
        this._nomJoueur = _nomJoueur;
        this._cash = _cash;
        this._monopoly = _monopoly;
        this._positionCourante = _positionCourante;
        this.tempsPrison = 0;
        this._compagnies = null;
        this._gares = null;
        this._proprietesAConstruire =null;
    }
        
    

    public String getNomJoueur() {
        return _nomJoueur;
    }

    public void setNomJoueur(String _nomJoueur) {
        this._nomJoueur = _nomJoueur;
    }

    public int getCash() {
        return _cash;
    }

    public void setCash(int _cash) {
        this._cash = _cash;
    }

    public Monopoly getMonopoly() {
        return _monopoly;
    }

    public void setMonopoly(Monopoly _monopoly) {
        this._monopoly = _monopoly;
    }

    public ArrayList<Compagnie> getCompagnies() {
        return _compagnies;
    }

    public void setCompagnies(ArrayList<Compagnie> _compagnies) {
        this._compagnies = _compagnies;
    }

    public ArrayList<Gare> getGares() {
        return _gares;
    }

    public void setGares(ArrayList<Gare> _gares) {
        this._gares = _gares;
    }

    public Carreau getPositionCourante() {
        return _positionCourante;
    }

    public void setPositionCourante(Carreau _positionCourante) {
        this._positionCourante = _positionCourante;
    }

    public ArrayList<ProprieteAConstruire> getProprietesAConstruire() {
        return _proprietesAConstruire;
    }

    public void setProprietesAConstruire(ArrayList<ProprieteAConstruire> _proprietesAConstruire) {
        this._proprietesAConstruire = _proprietesAConstruire;
    }


    /**
     * @return the tempsPrison
     */
    public int getTempsPrison() {
        return tempsPrison;
    }

    /**
     * @param tempsPrison the tempsPrison to set
     */
    public void setTempsPrison(int tempsPrison) {
        this.tempsPrison = tempsPrison;
    }

    
    public boolean joueurVie(int _cash){
        return _cash>=0;
        
    }
    
    
    }



