package projetmonopoly;

public class CarreauTirage extends CarreauAction {

    public CarreauTirage(int _numero, String _nomCarreau, Monopoly _monopoly) {
        super(_numero, _nomCarreau, _monopoly);
    }

    @Override
    public void action(Joueur j){
        
    
        Carte c;

        if (this.getNumero() == 7 || this.getNumero() == 22 || this.getNumero() == 36) {
            c = this.getMonopoly().getCarteChance().getFirst();
           
            if (c.getNumCarte() == 1) {
                this.getMonopoly().getCarteChance().remove(c);
                 c.action(j,false);
            } else {
                this.getMonopoly().getCarteChance().remove(c);
                this.getMonopoly().getCarteChance().offer(c);
                c.action(j,false);
            }
            
        } else if (this.getNumero() == 2 || this.getNumero() == 17 || this.getNumero() == 33) {
            c = this.getMonopoly().getCarteCaisse().getFirst();
            
            if (c.getNumCarte() == 17) {
                this.getMonopoly().getCarteCaisse().remove(c);
                j.setCarte_Caisse_Prison(true);
                c.action(j, Boolean.TRUE);
            } else {
                this.getMonopoly().getCarteCaisse().remove(c);
                this.getMonopoly().getCarteCaisse().offer(c);
                 c.action(j, Boolean.TRUE);

            }
           

        }
        
    }
    

}

