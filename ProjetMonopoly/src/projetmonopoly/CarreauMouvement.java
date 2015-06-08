package projetmonopoly;

public class CarreauMouvement extends CarreauAction {

    public CarreauMouvement(int _numero, String _nomCarreau, Monopoly _monopoly) {
        super(_numero, _nomCarreau, _monopoly);
    }
    
    @Override
    public void action(Joueur j){
        j.setPositionCourante(this.getMonopoly().getCarreau().get(10));
        
        
    }
}