/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetmonopoly;



public  class CarteVoyager extends Carte {
	private Carreau carreau;
        
        public CarteVoyager(int numCarte, String nomCarte, boolean b,Carreau carreau,Monopoly m) {
        super(numCarte, nomCarte, b,m);
        this.carreau = carreau;
     
    }

     @Override
      public void action(Joueur j,Boolean b){
         if(this.getNumCarte()==26 ||this.getNumCarte()==8){
       j.setTempsPrison(-1);
       j.setPositionCourante(this.getMonopoly().getCarreau().get(10));
       }
         else{
                         j.setPositionCourante(this.getCarreau());

             
         
                    }
      }

    /**
     * @return the carreau
     */
    public Carreau getCarreau() {
        return carreau;
    }

    /**
     * @param carreau the carreau to set
     */
    public void setCarreau(Carreau carreau) {
        this.carreau = carreau;
    }
}

