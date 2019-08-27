/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GianlucaMassa.sistema;
import javax.swing.JOptionPane;
/**
 *
 * @author programacion
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Sumar suma= new Sumar (0,0);
        Restar resta= new Restar (0,0);
        Multiplicar multiplicacion= new Multiplicar (0,0);
        Division dividir= new Division (0,0);
             int op;
    JOptionPane.showMessageDialog(null,"Calculadora por Gianluca Massa!");
    op= Integer.parseInt(JOptionPane.showInputDialog("Elija una Funcion:"+" "+"1.Sumar\n"+ "2.Restar\n" + "3.multiplicar\n" + "4.Dividir\n" + "5.Salir\n"));
               
        int opcion= 0;
        
        //SUMA
       switch (op){
        
        case 1:
       suma.valor1=Integer.parseInt(JOptionPane.showInputDialog("Bot Luca: Ingrese el primer Valor a sumar"));
       suma.valor2=Integer.parseInt(JOptionPane.showInputDialog("Bot Luca: Ingrese el segundo Valor a sumar"));
       
       JOptionPane.showMessageDialog(null,"TOTAL Suma:"+" "+(suma.valor1+ suma.valor2));
       
       
       
       break;
       
       
       //RESTA
       
        case 2:
       resta.valor1=Integer.parseInt(JOptionPane.showInputDialog("Bot Luca: Ingrese el primer Valor a restar"));
       resta.valor2=Integer.parseInt(JOptionPane.showInputDialog("Bot Luca: Ingrese el segundo Valor a restar"));
       
       JOptionPane.showMessageDialog(null,"TOTAL Resta:"+" "+(resta.valor1 - resta.valor2));
       
       
       break;
       
       
       //MULTIPLICACION
        case 3:
       multiplicacion.valor1=Integer.parseInt(JOptionPane.showInputDialog("Bot Luca: Ingrese el primer Valor a multiplicar"));
       multiplicacion.valor2=Integer.parseInt(JOptionPane.showInputDialog("Bot Luca: Ingrese el segundo Valor a multiplicar"));
       
       JOptionPane.showMessageDialog(null,"TOTAL Multiplicacion:"+" "+(multiplicacion.valor1 * multiplicacion.valor2));
       
       break;
       
       //DIVIDIR
        case 4:
       dividir.valor1=Integer.parseInt(JOptionPane.showInputDialog("Bot Luca: Ingrese el primer Valor a dividir"));
       dividir.valor2=Integer.parseInt(JOptionPane.showInputDialog("Bot Luca: Ingrese el segundo Valor a dividir"));
       
       JOptionPane.showMessageDialog(null,"TOTAL Division:"+" "+(dividir.valor1 / dividir.valor2));
       
       break;
       //SALIR
       
        case 5:
        JOptionPane.showMessageDialog(null,"Gracias por utilizar la calculadora, Adios.!");
           
       }
       
       
       
       
      
       
       
       
     
       
       
      
       
     
    
       
       
       
       
        
      
        
        // TODO code application logic here
    }

    private static void Sumar(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
