/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;


public class Zad3 {
    
    private int tab[];
    private int wskaznik=0;
    private int n;

    public Zad3(int n){
        this.n = n;
        this.tab = new int[n];
    }
    
    public void push(int liczba){
        if (wskaznik < n){
            System.out.println("Podana liczba dodana do stosu.");
            tab[wskaznik] = liczba;
            wskaznik++;
        }
        else{
            System.out.println("Stos pelny.");
        }
    }
    
    public void pop(){
            if(wskaznik!=0){
                if(wskaznik > 9) wskaznik--;
                System.out.println("Usuwanie wartosci ze stosu.");
                tab[wskaznik] = 0;
                wskaznik--;
            }
            else{
                System.out.println("Stos pusty.");
            }
    }
    
    public void pokazStos(){
        System.out.println("Wartosci na stosie:");
        for(int i = wskaznik-1;i >= 0; i--){
            System.out.println(tab[i]);
        }
    }
    
    
}
