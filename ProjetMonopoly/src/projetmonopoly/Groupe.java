package projetmonopoly;
import java.util.ArrayList;

public class Groupe {
	private int _prixAchatMaison;
	private int _prixAchatHotel;
	public CouleurPropriete _couleur;
	public ArrayList<ProprieteAConstruire> _proprietes = new ArrayList<ProprieteAConstruire>();

    public Groupe(int _prixAchatMaison, int _prixAchatHotel, CouleurPropriete _couleur) {
        this._prixAchatMaison = _prixAchatMaison;
        this._prixAchatHotel = _prixAchatHotel;
        this._couleur = _couleur;
    }
public void ajouterropriete (CarreauPropriete propriete){
    ArrayList prop = getProprietes();
    prop.add(propriete);
    setProprietes(prop);
}

    /**
     * @return the _proprietes
     */
    public ArrayList<ProprieteAConstruire> getProprietes() {
        return _proprietes;
    }

    /**
     * @param _proprietes the _proprietes to set
     */
    public void setProprietes(ArrayList<ProprieteAConstruire> _proprietes) {
        this._proprietes = _proprietes;
    }

    /**
     * @return the _couleur
     */
    public CouleurPropriete getCouleur() {
        return _couleur;
    }
}
    