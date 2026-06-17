import java.util.Scanner;

 public class Exercicio04 {
    public static void main(String[] args){
    Scanner read = new Scanner(System.in);

    int n1;

    System.out.println("Me diga um número");
    n1 = read.nextInt();
    System.out.println("O dobro do seu número é " + n1*2 + " e o triplo do seu número é " + n1*3);
    }
}
