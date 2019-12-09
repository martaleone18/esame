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

    static String nome;
    static String cognome;
    static int annoNascita;
    static int anni;
    static int annoCorrente = LocalDate.now().getYear();
    static int fasciaGiovaneMin = 0;
    static int fasciaGiovaneMax = 18;
    static int fasciaAdultoMin = 18;
    static int fasciaAdultoMax = 60;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //chiedere all'utente i suoi dati
        nome = JOptionPane.showInputDialog("dimmi il nome");
        cognome = JOptionPane.showInputDialog("dimmi il cognome");
        String Nascita = JOptionPane.showInputDialog("dimmi la data di nascita");
        annoNascita = Integer.parseInt(Nascita);

        //ottenere gli anni dell'utente dal suo anno di nascita
        anni = annoCorrente - annoNascita;

        
        String scheda = stampascheda();

        //stampare l'output
        System.out.println(stampascheda() + Tipologia());
    }

    //metodo per stampare scheda con informazioni ottenute dall'input
    static String stampascheda() {
        String risultato = " ";
        risultato += " nome: " + nome + " cognome: " + cognome + " nato/a nel " + annoNascita + " di anni " + anni + " " + "\n";
        return risultato;
    }
    
    //metodo con if per torvare la tipologia giovane,adulto,senior
    static String Tipologia () {
        String ris = " ";
        
        if (anni >= fasciaGiovaneMin && anni <= fasciaGiovaneMax) {
            ris += "tipo:" + "giovane" + "\n";
        } else {
            if (anni > fasciaAdultoMin && anni <= fasciaAdultoMax) {
                ris += "tipo:" + "adulto" + "\n";
            } else {
                ris += "tipo:" + "senior" + "\n";
            }
        }
        return ris;
    }

}
