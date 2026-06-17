import java.util.Scanner;

public class ContadorDeNotasAltas21 {
    public static void main(String[] args) {

        int numero, contador;

        Scanner scan = new Scanner(System.in);

        contador=0;

        for (int i=0; i <=5; i++){
            System.out.println("Me diga a nota do seu aluno");
            numero = scan.nextInt();
            if (numero >= 8){
                contador++;
            }
        }
        System.out.println(contador + " Alunos tiraram a nota igual ou acima de 8");

    }
}
