import java.util.Scanner;



public class questao2 {
    public static void main(String[] args) {
        Scanner  TCD = new Scanner (System.in);

    System.out.println ("//////Bem  vindo ao calculo do salario medio com base nos funcionarios//////");
    System.out.println ("///////////////////////////////////////////////////////////////////////////////");
    System.out.println ("Para iniciar vamos precisar de alguns dados: ");

    int s1,s2,s3,s4,s5,s6;
        {
            System.out.println("Digite o valor do salario com base no numero de funcionario");

            System.out.println("Digite o salario do funcionario 1: ");
            s1 = TCD.nextInt();

            System.out.println("Digite o salario do funcionario 2: ");
            s2 = TCD.nextInt();

            System.out.println("Digite o salario do funcionario 3: ");
            s3 = TCD.nextInt();

            System.out.println("Digite o salario do funcionario 4: ");
            s4 = TCD.nextInt();

            System.out.println("Digite o salario do funcionario 5: ");
            s5 = TCD.nextInt();

            System.out.println("Digite o salario do funcionario 6: ");
            s6 = TCD.nextInt();
        }



    double somaTotalDividida;
        {
            somaTotalDividida = (double) (s1 + s2 + s3 + s4 + s5 + s6) / 6;
            System.out.println("A media salarial entre esses 6 fucionarios foi de: R$" + somaTotalDividida);
        }



    }
}