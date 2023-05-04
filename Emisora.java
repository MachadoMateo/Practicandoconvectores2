/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emisora;

import java.util.Scanner;



/**
 *
 * @author desarrollo
 */
public class Emisora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objread=new Scanner(System.in);
        int[] boletas=new int[100];
        int pos=-1,ced_bus,sw,j;
        String resp;
        System.out.print(" ¿Desea ingresar un oyente?");
        resp=objread.next();
        while(!resp.equals("NO")){
            System.out.print(" Cedula del oyente ");
            ced_bus=objread.nextInt();
            sw=0;
            j=0;
            while(j <= pos && sw == 0)
                  if(boletas[j] == ced_bus)
                      sw=1;
                  else 
                      j++;
                  if (sw == 0){
                      pos++;
                      boletas[pos]=ced_bus;
                      System.out.print("Boleta Asignada a " + ced_bus);
                  }else
                      System.out.print(" Cedula ya registrada ");
            System.out.print(" ¿ Desea ingresar otro oyente ? ");
            resp=objread.next();
        }
        
        
        
    }

    
}
    

