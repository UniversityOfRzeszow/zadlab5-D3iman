/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Firma {
    
    private Pracownik tab[] = new Pracownik[100];
    Scanner input = new Scanner(System.in);
    
    public void dodajPracownika(int n){
        System.out.println("Podaj imie: ");
        tab[n].imie = input.next();
        System.out.println("Podaj nazwisko: ");
        tab[n].nazwisko = input.next();
        System.out.println("Podaj wiek: ");
        tab[n].wiek = input.nextInt();
        System.out.println("Podaj stanowisko: ");
        tab[n].stanowisko = input.nextInt();
    }
    
    public void spisPracownikow(){
        System.out.println("Spis pracownikow: ");
        for(int i = 0;i < tab.length; i++){
            System.out.println("---------------------------------");
            tab[i].pokazDane();
        }
    }
    
}
