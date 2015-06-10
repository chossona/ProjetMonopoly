
package projetmonopoly;

/**
 *
 * @author chossona
 */
public class CarteArgent extends Carte  {
    private int argent;
    
     public CarteArgent(int numCarte, String nomCarte, boolean b,int argent, Monopoly m) {
        super(numCarte, nomCarte, b,m);
        this.argent = argent;
     
     }
    @Override
      public void action(Joueur j,Boolean b){
             this.getMonopoly().getInterf().afficherCarte(this.getNomCarte());

        if(this.getNumCarte()==3){
            int prix=0;
           for (ProprieteAConstruire proprietesAConstruire : j.getProprietesAConstruire()) {
               prix=prix+proprietesAConstruire.getNb_Maisons()*40;
               prix=prix+proprietesAConstruire.getNb_Hotels()*115;
           }
           this.getMonopoly().payer(this.getArgent(),j);
        }
        else if(this.getNumCarte()==5){
            int prix=0;
           for (ProprieteAConstruire proprietesAConstruire : j.getProprietesAConstruire()) {
               prix=prix+proprietesAConstruire.getNb_Maisons()*25;
               prix=prix+proprietesAConstruire.getNb_Hotels()*100;
           }
           this.getMonopoly().payer(this.getArgent(),j);
        }
        
        else{this.getMonopoly().payer(this.getArgent(),j);}
      }

      
    
      
      
    /**
     * @return the argent
     */
    public int getArgent() {
        return argent;
    }

    /**
     * @param argent the argent to set
     */
    public void setArgent(int argent) {
        this.argent = argent;
    }
    
        
    }
    

