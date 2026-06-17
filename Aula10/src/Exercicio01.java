import java.util.Scanner;


public class Exercicio01 {
    public static void main(String[] args){
        //Var
        Scanner read = new Scanner(System.in);
        String nome;

        System.out.println("Me diga seu nome criatura feita de carne");
        nome = read.next();

        System.out.println("Bom dia " + nome);

    }
}
