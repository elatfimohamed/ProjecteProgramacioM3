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

    
private static int opcio;

   
       
      
          public static void main(String[] args) {

        inicialitzarVariables();
        do {
            demanarOpcio();
            tractarOpcio();
        } while (!opcioFinal());

    }
          
         public static void inicialitzarVariables() {
             
        for (int i = 0; i < array.length; i++) {
            array[i]=new Via();
            array[i].setOmplit(false);
        }
         }
         
 
        
        
public static void demanarOpcio() {
    
        Scanner entrada = new Scanner(System.in);

        System.out.println("+------------------------ MENU ------------------------+");
        System.out.println("| 0. Sortir del programa.                               |");
        System.out.println("| 1. Introdueix una via.                                |");
        System.out.println("| 2. Borrar Via                                         |");
        System.out.println("| 3. Modificar Via                                      |");
        System.out.println("| 4. Llistar Vies                                       |");
        System.out.println("| 5. Recuperar Vies                                     |");
        System.out.println("+------------------------------------------------------+");
        System.out.print("--> Tria una opció: ");
        opcio = entrada.nextInt();

    }

    public static void tractarOpcio() {

        switch (opcio) {
            case 0:
                System.out.println("Finc aviat ;)!!");
                break;
            case 1:
                introduirVia();
                break;
            case 2:
                borrarVia();
                break;

            case 3:
                modificarVia();
                break;
            case 4:
                llistarVia();
                break;
            case 5:
                recuperarVia();
                break;
            default:
                System.out.println("\nOpció incorrecta!!");
        }

    }

    public static boolean opcioFinal() {
        return opcio == 0;
    }

    public static void introduirVia() {
        Scanner entrada = new Scanner(System.in);

        int i;
        for (i = 0; i < array.length && array[i].isOmplit(); i++);

        //Si no sa sa arribat al final és que hem trobat una casella buida 
        if (i < array.length) {

            System.out.println("\nNomvia:");
            array[i].setNomvia(entrada.skip("[\r\n]*").nextLine());

            System.out.println("Introdueix localitat");
            array[i].setLocalitat(entrada.skip("[\r\n]*").nextLine());

            System.out.println("Introdueix provincia");
            array[i].setProvincia(entrada.skip("[\r\n]*").nextLine());

            System.out.println("Introdueix regio");
            array[i].setRegio(entrada.skip("[\r\n]*").nextLine());

            //si te dificultat o no ; 
            char esDificultat;

            do {
                System.out.println("És dificil o no ? (S/N):");

                esDificultat = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);

            } while (esDificultat != 'S' && esDificultat != 'N');

            array[i].setDificultat(esDificultat == 'S');
            array[i].setOmplit(true);

            //Si es necesari el mateial o no; 
            char esMaterial;

            do {

                System.out.println("És necesari el us del material? (S/N)");

                esMaterial = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);

            } while (esMaterial != 'S' && esMaterial != 'N');

            array[i].setDificultat(esMaterial == 'S');
            array[i].setOmplit(true);

            System.out.println("Longitut que te (1000M)");
            array[i].setLongitut(entrada.skip("[\r\n]*").nextInt());

            System.out.println("Desnivel que te (1000) ");
            array[i].setDesnivel(entrada.skip("[\r\n]*").nextInt());

        } else {
            System.out.println("\nNo hi caben més Vies, si vols, primer borra'n.");
        }
    }

    //2.Borrar la via 
    public static void borrarVia() {
        Via v = null;
        Scanner entrada = new Scanner(System.in);
        char siNo = 'N';
        int i;

        siNo = 'N';
        for (i = 0; i < array.length && siNo != 'A'; i++) {
            v = array[i];
            if (v.isOmplit()) {
                System.out.println(v);
                do {
                    System.out.println("\nVols borrar La Via (S/N) o Acabar la tasca (A)?:");
                    siNo = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);

                } while (siNo != 'S' && siNo != 'N' && siNo != 'A');
            }
            if (siNo == 'S') {
                break;
            }
        }

        if (siNo == 'S') {
            v.setOmplit(false);
            System.out.println("Via borrada  correctament.");

        } else {
            System.out.println("\nNo s'ha borrat cap VIA.");
        }
    }

    //3.Modificar la via 
    public static void modificarVia() {
        Scanner entrada = new Scanner(System.in);

        char siNo = 'N';
        int cont = 1, i;

        for (i = 0; i < array.length && siNo != 'A'; i++) {
            if (array[i].isOmplit()) {
                System.out.format("\nVIA %d:\n", cont++);
                System.out.println(array[i].toString());
                do {
                    System.out.println("\nVols modificar la Via (S/N) o (A)?:");
                    siNo = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);

                } while (siNo != 'S' && siNo != 'N' && siNo != 'A');
            }
            if (siNo == 'S') {
                break;
            }
        }

        if (siNo == 'S') {

            System.out.println("\nNom: " + array[i].getNomvia());
            do {
                System.out.println("\nVols modificar el nom de la via?(S/N):");
                siNo = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (siNo != 'S' && siNo != 'N');
            if (siNo == 'S') {
                System.out.print("Nou nomVia: ");
                array[i].setNomvia(entrada.skip("[\r\n]*").nextLine());
            }

            System.out.println("\nNom: " + array[i].getProvincia());
            do {
                System.out.println("\nVols modificar el nom de la Provincia?(S/N):");
                siNo = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (siNo != 'S' && siNo != 'N');
            if (siNo == 'S') {
                System.out.print("Nou nomProvinciaA: ");
                array[i].setProvincia(entrada.skip("[\r\n]*").nextLine());
            }

            System.out.println("\nNom: " + array[i].getLocalitat());
            do {
                System.out.println("\nVols modificar el nom de la localitat?(S/N):");
                siNo = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (siNo != 'S' && siNo != 'N');
            if (siNo == 'S') {
                System.out.print("Nou nomProvinciaA: ");
                array[i].setLocalitat(entrada.skip("[\r\n]*").nextLine());
            }

            System.out.println("\nNom: " + array[i].getRegio());
            do {
                System.out.println("\nVols modificar el nom de la Regio?(S/N):");
                siNo = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (siNo != 'S' && siNo != 'N');
            if (siNo == 'S') {
                System.out.print("Nou nom la Regio: ");
                array[i].setRegio(entrada.skip("[\r\n]*").nextLine());
            }

            System.out.println("\nDesnivel: " + array[i].getDesnivel());
            do {
                System.out.println("\nVols modificar el Disnivel  ?(S/N):");
                siNo = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (siNo != 'S' && siNo != 'N');
            if (siNo == 'S') {
                System.out.print("Posa la nou Desnivel: ");
                array[i].setDesnivel(entrada.skip("[\r\n]*").nextInt());
            }

            if (array[i].isDificultat()) {
                System.out.println("\nÉs Dificil ");
            } else {
                System.out.println("\nNo es dificil");
            }
            do {
                System.out.println("\nVols modificar la dificulat ?(S/N):");
                siNo = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (siNo != 'S' && siNo != 'N');
            if (siNo == 'S') {
                char esDificultat;
                do {
                    System.out.println("És Dificil ?(S/D¡N):");
                    esDificultat = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esDificultat != 'S' && esDificultat != 'N');
                array[i].setDificultat(esDificultat == 'S');
                System.out.print("Nova dificultat : ");
                if (array[i].isDificultat()) {
                    System.out.println("S");
                } else {
                    System.out.println("N");
                }
            }

            if (array[i].isMaterial()) {
                System.out.println("\nEs necesari Material ");
            } else {
                System.out.println("\nNo es necesari Material");
            }
            do {
                System.out.println("\nVols modificar la dificulat ?(S/N):");
                siNo = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
            } while (siNo != 'S' && siNo != 'N');
            if (siNo == 'S') {
                char esMaterial;
                do {
                    System.out.println("És Necessari Material ?(S/N):");
                    esMaterial = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                } while (esMaterial != 'S' && esMaterial != 'N');
                array[i].setMaterial(esMaterial == 'S');
                System.out.print("Nou modificacio de material : ");
                if (array[i].isDificultat()) {
                    System.out.println("S");
                } else {
                    System.out.println("N");
                }
            }

            System.out.println("Via modificat correctament.");

        } else {
            System.out.println("\nNo Hi ha cap Via  per modificar, o no n'has triat cap per modificar.");
        }
    }

    //4.Llistar les via
    public static void llistarVia() {

        Scanner entrada = new Scanner(System.in);

        Via v = null;
        char siNo = 'S';
        int i;

        boolean alguna = false;
        siNo = 'S';
        for (i = 0; i < array.length; i++) {
            v = array[i];
            if (v.isOmplit()) {
                alguna = true;
                System.out.println(v);
                do {
                    System.out.println("\nVols veure mes Vies (S/N)?:");
                    siNo = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);

                } while (siNo != 'S' && siNo != 'N');
            }
            if (siNo == 'N') {
                break;
            }
        }
        if (!alguna) {
            System.out.println("\nNo hi ha Vies  per mostrar  si vols, primer  introduir alguna !!.");
        }
    }

    public static void recuperarVia() {
        Scanner entrada = new Scanner(System.in);
        Via v = null;
        char siNo = 'N';
        int cont = 0, i;

        for (i = 0; i < array.length && siNo != 'A'; i++) {
            v = array[i];
            if (!v.isOmplit()) {
                System.out.println(v);
                do {
                    System.out.println("\nVols recuperar la Via (S/N) o Acabar la cerca  (A)?:");
                    siNo = entrada.skip("[\r\n]*").nextLine().toUpperCase().charAt(0); 
                } while (siNo != 'S' && siNo != 'N' && siNo != 'A');
            }
            if (siNo == 'S') {
                break;
            }
        }

        if (siNo == 'S') {
            v.setOmplit(true);
            System.out.println("Via  recuperat correctament.");

        } else {
            System.out.println("\nNo s'ha recuperat cap Via :/.");
        }

    }
}
