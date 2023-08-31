import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            float raio;
            double pi = 3.14159;
            System.out.println("Informe o raio do cículo:");
            raio = sc.nextFloat();

            System.out.printf("O rário do círculo é: %.4f", pi*(Math.pow(raio, 2)));
        sc.close();
    }
}
