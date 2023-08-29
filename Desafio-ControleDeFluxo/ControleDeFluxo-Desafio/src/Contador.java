import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        System.out.println("Por favor digite dois números: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try{
            contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo valor deve ser maior do que o primeiro");
        }

    }
        static void contar( int num1, int num2) throws ParametrosInvalidosException {

            if (num1 < num2) {
                for (int i = num1; i < num2; i++) {
                    System.out.println("Imprimindo número: " + i);
                }
            }

        }
}
