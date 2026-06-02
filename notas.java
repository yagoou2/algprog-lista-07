import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        double soma = 0;

        System.out.println("Digite as notas (informe -1 para encerrar):");

        while (true) {
            double nota = scanner.nextDouble();
            if (nota == -1) {
                break; 
            }
            notas.add(nota);
            soma += nota; 
        }

        int totalLidos = notas.size();
        System.out.println("\n--- Resultados da Análise ---");

        System.out.println("Quantidade de valores lidos: " + totalLidos);

        if (totalLidos > 0) {
            
            System.out.print("Valores informados: ");
            for (double nota : notas) {
                System.out.print(nota + " ");
            }
            System.out.println(); 

            System.out.println("\nValores na ordem inversa:");
            for (int i = totalLidos - 1; i >= 0; i--) {
                System.out.println(notas.get(i));
            }

            System.out.println("\nSoma dos valores: " + soma);

            double media = soma / totalLidos;
            System.out.printf("Média das notas: %.2f\n", media);

            int acimaDaMedia = 0;
            int abaixoDeSete = 0;

            for (double nota : notas) {
                if (nota > media) {
                    acimaDaMedia++;
                }
                if (nota < 7.0) {
                    abaixoDeSete++;
                }
            }

            System.out.println("Quantidade de notas acima da média: " + acimaDaMedia);
            System.out.println("Quantidade de notas abaixo de sete: " + abaixoDeSete);
            
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }

        // 8. Mensagem de encerramento
        System.out.println("\nSistema de processamento finalizado. Até logo!");
        
        scanner.close();
    }
}