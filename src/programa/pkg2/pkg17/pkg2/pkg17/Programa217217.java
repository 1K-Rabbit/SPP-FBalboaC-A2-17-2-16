/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.pkg2.pkg17.pkg2.pkg17;
import java.util.Scanner;
/**
 *
 * @author FabricioArturo
 */
public class Programa217217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
solicitarDato();
    
    }
    
    public static void solicitarDato(){
        int numero, suma;
        suma = 0;
        do {
            System.out.println("Inserta numero para sumar:");
            Scanner kb = new Scanner(System.in);
            numero = kb.nextInt();
            if (numero < 0){
                System.out.println("La suma  es: " + suma);
             System.exit(0);
            } else {
            suma = suma + numero;
            }
        } while (numero >= 0);
        System.out.println("La suma es: " + suma);
        }
    
}