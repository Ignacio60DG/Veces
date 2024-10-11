import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca tu edad");
        int numero = sc.nextInt();
        while (numero < 18 || numero > 120) {
            System.out.println("Seguro?");
            numero = sc.nextInt();
        }
        System.out.println("Bienvenido!");
    }
}