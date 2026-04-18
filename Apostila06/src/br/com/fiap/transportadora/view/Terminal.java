package br.com.fiap.transportadora.view;
import br.com.fiap.transportadora.model.Produto;

public class Terminal {

    public static void main(String[] args) {
        Produto p = new Produto(1,"Ovo",true, 1.25,10); //Veio do contrutor criado na classe Produto

        //Vai substituir esse pedaco de codigo
        //p.setId(1);
        //p.setNome("Ovo");
        //p.setFragil(true);
        //p.setPeso(1.25);
        //p.setVolume(10);

        //O set sera interessante se quiser alterar o valor.

        Produto px = new Produto(2,"Celular",true,2,10);   //Usando o Construtor 1
        Produto py = new Produto(3,"Bebida",25.5);                      //Usando o Construtor 2

    }


}
