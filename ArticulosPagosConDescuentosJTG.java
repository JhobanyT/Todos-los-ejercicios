import java.util.Scanner;
//programa para calcular cualto es el descuento y cuanto se debe pagar
//creado por Jhobany Ticona Gonzalo 03/06/2020
public class ArticulosPagosConDescuentosJTG {
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
        int i, NumeroDeArticulos;
        double Costo, Descuento, PagoPorTodo, PrecioReal;
        String s;
        PagoPorTodo = 0;
        //datos de entrada
        System.out.print("CUANTOS ARTICULOS SON: ");
        NumeroDeArticulos = in.nextInt();
        in.nextLine();
        //proceso
        for (i=1; i<=NumeroDeArticulos; i++) {
            System.out.println(ANSI_GREEN + "PROCESO " + i + ANSI_RESET);
            System.out.print(ANSI_CYAN + "Cuanto es el precio real: " + ANSI_RESET);
            PrecioReal = in.nextDouble();
            in.nextLine();
            System.out.print("Que Articulo es: ");
            s = in.nextLine();
            Descuento=PrecioReal*0.1;
            if(PrecioReal>=200)
                Descuento=PrecioReal*0.15;
            if(PrecioReal>100&&PrecioReal<200)
                Descuento=PrecioReal*0.12;
            Costo=PrecioReal-Descuento;
            PagoPorTodo=PagoPorTodo+Costo;
            //datos de salida
            System.out.println(ANSI_YELLOW + "El costo Final es: " + ANSI_BLACK_BACKGROUND + Costo + ANSI_RESET);
            System.out.println(ANSI_RED + "El descuento que se le realizo es: " + ANSI_BLACK_BACKGROUND + Descuento + ANSI_RESET);
        }
        System.out.println(ANSI_RED_BACKGROUND + "Total a Pagar por los articulos es: " + ANSI_RESET + ANSI_WHITE_BACKGROUND + ANSI_BLACK + PagoPorTodo + ANSI_RESET + ANSI_RED_BACKGROUND + "Dolares" + ANSI_RESET);
    }

}