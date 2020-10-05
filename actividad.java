import java.util.Scanner;
public class actividad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Scanner leer = new Scanner (System.in);
        int a=0, b=1, c, n;
        int limite;
        System.out.println("Ingresa una serie");
        n = teclado.nextInt();
        for (int i=0; i< n; i++)
        {
            System.out.println("Fibonacci:" + a);
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println("Ingresa un numero: ");
        limite=leer.nextInt();
        for (int i=0; i<limite;i++)
        {
            int contador=0;

            for (int j=1; j<=i; j++)
            {
                if (i%j==0)
                    contador++;
            }
            if(contador==2)
                System.out.println("Primos: "+i);
        }
    }
}
