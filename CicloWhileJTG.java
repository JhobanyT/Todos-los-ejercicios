import java.util.Scanner;
//ciclo repirte de ejercicio 4.1
//creado por Jhobany Ticona Gonzalo 03/06/2020
class CicloWhileJTG {
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_PURPLE = "\u001B[35m";
//procesos
public static void main(String[] args){
   int I=1;
   double SalarioInicial, SalarioRecibido;
   while (I<7){
   System.out.println(ANSI_GREEN + "año numero" + I + ANSI_RESET);
   SalarioInicial=1500;
   SalarioRecibido=SalarioInicial*Math.pow(1.1,I);
   I++;
   //datos de salida
   System.out.println("Salario inicial: " + SalarioInicial);
            System.out.println(ANSI_CYAN + "El salario recibido durante este año es: " + SalarioRecibido + ANSI_RESET);

   }
            System.out.println(ANSI_RED + "Espero le haya servido de mucha ayuda GRACIAS" + ANSI_RESET);
 }
}