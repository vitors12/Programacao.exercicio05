import java.util.Scanner;

public class exercicio05 {
    public static void main (String [] args) {

        Scanner ler = new Scanner (System.in);
        System.out.print ("Iforme o valor em metros");
        float M = ler.nextFloat();   
        float Cm = M * 100;
        System.out.print("Valor em centimetros "+ Cm);
}
}
