/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.max;

/**
 *
 * @author Miguel
 */
public class MasGrande {

    //Número Máximo
    public static int max(int[] a) {
        
        int i, m = 0;
        for (i = 0; i < a.length; i++) {
            
            //Recogemos en "m" el numero más grande, a[i] mayor que me actual, m=a[i]
            if (a[i] > m) {
                m = a[i];
            }
        }
        
        return m;
    }

}
