/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author afbo2
 */
public class util {
    
    
    public void InserirIcon (JFrame frm){
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("img/loja-de-aplicativos.png"));
        } catch (Exception e) {
        }
    }
            
}
