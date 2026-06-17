import java.util.Scanner;

 public class Exercicio05 {
     public static void main(String[] args) {
         Scanner read = new Scanner(System.in);

         int idade;

         System.out.println("Me diga a sua idade criatura feita de carne");
         idade = read.nextInt();

         System.out.println("Você tem " + idade*12 + "meses de idade");
     }
}
