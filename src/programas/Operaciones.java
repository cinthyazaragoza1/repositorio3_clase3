
package programas;
import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args){
        double n1,n2,suma,prom;
        Scanner lectura=new Scanner(System.in);
        
        System.out.print("ingresar Numero 1:");
        n1=lectura.nextDouble();
        System.out.print("ingresar Numero 2:");
        n2=lectura.nextDouble();
        
        suma=n1+n2;
        prom=suma/2;
        
        System.out.print("La suma de los numeros es:"+suma);
        System.out.print("El promedio de los numeros es:"+prom);
        
        
    }
    
}
