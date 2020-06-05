import java.util.Scanner;
//algoritmo para calcular contar numero de focos por respectivos colores 
//Creado por Jhobany Ticona Gonzalo
public class FocosJTG {
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_WHITE = "\u001B[37m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_CYAN = "\u001B[36m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int FocosBlancos, FocosRojos, FocosVerdes, Incremento,NumeroFocos , color;
        FocosVerdes = 0;
        FocosBlancos = 0;
        FocosRojos = 0;
        //DATOS DE ENTRADA
        System.out.print("INGRESE LA CANTIDAD DE FOCOS: ");
        NumeroFocos = in.nextInt();
        in.nextLine();
        for (Incremento=1; Incremento<=NumeroFocos; Incremento++) {
            System.out.print("PROCESO " + Incremento);
            System.out.println("Seleccione el color.");
            System.out.println(ANSI_GREEN + "\t1.- Verde" + ANSI_RESET);
            System.out.println(ANSI_WHITE + "\t2.- Blanco" + ANSI_RESET);
            System.out.println(ANSI_RED + "\t3.- Rojo" + ANSI_RESET);
            //PROCESOS
            do {
                color = in.nextInt();
                in.nextLine();
                if (color<1||color>3)
                    System.out.print("Valor incorrecto. Ingrese nuevamente : ");
            } while (color<1||color>3);
            if(color==1)
                FocosVerdes=FocosVerdes+1;
            if(color==2)
                FocosBlancos=FocosBlancos+1;
            if(color==3)
                FocosRojos=FocosRojos+1;
        }
        //DATOS DE SALIDA
        System.out.println(ANSI_GREEN + "Cantidad de focos verdes: " + FocosVerdes + ANSI_RESET);
        System.out.println(ANSI_WHITE + "Cantidad de focos blancos: " + FocosBlancos + ANSI_RESET);
        System.out.println(ANSI_RED + "Valor de focos rojos: " + FocosRojos + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "TOTAL FOCOS: " + NumeroFocos + ANSI_RESET);
    }

}