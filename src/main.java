import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            float raio;
            double pi = 3.14159;
            double area;
            raio = sc.nextFloat();

            System.out.println(pi*(Math.pow(raio, 2)));
        sc.close();
    }
}
