
import java.util.Scanner;

/*
 * Escreva um programa que leia uma idade em anos e imprima
 * essa idade em dias.
 * 
 * Ex: 1 ano => 365 dias de idade.
 */

public class DiasDeIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int anoDeIdade = scanner.nextInt();
        int diasDeIdade = anoDeIdade * 365;
        System.out.printf("Você tem %d dias de idade!", diasDeIdade);
        
        scanner.close();
    }
}
