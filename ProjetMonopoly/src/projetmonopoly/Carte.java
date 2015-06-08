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
    private String nomCarte;
    private  int numCarte;
    private boolean chance;

    public void ActionCarte() {
        
    }
public Carte(int numCarte, String nomCarte, boolean b) {
    
        this.nomCarte=nomCarte;
        this.numCarte=numCarte;
        this.chance=b;
    }

    /**
     * @return the numCarte
     */
    public int getNumCarte() {
        return numCarte;
    }
}
