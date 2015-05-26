package projetmonopoly;


import java.util.ArrayList;

public class ProprieteAConstruire extends CarreauPropriete {
	private int _nbMaisons = 32;
	private int _nbHotels = 12;
	private ArrayList<Integer> _loyerMaison = new ArrayList<Integer>();
	private Groupe _groupePropriete;

    public ProprieteAConstruire(int _numero, String _nomCarreau, Monopoly _monopoly, int _loyerBase, int _prixAchat) {
        super(_numero, _nomCarreau, _monopoly, _loyerBase, _prixAchat);
    }
        

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

    public ArrayList<Integer> getLoyerMaison() {
        return _loyerMaison;
    }

    public void setLoyerMaison(ArrayList<Integer> _loyerMaison) {
        this._loyerMaison = _loyerMaison;
    }

    public Groupe getGroupePropriete() {
        return _groupePropriete;
    }

    public void setGroupePropriete(Groupe _groupePropriete) {
        this._groupePropriete = _groupePropriete;
    }
        
}