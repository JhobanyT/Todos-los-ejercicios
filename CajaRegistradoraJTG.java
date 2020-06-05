import java.util.Scanner;
//Algoritmo para calcular la cantidad total de una caja
//creado por Jhobany Ticona 05/06/2020
public class CajaRegistradoraJTG {
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
        double BilletesDe100, BilletesDe200, BilletesDe20, BilletesDe10, BilletesDe50, MonedasDe5Soles, MonedasDe20Centimos, MonedasDe10Centimos, MonedasDe50Centimos, total;
        int MonedasDe1Soles, MonedasDe2Soles ;
        //datos de entrada
        System.out.print(ANSI_CYAN + "Cuantos billetes de 200 Soles se encuentra: " + ANSI_RESET);
        BilletesDe200 = in.nextInt();
        in.nextLine();
        System.out.print("Cuantos billetes de 100 soles se encuentra : ");
        BilletesDe100 = in.nextInt();
        in.nextLine();
        System.out.print(ANSI_CYAN + "Cuantos billetes de 50 soles se encuentra : " + ANSI_RESET);
        BilletesDe50 = in.nextInt();
        in.nextLine();
        System.out.print("Cuantos billetes de 20 soles se encuentra : ");
        BilletesDe20 = in.nextInt();
        in.nextLine();
        System.out.print(ANSI_CYAN + "Cuantos billetes de 10 soles se encuentra : " + ANSI_RESET);
        BilletesDe10 = in.nextInt();
        in.nextLine();
        System.out.print("Cuantos monedas de 5 soles se encuentra : ");
        MonedasDe5Soles = in.nextInt();
        in.nextLine();
        System.out.print(ANSI_YELLOW + "Cuantos monedas de 2 soles se encuentra : " + ANSI_RESET);
        MonedasDe2Soles = in.nextInt();
        in.nextLine();
        System.out.print("Cuantos monedas de 1 soles se encuentra : ");
        MonedasDe1Soles = in.nextInt();
        in.nextLine();
        System.out.print(ANSI_YELLOW + "Cuantas monedas de 50 centimos se encuentra : " + ANSI_RESET);
        MonedasDe50Centimos = in.nextInt();
        in.nextLine();
        System.out.print("Cuantos monedas de 20 centimos se encuentra : ");
        MonedasDe20Centimos = in.nextInt();
        in.nextLine();
        System.out.print(ANSI_YELLOW + "Cuantos monedas de de 10 centimos se encuentra : " + ANSI_RESET);
        MonedasDe10Centimos = in.nextInt();
        in.nextLine();
        //proceso
        total=BilletesDe200*200+BilletesDe100*100+BilletesDe50*50+BilletesDe20*20+BilletesDe10*10+MonedasDe5Soles*5+MonedasDe2Soles*2+MonedasDe1Soles*1+MonedasDe50Centimos*0.5+MonedasDe20Centimos*0.2+MonedasDe10Centimos*0.1;
        //datos de salida
        System.out.println(ANSI_GREEN + "Valor de total de la contabilizacion: " + ANSI_RESET + ANSI_RED + total + " soles" + ANSI_RESET);
    }

}