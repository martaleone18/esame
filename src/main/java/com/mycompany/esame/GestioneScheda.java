/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.esame;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class GestioneScheda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nome;
        String cognome;
        int annoNascita;
        int anni;
        int annoCorrente = 2019;
        int fasciaGiovaneMin = 0;
        int fasciaGiovaneMax = 18;
        int fasciaAdultoMin = 18;
        int fasciaAdultoMax = 60;
        String risultato = " ";
        nome = JOptionPane.showInputDialog("dimmi il nome");
        cognome = JOptionPane.showInputDialog("dimmi il cognome");
        String Nascita = JOptionPane.showInputDialog("dimmi la data di nascita");
        annoNascita = Integer.parseInt(Nascita);
        anni = annoCorrente - annoNascita;
        risultato += nome + " " + cognome + " " + annoNascita + " di anni " + anni + " " + "\n";

        if (anni >= fasciaGiovaneMin && anni <= fasciaGiovaneMax) {
            risultato += "tipo:" + "giovane" + "\n";
        } else {
        }

        if (anni > fasciaAdultoMin && anni <= fasciaAdultoMax) {
            risultato += "tipo:" + "adulto" + "\n";

        } else {
            risultato += "tipo:" + "senior" + "\n";

        }

        System.out.println(risultato);

    }

}

