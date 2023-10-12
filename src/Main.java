import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //Tipos e Atributos
        double n1, n2, resultado;
        char operacao;

        //Programa e Usuário
        System.out.println("Calculadora básica em Java!\n");

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextDouble();

        System.out.println("Digite uma operação (+, -, *, /): ");
        operacao = sc.next().charAt(0);

        System.out.println("Digite o segundo número: ");
        n2 = sc.nextDouble();

        switch(operacao){
            case '+':
            resultado = n1 + n2;
            System.out.println("Resultado: " + resultado);
            break;
            
            case '-':
            resultado = n1 - n2;
            System.out.println("Resultado: " + resultado);
            break;

            case '*':
            resultado = n1 * n2;
            System.out.println("Resultado: " + resultado);
            break;

            case '/':
            if(n2 != 0){
                resultado = n1 / n2;
                System.out.println("Resultado: " + resultado);
            }else{
                System.out.println("Impossível dividir por Zero!");
            }
            break;
            default:
                System.out.println("Error: Operação inválida!");
        }
        sc.close();
    }
}
