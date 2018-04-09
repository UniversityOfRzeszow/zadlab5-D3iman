/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

public class Liczba {
    
    private int liczba;
    private int tab[];
    
    public Liczba(int liczba){
        this.liczba = liczba;
    }
    
    public int wielkoscTablicy(int liczba){
        int i = 1;
        while(liczba/10 != 0){
            liczba = liczba / 10;
            i++;
        }
        return i;
    }
    
    public void wpiszIwypisz(){
        int tab[] = new int[wielkoscTablicy(liczba)];
        int pomocnicza = liczba;
        for(int i = 0;i < tab.length;i++){
            tab[i] = pomocnicza % 10;
            pomocnicza /= 10;
        }
        System.out.println("Liczba to: ");

        for(int j = wielkoscTablicy(liczba)-1;j >= 0;j--){
            System.out.print(tab[j]);
        }
        System.out.println();
    }
    
    
    public void mnozenie(int mnoznik){
        System.out.println("Mnozenie tablicy...");
        liczba *= mnoznik;
        wielkoscTablicy(liczba);
        wpiszIwypisz();
    }
    
}
