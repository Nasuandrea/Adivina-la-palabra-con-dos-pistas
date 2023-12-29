
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String palabra = "rojo";
        Scanner sc = new Scanner(System.in);
        System.out.println("Primera pista: es un color");
        System.out.println("Introduce la palabra que crees que es: ");
        String palabraIntroducida = sc.nextLine();
while (!palabraIntroducida.equalsIgnoreCase(palabra))
      {System.out.println("última pista es: el color de la sangre");
          System.out.println("Introduce la palabra que crees que es: ");
         palabraIntroducida = sc.nextLine();
      }
        System.out.println("Enhorabuena! acertaste! la palabra era " + palabra);
    }
}