import java.util.Scanner;
import java.util.ArrayList;

public class comissoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Double> listaVendas = new ArrayList<Double>();
        int[] contadores = new int[9];
        double vendasBrutas;

        System.out.print("Insira as vendas brutas do vendedor (Digite um valor negativo para Encerrar): ");
        
        do {
            vendasBrutas = sc.nextDouble();
            if (vendasBrutas >= 0) {
                listaVendas.add(vendasBrutas);
                System.out.print("Insira o valor do próximo vendedor: ");
            }
        } while (vendasBrutas >= 0);

        for (double venda : listaVendas) {
            double salario = 200 + (venda * 0.09);
            int indice = (int) ((salario - 200) / 100);
            
            if (indice > 8) {
                indice = 8;
            }
            
            contadores[indice]++;
        }

        System.out.println("\nQuantidade de vendedores por intervalo de salário:");
        System.out.println("$200 - $299: " + contadores[0]);
        System.out.println("$300 - $399: " + contadores[1]);
        System.out.println("$400 - $499: " + contadores[2]);
        System.out.println("$500 - $599: " + contadores[3]);
        System.out.println("$600 - $699: " + contadores[4]);
        System.out.println("$700 - $799: " + contadores[5]);
        System.out.println("$800 - $899: " + contadores[6]);
        System.out.println("$900 - $999: " + contadores[7]);
        System.out.println("$1000 em diante: " + contadores[8]);

        System.out.println("\nFim do programa.");
        sc.close();
    }
}