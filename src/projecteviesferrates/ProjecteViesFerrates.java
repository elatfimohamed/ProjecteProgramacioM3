/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteviesferrates;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ProjecteViesFerrates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         boolean material = false, casco = false, arnes = false, tercebaga = false, buitcorda = false, guants = false, calsat = false;
        String nomvia = null, localitat = null, regio = null, provincia = null;
        int desnivel = 0;
        float longitut = 0;
        char dificultat = ' ';

        Scanner entrada = new Scanner(System.in);

        int opcio;         // l'opció introduïda per l'usuari

        //Bucle per mostra el menú
        do {
            System.out.println("<------------------------>");
            System.out.println("\nMENU");
            System.out.println("0.Sortir del programa");
            System.out.println("1.Introdueix una via");
            System.out.println("2. Borrar Via ");
            System.out.println("3. Modificar via ");
            System.out.println("4. Llistar Vies");
            System.out.println("");
            System.out.println("Tria una opció:");
            System.out.println("<------------------------>");

            switch (opcio = entrada.nextInt()) {

                case 1:
                    System.out.println("Introdueix una via:");

                    break;
                case 2:
                    System.out.println("Borrar Via :");

                    break;
                case 3:
                    System.out.println("Modificar via:");

                    break;

                case 4:
                    System.out.println("Llistar Viess :");

                case 0:
                    System.out.println("Sortim del programa.");
                    break;

                default:
                    System.out.println("La opcio introduida  !!! NO ES  VALID !!!\n\n");

            }

        } while (opcio != 0);

    }

}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   
