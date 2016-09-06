/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author jpayares4
 */
public class Fraccionarios {
    private int numerador;
     private int denominador;
     
     public Fraccionarios (int numerador, int denominador){
         this.numerador=numerador;
         this.denominador=denominador;
         
     }
     public int getNumerador(){
         return numerador;
         
     }
     public int getDenominador(){
         return denominador;
     }
     public int setDenominador(){
         return denominador;
     }
     public void setDenominador(int denominador) {
        this.denominador=denominador;
        
    }
     public Fraccionarios sumar(Fraccionarios f2){
     Fraccionarios f;
     int num, den;
     
     num=this.numerador * f2.denominador + this.denominador * f2.numerador;
     den = this.denominador * f2. denominador;
     f=new Fraccionarios (num,den);
     return f;
     }
 public Fraccionarios restar(Fraccionarios f2){
     Fraccionarios f;
     int num, den;
     
     num=this.numerador * f2.denominador - this.denominador * f2.numerador;
     den = this.denominador * f2. denominador;
     f=new Fraccionarios (num,den);
     return f;
 }
}
