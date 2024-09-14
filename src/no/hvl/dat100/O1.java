package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class O1 {

    public static void main(String[] args) {
        String penger = showInputDialog("Bruttoinntekt: ");
        int bruttoInntekt = Integer.parseInt(penger);
        double trinnskatt = 0;

        if (bruttoInntekt > 1350000) {
            trinnskatt += (bruttoInntekt - 1350000) * 0.176;
            bruttoInntekt = 1350000; 
        }
        
        if (bruttoInntekt > 937900) {
            trinnskatt += (bruttoInntekt - 937900) * 0.166;
            bruttoInntekt = 937900;
        }
        
        if (bruttoInntekt > 670000) {
            trinnskatt += (bruttoInntekt - 670000) * 0.136;
            bruttoInntekt = 670000;
        }
        
        if (bruttoInntekt > 292850) {
            trinnskatt += (bruttoInntekt - 292850) * 0.04;
            bruttoInntekt = 292850;
        }
        
        if (bruttoInntekt > 208050) {
            trinnskatt += (bruttoInntekt - 208050) * 0.017;
        }

        System.out.printf("Trinnskatt: %.2f kr", trinnskatt);
    }
}
