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
 
    //numero de caselles maxim de l'array 
    public static final int MAX_VIES = 2;

    //Array on guardarem la informacio del les vies 
    public static Via[] array = new Via[MAX_VIES];

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {


       
       // 
        for (int i = 0; i < array.length; i++) {
            array[i]=new Via();
            array[i].setOmplit(false);
        }
 
        
        

        // Les meues propietats
        String nomvia = null, localitat = null, regio = null, provincia = null;
        boolean material = false;
        boolean dificultat = false;
        int desnivel = 0;
        float longitut = 0;
        char esdificultat = ' ';
        char esmaterial = ' ';
        boolean omplit = false;
        char mostrar;
        char modificar;

        Scanner entrada = new Scanner(System.in);

        int opcio;         // l'opció introduïda per l'usuari

        //Bucle per mostra el menú
        do {

            System.out.println("+------------------------ MENU ------------------------+");
            System.out.println("| 0. Sortir del programa.                               |");
            System.out.println("| 1. Introdueix una via.                                |");
            System.out.println("| 2. Borrar Via                                         |");
            System.out.println("| 3. Modificar Via                                      |");
            System.out.println("| 4. Llistar Vies                                       |");
            System.out.println("| 5. Recuperar Vies                                     |");
            System.out.println("+------------------------------------------------------+");
            System.out.print("--> Tria una opció: ");

            switch (opcio = entrada.nextInt()) {

                case 1:
                   // if (i<array.length){
                    
                   if (!omplit) { //omplit==false
                       
                        System.out.println("Introdueix una via:");
                       nomvia = entrada.skip("[\r\n]*").nextLine();
                        // array[i].setNomvia(entrada.skip("[\r\n]*").nextLine());
                         
                        System.out.println("Introdueix localitat");
                        localitat = entrada.nextLine();
                        //array[i].getLocalitat();
                   
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
                                    System.out.println("dacort");
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
                                regio = null;
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
                    if (!omplit) {
                        System.out.println("No hi ha cap Via per modificar; si el vols modificar l'hauràs d'introduïr primer.\n" + "");
                    }

                    if (omplit) {

                        do {

                            System.out.println("Vols veure la informacio del Via? (S/N)");
                            mostrar = entrada.skip("[\r\n]*").nextLine().charAt(0);

                        } while (mostrar != 's' && mostrar != 'n' && mostrar != 'S' && mostrar != 'N');

                        if (mostrar == 's' || mostrar == 'S') {
                            System.out.println("Informacio de la via  : ");
                            System.out.println("Nomvia:    :" + nomvia);
                            System.out.println("Localitat: :" + localitat);
                            System.out.println("Provincia  :" + provincia);
                            System.out.println("Regio      :" + regio);
                            System.out.println("dificultat :" + dificultat);
                            System.out.println("Material   :" + material);
                            System.out.println("Longitut   :" + longitut);
                            System.out.println("Desnivel   :" + desnivel);

                        }

                        do {
                            //Modificar nomvia
                            System.out.println("Vols modificar la via  (S/N)?");
                            mostrar = entrada.skip("[\r\n]*").nextLine().charAt(0);

                        } while (mostrar != 's' && mostrar != 'n' && mostrar != 'S' && mostrar != 'N');

                        if (mostrar == 's' || mostrar == 'S') {

                            System.out.println("\nNomVia: " + nomvia);

                            do {
                                System.out.println("Vols modificar el nom de la via (S/N)?");
                                modificar = entrada.skip("[\r\n]*").nextLine().charAt(0);
                            } while (modificar != 's' && modificar != 'n' && modificar != 'S' && modificar != 'N');

                            if (modificar == 's' || modificar == 'S') {
                                System.out.println("Introdueix un Nou nom de Via:");
                                nomvia = entrada.skip("[\r\n]*").nextLine();
                            }

                            //Modificar localitat
                            System.out.println("\nLocalitat: " + localitat);

                            do {
                                System.out.println("Vols modificar la localitat (S/N)");
                                modificar = entrada.skip("[\r\n]*").nextLine().charAt(0);
                            } while (modificar != 's' && modificar != 'n' && modificar != 'S' && modificar != 'N');

                            if (modificar == 's' || modificar == 'S') {
                                System.out.println("Introdueix una nova localitat :");
                                nomvia = entrada.skip("[\r\n]*").nextLine();
                            }

                            // dificultat Si o NO 
                            if (dificultat) {
                                System.out.println("\nDificil : Sí");
                            }

                            if (!dificultat) {
                                System.out.println("\nDificlil : No");
                            }

                            do {
                                System.out.println("Vols modificar si és dificil (S/N)?");
                                modificar = entrada.skip("[\r\n]*").nextLine().charAt(0);
                            } while (modificar != 's' && modificar != 'n' && modificar != 'S' && modificar != 'N');

                            if (modificar == 's' || modificar == 'S') {
                                do {
                                    System.out.println("Introdueix el NOU valor per a dificil: (S/N)");
                                    esdificultat = entrada.skip("[\r\n]*").nextLine().charAt(0);

                                    if (esdificultat == 's' || esdificultat == 'S') {
                                        dificultat = true;
                                    }

                                    if (esdificultat == 'n' || esdificultat == 'N') {
                                        dificultat = false;
                                    }

                                } while (esdificultat != 's' && esdificultat != 'n' && esdificultat != 'S' && esdificultat != 'N');

                            }

                            // material  Si o NO 
                            if (material) {
                                System.out.println("\nMaterial : Sí");
                            }

                            if (!material) {
                                System.out.println("\nMaterial : No");
                            }

                            do {
                                System.out.println("Vols modificar si és dificil (S/N)?");
                                modificar = entrada.skip("[\r\n]*").nextLine().charAt(0);
                            } while (modificar != 's' && modificar != 'n' && modificar != 'S' && modificar != 'N');

                            if (modificar == 's' || modificar == 'S') {
                                do {
                                    System.out.println("Introdueix el NOU valor per a dificil: (S/N)");
                                    esmaterial = entrada.skip("[\r\n]*").nextLine().charAt(0);

                                    if (esmaterial == 's' || esmaterial == 'S') {
                                        dificultat = true;
                                    }

                                    if (esmaterial == 'n' || esmaterial == 'N') {
                                        dificultat = false;
                                    }

                                } while (esmaterial != 's' && esmaterial != 'n' && esmaterial != 'S' && esmaterial != 'N');

                            }

                            // Provincia
                            System.out.println("\nProvincia: " + provincia);

                            do {
                                System.out.println("Vols modificar la provincia ? (S/N)");
                                modificar = entrada.skip("[\r\n]*").nextLine().charAt(0);
                            } while (modificar != 's' && modificar != 'n' && modificar != 'S' && modificar != 'N');

                            if (modificar == 's' || modificar == 'S') {
                                System.out.println("Introdueix la nova provincia !!:");
                                provincia = entrada.skip("[\r\n]*").nextLine();
                            }

                            // Regio
                            System.out.println("\nRegio: " + regio);

                            do {
                                System.out.println("Vols modificar la regio?   (S/N)");
                                modificar = entrada.skip("[\r\n]*").nextLine().charAt(0);
                            } while (modificar != 's' && modificar != 'n' && modificar != 'S' && modificar != 'N');

                            if (modificar == 's' || modificar == 'S') {

                                System.out.println("Introdueix la Nova regio : ");
                                regio = entrada.skip("[\r\n]*").nextLine();
                            }

                            // Desnivel
                            System.out.println("\nDesnivel: " + desnivel);

                            do {
                                System.out.println("Vols modificar el valor del desnivel? (S/N)");
                                modificar = entrada.skip("[\r\n]*").nextLine().charAt(0);
                            } while (modificar != 's' && modificar != 'n' && modificar != 'S' && modificar != 'N');

                            if (modificar == 's' || modificar == 'S') {
                                do {
                                    System.out.println("Introdueix el nou valor del desnivel: (> 0)");
                                    desnivel = entrada.nextInt();

                                    if (desnivel <= 0) {
                                        System.out.println("Valor incorrecte!!");
                                    }

                                } while (desnivel <= 0);
                            }
                            // longitut 
                            System.out.println("\nLongitut: " + longitut);

                            do {
                                System.out.println("Vols modificar el valor la longitut ? (S/N)");
                                modificar = entrada.skip("[\r\n]*").nextLine().charAt(0);
                            } while (modificar != 's' && modificar != 'n' && modificar != 'S' && modificar != 'N');

                            if (modificar == 's' || modificar == 'S') {
                                do {
                                    System.out.println("Introdueix el nou valor de la  longitut: (> 0)");
                                    longitut = entrada.nextInt();

                                    if (longitut <= 0) {
                                        System.out.println("Valor incorrecte!!");
                                    }

                                } while (longitut <= 0);
                            }

                            System.out.println("\nVia modificada  correctament.\n");

                            break;
                        }

                    }

                    break;

                case 4:
                    if (omplit) {
                        System.out.println("nomVia           :" + nomvia);
                        System.out.println("locaitat         :" + localitat);
                        System.out.println("Regio            :" + regio);
                        System.out.println("Provincia        :" + provincia);
                        System.out.println("Dificultat (S/N) :" + dificultat);
                        System.out.println("Material (S/N)   :" + material);
                        System.out.println("Longitut         :" + longitut);
                        System.out.println("Desnivel         :" + desnivel);

                    } else {
                        System.out.println("NO HI HAN DADES!!!");

                    }

                    break;

                case 5:
                    omplit = true;

                    System.out.println("Informacio de Vies: ");

                    System.out.println("nomvia:       " + nomvia);
                    System.out.println("localitat:    " + localitat);
                    System.out.println("Regio:        " + regio);
                    System.out.println("provincia:    " + provincia);
                    System.out.println("material:     " + dificultat);
                    System.out.println("Longitut:     " + longitut);
                    System.out.println("Desnivel      " + desnivel);

                case 0:
                    System.out.println("Sortim del programa.");
                    break;

                default:
                    System.out.println("La opcio introduida  !!! NO ES  VALID !!!\n\n");

            }

        } while (opcio != 0);

    }

}
