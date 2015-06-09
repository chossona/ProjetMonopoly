/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetmonopoly;

import java.util.LinkedList;

/**
 *
 * @author chossona
 */
public class test {
    
    public static void main(String[] args) {
        Monopoly m = new Monopoly("/users/info/etu-s2/chossona/data.txt");

        Interface inter = new Interface();//initialise l'interface
        inter.setMonopoly(m);
        m.InitialiseInterface(inter);
        
        m.InitialiseCartes("/users/info/etu-s2/chossona/dataCartesChances.txt",true);//initialise carte chance
        
        m.InitialiseCartes("/users/info/etu-s2/chossona/dataCartesCaisses.txt",false);
        
        m.initialiseTas();//melange les tas
        
        m.InitialiserPartie();//initailise joueurs
        
        m.getInterf().affichagePlateau();

       
    }
}
