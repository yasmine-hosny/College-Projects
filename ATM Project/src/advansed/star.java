/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advansed;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mega
 */
public class star extends Thread {
    @Override
    public void run() {
        for(int i=0; i<=5;i++) {
            System.out.print("*");
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(star.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("");
    }
}
