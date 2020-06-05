import java.util.Scanner;

public class AhorroAnualJTG {
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_CYAN = "\u001B[36m";
 public static final String ANSI_PURPLE = "\u001B[35m";
    public static void main(String[] args) {
        int Incremento;
        double AhorroAnual, AhorroDiario;
        AhorroAnual = 0;
        for (Incremento=1; Incremento<=365; Incremento++){
            System.out.print(ANSI_YELLOW + "DIA " + Incremento + ANSI_RESET);
            AhorroAnual=AhorroAnual+0.01*Math.pow(3,Incremento);
            AhorroDiario=AhorroAnual;
            System.out.println(ANSI_RED + "El Ahorro hasta el momento Es: " + ANSI_RESET + ANSI_PURPLE + AhorroDiario + ANSI_RESET + ANSI_GREEN + "Pesos" + ANSI_RESET);
            System.out.println();
        }
        System.out.println(ANSI_CYAN + "El Ahorro total durante el año completo Es: " + ANSI_RESET + ANSI_PURPLE + AhorroAnual + ANSI_RESET + ANSI_GREEN + "Pesos" + ANSI_RESET);
    }

}