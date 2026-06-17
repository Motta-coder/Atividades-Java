import java.util.Scanner;

public class QuantosAlunosPassaram26 {
    public static void main(String[] args) {

        int nota, contador;
        contador=0;

        Scanner scan = new Scanner(System.in);

        for (int i=1; i <=10; i++){
            System.out.println("Me diga a nota do aluno " + i);
            nota = scan.nextInt();
            if (nota >= 6) {
                System.out.println(" Parabens você passou de ano");
                contador++;
            } else {
                System.out.println("eeh F++ DUM DUM");
            }
        }
        System.out.println(contador + " foi o número de alunos que passaram");

    }
}
