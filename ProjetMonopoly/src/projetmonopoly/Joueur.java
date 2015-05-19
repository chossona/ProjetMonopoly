package projetmonopoly;

import java.util.ArrayList;

public class Joueur {
	private String _nomJoueur;
	private int _cash = 1500;
	private Monopoly _monopoly;
	private ArrayList<Compagnie> _compagnies = new ArrayList<Compagnie>();
	private ArrayList<Gare> _gares = new ArrayList<Gare>();
	private Carreau _positionCourante;
	private ArrayList<ProprieteAConstruire> _proprietesAConstruire = new ArrayList<ProprieteAConstruire>();

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
        
}