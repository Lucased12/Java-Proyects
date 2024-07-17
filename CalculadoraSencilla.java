import java.util.Scanner;
public class CalculadoraSencilla {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Calculadora");
            System.out.println("Elija una operación:");
            System.out.println("1: Suma");
            System.out.println("2: Resta");
            System.out.println("3: Multiplicacion");
            System.out.println("4: Division");
            System.out.println("5: Salir");

            int opcion = scanner.nextInt();

            if (opcion == 5) {
                System.out.println("Saliendo de la aplicacion");
                break;
            }
            if (opcion < 1 || opcion > 5) {
                System.out.println("Opcion invalida. intentarlo otra vez.");
                continue;
            }

            System.out.print("Primer numero: ");
            double num1 = scanner.nextDouble();

            System.out.print("Segundo numero: ");
            double num2 = scanner.nextDouble();

            double resultado;


            switch (opcion) {
                case 1:
                    resultado = suma(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = resta(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = multiplicacion(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    try {
                        resultado = division(num1, num2);
                        System.out.println("Resultado: " + resultado);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
            }
            System.out.println();
        }

        scanner.close();
    }

    public static double suma(double a, double b) {
        return a + b;
    }
    public static double resta(double a, double b) {
        return a - b;
    }
    public static double multiplicacion(double a, double b) {
        return a * b;
    }
    public static double division(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No  se puede dividir por cero.");
        }
        return a / b;
    }
}

// En caso de olvidarme el como se usa el "scanner": https://www.w3schools.com/java/java_user_input.asp