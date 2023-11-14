import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner (System.in);

        System.out.println("insira um numero");
        int parametroUm = terminal.nextInt();

        System.out.println("insira o segundo numero");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm,parametroDois);

        }catch (ParametrosInvalidosException exception){
            System.out.println(" O segundo parametro deve ser maior que o primeiro");

        }



    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois < parametroUm)
            throw new ParametrosInvalidosException();
        else {

            int contagem = parametroDois - parametroUm;

            for (int i = 0; i <= contagem; i++) {
                System.out.println(parametroUm + i);
            }


        }
    }
}