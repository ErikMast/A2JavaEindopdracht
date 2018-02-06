package nl.drenthecollege.modules;

import nl.drenthecollege.modules.a2.Vermenigvuldiging;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Erik Mast <e.mast@drenthecollege.nl>
 */
public class ModuleOpdrachten {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vermenigvuldiging v = new Vermenigvuldiging();
        v.info = true;
        
        System.out.println("4 * 3 = "+Integer.toString(v.vermenigvuldig(4, 3)));
        System.out.println("6 * 5 = "+Integer.toString(v.vermenigvuldig(6, 5)));
    }
    
}
