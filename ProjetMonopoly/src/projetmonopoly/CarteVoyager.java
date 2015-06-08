/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetmonopoly;



public  class CarteVoyager extends Carte {
	private Carreau carreau;
        
        public CarteVoyager(int numCarte, String nomCarte, boolean b,Carreau carreau) {
        super(numCarte, nomCarte, b);
        this.carreau = carreau;
     
    }}

