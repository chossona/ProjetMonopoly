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
        
        public CarteDeplacer(int numCarte, String nomCarte, boolean b,int carreau) {
        super(numCarte, nomCarte, b);
        this.carreau = carreau;
     
    }}

