import java.util.Scanner;
//ALGORITMO PARA CALCULAR CANTIDAD DE VENTAS 
//CREADO POR Jhobany Ticona Gonzalo 05/06/2020
public class NVentasJTG {
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";
public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
  public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
  public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, CantidadDePrendas;
        double CantidadGlobal, CantidadDeVentasDe0Hasta10000, De0Hasta10000, CantidadDeVentasDe10000Hasta20000, De10000Hasta20000, Venta;

        CantidadDeVentasDe0Hasta10000 = 0;
        De0Hasta10000 = 0;
        CantidadGlobal = 0;
        De10000Hasta20000 = 0;
        CantidadDeVentasDe10000Hasta20000 = 0;
        //datos de entrada
        System.out.print("Ingrese la N cantidad de ventas: ");
        CantidadDePrendas = in.nextInt();
        in.nextLine();
        //procesos y datos de entradas
        for (i=1; i<=CantidadDePrendas; i++) {
            System.out.print(ANSI_BLUE + "Para el proceso : " + ANSI_RESET + ANSI_GREEN + i + ANSI_RESET);

            System.out.print(ANSI_BLUE + " Cuanto es el valor de la venta: " + ANSI_RESET);
            Venta = in.nextDouble();
            in.nextLine();

            if(Venta <= 10000)
            {
                De0Hasta10000 = De0Hasta10000 + 1;
                CantidadDeVentasDe0Hasta10000 = CantidadDeVentasDe0Hasta10000 + Venta;
            }
            else if(Venta > 10000 && Venta <= 20000)
            {
                De10000Hasta20000 = De10000Hasta20000 + 1;
                CantidadDeVentasDe10000Hasta20000 = CantidadDeVentasDe10000Hasta20000 + Venta;
            }
            if(Venta > 20000)
            {
            System.out.println(ANSI_CYAN +"la cantidad establecida no es menor o igual a 20000 pero se le sumara : " + ANSI_RESET);
            }
            CantidadGlobal = CantidadGlobal + Venta;
            System.out.println();
        }
        //Datos De Salida
        System.out.println("Cantidad de ventas del precio de 0 a 10000 Es : " + ANSI_CYAN + De0Hasta10000 + ANSI_RESET);

        System.out.println("Cantidad de ventas del precio de 10000 a 20000 Es : " + ANSI_CYAN + De10000Hasta20000 + ANSI_RESET);

        System.out.println("Cantidad ventas en dinero de 0 a 10000 Es : " + ANSI_YELLOW + CantidadDeVentasDe0Hasta10000 + ANSI_RESET);

        System.out.println("Cantidad ventas en dinero de 10000 a 20000 Es : " + ANSI_YELLOW + CantidadDeVentasDe10000Hasta20000 + ANSI_RESET);

        System.out.println(ANSI_RED + "Cantidad del monto global Es : " + CantidadGlobal + ANSI_RESET);
    }

}