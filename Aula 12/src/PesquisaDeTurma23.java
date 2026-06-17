import java.util.Scanner;

public class PesquisaDeTurma23 {
    public static void main(String[] args) {

        int soma, idade;
        soma=0;

        Scanner scan = new Scanner(System.in);

        for (int i=1; i <=8; i++){
            System.out.println("Qual a idade do aluno " + i);
            idade = scan.nextInt();
            soma = soma+idade;
        }
        System.out.println("a média turma é de " + soma/8 + " Anos de idade");
    }
}
