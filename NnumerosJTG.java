import java.util.Scanner;
//ALGORITMO PARA SABER CUANTOS SON 0 Y MAYORES Y MENORES QUE 0
//CREADO POR JHOBANY TICONA GONZALO 01/06/2020
public class NnumerosJTG {
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_CYAN = "\u001B[36m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int CantidadesCero, incremento, MayoresACero, MenoresACero, N;
        double cantidad;
        CantidadesCero = 0;
        MenoresACero = 0;
        MayoresACero = 0;
        //datos de entrada
        System.out.print(ANSI_BLUE + "Ingrese la Cantidad de numeros a introducir: " + ANSI_RESET);
        N = in.nextInt();
        in.nextLine();
        //procesos
        for (incremento=1; incremento<=N; incremento++) {
            System.out.print(ANSI_CYAN + "PROCESO " + incremento + ANSI_RESET);
            System.out.print(ANSI_GREEN + "Introduzca el numero: " + ANSI_RESET);
            cantidad = in.nextDouble();
            in.nextLine();
            if(cantidad==0)
                CantidadesCero=CantidadesCero+1;
            if(cantidad<0)
                MenoresACero=MenoresACero+1;
            if(cantidad>0)
                MayoresACero=MayoresACero+1;
        }
        //datos de salida
        System.out.println(ANSI_YELLOW + "Total cantidades cero: " + CantidadesCero + ANSI_RESET);
        System.out.println(ANSI_RED + "Total menores a cero: " + MenoresACero + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Total de mayores a cero: " + MayoresACero + ANSI_RESET);
    }
}