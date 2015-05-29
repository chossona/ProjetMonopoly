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
public class test {
    
    public static void main(String[] args) {
        Monopoly monopoly = new Monopoly(null);
        monopoly.SetDés();
        System.out.println(monopoly.getD1());
        System.out.println(monopoly.getD2());
        
    }
}
