import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita ai: ");
        int idade = sc.nextInt();
        checarIdade(idade); 

        sc.close();
    }

    static void checarIdade(int idade){
    if (idade < 18){
        System.out.println("Acesso negado!");
    } else {
        System.out.println("Acesso permitido!");
    }
}
}

