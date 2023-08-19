import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Informe o primeiro valor: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println("Informe o segundo valor: ");
        int b = sc.nextInt();

        System.out.printf("A soma entre %d e %d é "+ (a+b),a,b);
        sc.close();
    }
}
