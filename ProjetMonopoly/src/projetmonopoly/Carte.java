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
public class Carte {
    public String nomCarte;
    public  int numCarte;
    public boolean chance;
    private Monopoly monopoly;


public Carte(int numCarte, String nomCarte, boolean b,Monopoly monopoly) {
    
        this.nomCarte=nomCarte;
        this.numCarte=numCarte;
        this.chance=b;
        this.monopoly = monopoly;
    }

    /**
     * @return the numCarte
     */
    public int getNumCarte() {
        return numCarte;
    }

    /**
     * @return the nomCarte
     */
    public String getNomCarte() {
        return nomCarte;
    }

    /**
     * @param nomCarte the nomCarte to set
     */
    public void setNomCarte(String nomCarte) {
        this.nomCarte = nomCarte;
    }

    /**
     * @param numCarte the numCarte to set
     */
    public void setNumCarte(int numCarte) {
        this.numCarte = numCarte;
    }

    /**
     * @return the chance
     */
    public boolean isChance() {
        return chance;
    }

    /**
     * @param chance the chance to set
     */
    public void setChance(boolean chance) {
        this.chance = chance;
    }
  
    public void action(Joueur j,Boolean b){
        this.getMonopoly().getInterf().afficherCarte(this.getNomCarte());
       if(this.getNumCarte()==17){
           j.setCarte_Caisse_Prison(true);
       }
       
       
       
    else  if(this.getNumCarte()==1){
           j.setCarte_Chance_Prison(true);
       }
       
       
      
      }
    
  

    /**
     * @return the monopoly
     */
    public Monopoly getMonopoly() {
        return monopoly;
    }

    /**
     * @param monopoly the monopoly to set
     */
    public void setMonopoly(Monopoly monopoly) {
        this.monopoly = monopoly;
    }
}
