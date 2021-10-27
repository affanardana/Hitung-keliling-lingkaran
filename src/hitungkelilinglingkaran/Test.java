/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungkelilinglingkaran;

/**
 *
 * @author USER
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran lingkaranKecil = new Lingkaran();
        
        System.out.println("Hasil keliling lingkaran: " 
                + lingkaranKecil.Result(7.0));
    }
    

    
}
class Lingkaran {
    final double PHI = 3.14;
    
    public double Result(double r){
        return 2 * PHI * r;
    }
}
