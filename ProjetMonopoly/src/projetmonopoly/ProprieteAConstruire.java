package projetmonopoly;


import java.util.ArrayList;

public class ProprieteAConstruire extends CarreauPropriete {
	private int _nbMaisons = 0;
	private int _nbHotels = 0;
	private ArrayList<Integer> _loyerMaison = new ArrayList<Integer>();
	private Groupe _groupePropriete;

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