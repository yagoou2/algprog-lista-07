import java.util.Scanner;
import java.util.ArrayList;

public class interrogatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaPerguntas = new ArrayList<String>();
        int nivelSuspeito = 0;
        

        listaPerguntas.add("Telefonou para a vítima? ");
        listaPerguntas.add("Esteve no local do crime? ");
        listaPerguntas.add("Mora perto da vítima? ");
        listaPerguntas.add("Devia para a vítima? ");
        listaPerguntas.add("Já trabalhou com a vítima? ");

        System.out.print("Sistema de interrogatório");
        for (int i = 0; i < listaPerguntas.size();i++){
            System.out.println(listaPerguntas.get(i));
            String resposta = sc.nextLine();
            if(resposta.equalsIgnoreCase("Sim")||resposta.equalsIgnoreCase("S")){
               nivelSuspeito++;
            }
        }


        if (nivelSuspeito>=5){
            System.out.println("Pessoa classificada como Assassino");
        } else if (nivelSuspeito >= 3){
            System.out.println("Pessoa classificada como Cumplice");
        } else if (nivelSuspeito >= 2){
            System.out.println("Pessoa classificada como Suspeito");
        } else {
            System.out.println("Pessoa classificada como Inocente");
        }

        sc.close();
    }
}
