package br.com.fiap.apostila07.view;

public class ExemploConversao2 {

    public static void main(String[] args) {
        int rm = 123;
        //short x = rm; //nao permite porque o short e menor que o int. Pode perder informacao na transferencia
        long y = rm;
        System.out.println(y);

        short x = (short) rm; //cast para forcar o int a ser um short
    }

}
