/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
e imprima el número ingresado seguido de tantos asteriscos como indique 
su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package ejerciciosGuia;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println(" ingrese un numero");
        for (int i=0; i<4; i++){
            numero = leer.nextInt();
            switch (numero){
                case 1:
                System.out.println("1. *");
                break;
                case 2:
                System.out.println("2. **");
                 break;
                case 3:
                System.out.println("3. ***");
                 break;
                case 4:
                System.out.println("4. ****");
                 break;
                case 5:
                System.out.println("5. *****");
                 break;
                case 6:
                System.out.println("6. ******");
                 break;
                case 7:
                System.out.println("7. *******");
                 break;
                case 8:
                System.out.println("8. ********");
                 break;
                case 9:
                System.out.println("9. *********");
                 break;
                case 10:
                System.out.println("10. **********");
                 break;
                case 11:
                System.out.println("11. ***********");
                 break;
                case 12:
                System.out.println("12. ************");
                 break;
                case 13:
                System.out.println("13. *************");
                 break;
                case 14:
                System.out.println("14. **************");
                 break;
                case 15:
                System.out.println("15. ***************");
                 break;
                case 16:
                System.out.println("16. ****************");
                 break;
                case 17:
                System.out.println("17. *****************");
                 break;
                case 18:
                System.out.println("18. ******************");
                 break;
                case 19:
                System.out.println("19. *******************");
                 break;
                case 20:
                System.out.println("20. ********************");
                 break;
                default:
                    System.out.println("lo ingresado no corresponde");
                    
            }
        }
    }
    
}
