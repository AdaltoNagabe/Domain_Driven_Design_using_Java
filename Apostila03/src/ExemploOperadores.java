public class ExemploOperadores {

    public static void main(String[] args) {

        int n = 100;

        //Operador incremento

        n++; //incrementa a variavel n em 1 unidade
        System.out.println(n);

        n--; //decrementa a variavel n em 1 unidade
        System.out.println(n);

        n = 100;
        //Somar 10 no n
        //n = n + 10;
        System.out.println(n);
        n += 10 ; //Faz o mesmo que n = n + 10;
        System.out.println(n);
        n -= 50; //60 decrementa 50
        System.out.println(n);
        n *= 3; //180 multiplica 3
        System.out.println(n);
        n /= 2; //90 divide 2
        System.out.println(n);
        n %= 7; //6 resto da divisao
        System.out.println(n);

    }

}
