import java.util.Scanner;



public class questao3 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

    double PI, R,R1,A ,Vo;
        {
            System.out.println ("Digite o valor de PI:");
            PI = sc.nextDouble();



            System.out.println ("Digite o valor do raio: ");
            R = sc.nextDouble();
            R1 = R * R;

            System.out.println ("Digite o valor da area: ");
            A = sc.nextDouble();



            Vo = PI * R1 * A;
        }
    System.out.println ("A area do seu cilindro foi de:" + Vo + "cm³");

    }

}
