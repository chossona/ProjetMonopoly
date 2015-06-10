package projetmonopoly;

public class Compagnie extends CarreauPropriete {

    public Compagnie(int _loyerBase, int _prixAchat, Joueur _proprietaire, int _numero, String _nomCarreau, Monopoly _monopoly) {
        super(_loyerBase, _prixAchat, _proprietaire, _numero, _nomCarreau, _monopoly);
    }

    @Override
    public int calculLoyerPropriété() {
        if (this.getProprietaire().getCompagnies().size() == 2) {
            return (this.getMonopoly().getD1() + this.getMonopoly().getD2()) * 20;
        } else {
            return (this.getMonopoly().getD1() + this.getMonopoly().getD2()) * 10;
        }
    }

}
