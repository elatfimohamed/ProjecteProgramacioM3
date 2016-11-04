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
        char mostrar;
        Scanner entrada = new Scanner(System.in);
        
        
        

        int opcio;         // l'opció introduïda per l'usuari

        //Bucle per mostra el menú
        do {

            System.out.println("+------------------------ MENU ------------------------+");
            System.out.println("| 0. Sortir del programa.                              |");
            System.out.println("| 1. Introdueix una via.                               |");
            System.out.println("| 2. Borrar Via                                        |");
            System.out.println("| 3. Modificar Via                                     |");
            System.out.println("| 4. Llistar Vies                                      |");
            System.out.println("| 5. Recuperar Vies                                     |");
            System.out.println("+------------------------------------------------------+");
            System.out.print("--> Tria una opció: ");

            switch (opcio = entrada.nextInt()) {

                case 1:
                    if (!omplit) { //omplit==false
                         System.out.println("Introdueix una via:");
                         nomvia= entrada.skip("[\r\n]*").nextLine();
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

                        System.out.println("Longitut que te (1000M)");
                        longitut = entrada.nextFloat();
                        System.out.println("Desnivel que te (1000) ");
                        desnivel = entrada.nextInt();
                        omplit = true;
                    }

                    break;
                case 2:
                    if (omplit) {
                        System.out.println("Vols veure la via (S/N)?:");
                        mostrar = entrada.next().charAt(0);
                        do {
                            switch (mostrar) {
                                case 'S':
                                case 's':
                                    System.out.println("nomvia     :" + nomvia);
                                    System.out.println("localitat  :" + localitat);
                                    System.out.println("regio      :" + regio);
                                    System.out.println("provincia  :" + provincia);
                                    System.out.println("dificultat :" + esdificultat);
                                    System.out.println("material   :" + esmaterial);
                                    System.out.println("longitut   :" + longitut);
                                    System.out.println("desnivel   :" + desnivel);
                                    mostrar = 'N';
                                    break;
                                case 'N':
                                case 'n':
                                    System.out.println("Ok");
                                    break;
                                default:
                                    System.out.println("No es valida");
                                    System.out.println("Vols veure les vies ? (S/N)?:");
                                    mostrar = entrada.next().charAt(0);
                                    break;
                            }
                        } while (mostrar != 'N');
                        System.out.println("Vols borrar la via (S/N)?:");
                        mostrar = entrada.next().charAt(0);
                        switch (mostrar) {
                            case 'S':
                            case 's':
                                nomvia = null;
                                localitat = null;
                                provincia = null;
                                dificultat = false;
                                material = false;
                                longitut = 0;
                                desnivel = 0;
                                omplit = false;
                                break;
                            case 'N':
                            case 'n':
                                System.out.println("La informacio No esta borrada!!!");
                                break;
                            default:
                                System.out.println("La opcio No ES VALIDA!!");
                                System.out.println("Vols borrar les dades (S/N)?:!!");
                                mostrar = entrada.next().charAt(0);
                                break;
                        }
                    } else {
                        System.out.println("No HI HAN DADES!!!");
                    }

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
