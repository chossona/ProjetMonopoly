/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetmonopoly;

/**
 *
 * @author chossona
 */

public  class CarteDeplacer extends Carte {
	private int carreau;
        
        public CarteDeplacer(int numCarte, String nomCarte, boolean b,int carreau, Monopoly m) {
        super(numCarte, nomCarte, b, m);
        this.carreau = carreau;
     
    }


@Override
public void action(Joueur j,Boolean b){
        this.getMonopoly().getInterf().afficherCarte(this.getNomCarte());

if(this.getNumCarte()==2){
        j.setPositionCourante(this.getMonopoly().getCarreau().get(this.getMonopoly().getCarreau().indexOf(j.getPositionCourante())-this.getCarreau()));
        }
}
    /**
     * @return the carreau
     */
    public int getCarreau() {
        return carreau;
    }

    /**
     * @param carreau the carreau to set
     */
    public void setCarreau(int carreau) {
        this.carreau = carreau;
    }

}

