package projetmonopoly;

import java.util.ArrayList;

public class Groupe {
	private int _prixAchatMaison;
	private int _prixAchatHotel;
	private CouleurPropriete _couleur;
	private ArrayList<ProprieteAConstruire> _proprietes = new ArrayList<ProprieteAConstruire>();

    public int getPrixAchatMaison() {
        return _prixAchatMaison;
    }

    public void setPrixAchatMaison(int _prixAchatMaison) {
        this._prixAchatMaison = _prixAchatMaison;
    }

    public int getPrixAchatHotel() {
        return _prixAchatHotel;
    }

    public void setPrixAchatHotel(int _prixAchatHotel) {
        this._prixAchatHotel = _prixAchatHotel;
    }

    public CouleurPropriete getCouleur() {
        return _couleur;
    }

    public void setCouleur(CouleurPropriete _couleur) {
        this._couleur = _couleur;
    }

    public ArrayList<ProprieteAConstruire> getProprietes() {
        return _proprietes;
    }

    public void setProprietes(ArrayList<ProprieteAConstruire> _proprietes) {
        this._proprietes = _proprietes;
    }
        
}