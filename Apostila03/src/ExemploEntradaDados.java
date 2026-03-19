import java.util.Scanner;

public class ExemploEntradaDados {

    //Criar um programa para ler e calcular a media da FIAP
    public static void main(String[] args) {
        //criar o objeto para ler o teclado
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota da CP1: ");
        double cp1 = leitor.nextDouble(); //para ler um double vindo do usuario

        System.out.println("Digite a nota da CP2: ");
        double cp2 = leitor.nextDouble();

        System.out.println("Digite a nota da CP3: ");
        double cp3 = leitor.nextDouble();

        double mediacp = (cp1 + cp2 + cp3) / 3;

        System.out.println("Digite a nota da GS: ");
        double gs = leitor.nextDouble();

        System.out.println("Digite a nota da Challenge1: ");
        double challenge1 = leitor.nextDouble();

        System.out.println("Digite a nota da Challenge2: ");
        double challenge2 = leitor.nextDouble();

        double mediachallenge = (challenge1 + challenge2) / 2;

        System.out.println("A MÉDIA DOS CHECK POINTS É: " + mediacp);
        System.out.println("A NOTA DA GLOBAL SOLUTION É: " + gs);
        System.out.println("A NOTA DO CHALLENGE É: " + mediachallenge);

        double mediasemestre = ((mediacp * 0.2) + (gs * 0.6) + (mediachallenge * 0.2));

        System.out.println("SUA MEDIA FINAL É: " + mediasemestre);
    }

}
