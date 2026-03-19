public class ExemploCarro {

    public static void main(String[] args) {
        //Criar um objeto do tipo Carro
        Carro gol = new Carro();

        //Colocar valores nos atributos o objeto
        gol.cor = "Prata";
        gol.velocidadeMaxima = 190;
        gol.ano = 2010;
        gol.automatico = false; //true (verdadeiro), false (falso)
        gol.peso = 600;
        gol.modelo = "Gol Special Bola";
        gol.altura = 1.5f; //f no final para definir que o valor e float

        //Exibir os valores dos atributos do objeto

        System.out.println("Modelo: " + gol.modelo); //sout
        System.out.println("Ano " + gol.ano);
        System.out.println("Cor: " + gol.cor);
        System.out.println("Velocidade Maxima: " + gol.velocidadeMaxima);
        System.out.println("Automatico " + gol.automatico);
        System.out.println("Peso: " + gol.peso);
        System.out.println("Altura: " + gol.altura);

        System.out.println("----------------------------");
        //Criar um novo objeto do tipo carro
        Carro chevett = new Carro();


        //Colocar valores para 2 atributos e exibir esses valores
        chevett.modelo = "TS";
        chevett.ano = 1980;


    }

}

