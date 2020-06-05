import java.util.Scanner;

public class AhorrosEInteresJTG {
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_PURPLE = "\u001B[35m";
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
		double Años;
		double Acumulacion;
		double i;
		double Interes;
		double Mes;
		double x;
		System.out.println("Ingrese la cantidad de años que se desea ahorrar");
		Años = in.nextDouble();
     in.nextLine();
     Acumulacion=0;
		for (x=1;x<=Años;x++) {
      System.out.println(ANSI_CYAN + "Datos del año : " + ANSI_RESET + ANSI_PURPLE + x + ANSI_RESET);
			for (i=1;i<=12;i++) {
				System.out.println(ANSI_YELLOW + "En el mes : " + ANSI_RESET + ANSI_RED + i + ANSI_RESET + ANSI_YELLOW + " Cuanto deposito" + ANSI_RESET);
				Mes = in.nextDouble();
     in.nextLine();
				Acumulacion = Acumulacion + Mes;
				Interes = Mes*0.1;
				Acumulacion = Acumulacion + Interes;
			}
			System.out.println(ANSI_CYAN + "El ahorro para el año : " + ANSI_RESET + ANSI_GREEN + x + ANSI_RESET + ANSI_CYAN + " es de: "+ ANSI_RESET + ANSI_RED + Acumulacion + ANSI_RESET);
		}
	}


}