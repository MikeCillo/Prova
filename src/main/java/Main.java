import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il primo intero");
        int x = scan.nextInt();

        System.out.println("Inserisci il secondo intero");
        int y = scan.nextInt();

        Calcolatrice calcolatrice=new Calcolatrice(x,y);

        System.out.println("somma" + calcolatrice.somma(x,y));

        System.out.println("divisione" + calcolatrice.divisione(x,y));

        System.out.println("sottrazione" + calcolatrice.sottrazione(x,y));

        System.out.println("moltiplicazione" + calcolatrice.moltiplicazione(x,y));
    }
}