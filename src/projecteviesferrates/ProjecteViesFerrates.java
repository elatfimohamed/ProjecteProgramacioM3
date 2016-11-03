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

        String nomvia = null, localitat = null, regio = null, provincia = null;
        boolean material = false;
        boolean dificultat = false;
        boolean omplit = false;
        int desnivel = 0;
        float longitut = 0;
        char esdificultat = ' ';
        char esmaterial = ' ';
        Scanner entrada = new Scanner(System.in);
        Scanner entNum = new Scanner(System.in);
        Scanner entText = new Scanner(System.in);
        int i;
        String text;

        int opcio;         // l'opció introduïda per l'usuari

        //Bucle per mostra el menú
        do {

            System.out.println("+------------------------ MENU ------------------------+");
            System.out.println("| 0. Sortir del programa.                              |");
            System.out.println("| 1. Introdueix una via.                               |");
            System.out.println("| 2. Borrar Via                                        |");
            System.out.println("| 3. Modificar Via                                     |");
            System.out.println("| 4. Llistar Vies                                      |");
            System.out.println("| 5. Recupera Vies                                     |");
            System.out.println("+------------------------------------------------------+");
            System.out.print("--> Tria una opció: ");

            switch (opcio = entrada.nextInt()) {

                case 1:
                    System.out.println("Introdueix una via:");
                    if(!omplit) {
                    text = entText.nextLine();
                    nomvia = entrada.nextLine();
                    System.out.println("Introdueix localitat");
                    localitat = entrada.nextLine();
                    System.out.println("Introdueix regio");
                    regio = entrada.nextLine();
                    System.out.println("Introdueix provincia");
                    provincia = entrada.nextLine();
                    System.out.println("És dificil o no ? (S/N):");
                    do {
                        esdificultat = entrada.nextLine().toUpperCase().charAt(0);

                    } while (esdificultat != 'S' && esdificultat != 'N');
                    dificultat = (esdificultat == 'S');

                    System.out.println("És necesari el us del material? (S/N)");
                    do {
                        esmaterial = entrada.nextLine().toUpperCase().charAt(0);

                    } while (esmaterial != 'S' && esmaterial != 'N');
                    material = (esmaterial == 'S');
                       System.out.println("Longitut ");
                        longitut=entrada.nextFloat();
                     
                    
                    omplit=true;
                    }
                
                    

                    break;
                case 2:
                    System.out.println("Borrar Via :");
                 

                    break;
                case 3:
                    System.out.println("Modificar via:");

                    break;

                case 4:
                    System.out.println("Llistar Viess :");
                    break;

                case 5:
                    System.out.println("Llistar Viess :");
                    break;

                case 0:
                    System.out.println("Sortim del programa.");
                    break;

                default:
                    System.out.println("La opcio introduida  !!! NO ES  VALID !!!\n\n");

            }

        } while (opcio != 0);

    }

}
