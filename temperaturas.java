import java.util.Scanner;
import java.util.ArrayList;

public class temperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> listaTemperatura = new ArrayList<Double>();
        double media = 0, mediaAnual = 0;

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        for (int i = 0; i < 12;i++){
            System.out.println("Insira a média da temperatura do mês de "+meses[i]+": ");
            double temperaturas = sc.nextDouble();
            media += temperaturas;
            listaTemperatura.add(temperaturas);
        }
        mediaAnual = media / 12;
        
        System.out.println("Lista de temperaturas acima da média Anual: ");
        for (int i = 0; i < 12; i++){
            if(listaTemperatura.get(i)>mediaAnual){
            System.out.println((i+1)+" - "+meses[i]+": "+listaTemperatura.get(i));
            }
        }

        sc.close();
    }
}
