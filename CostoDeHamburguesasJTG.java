import java.util.Scanner;
//algoritmo para saber costo de total de compras de hamburguesas
//creado por JHOBANY TICONA GONZALO 01/06/2020
public class CostoDeHamburguesasJTG {
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_PURPLE = "\u001B[35m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int FormaDePago, ProcesosSelectivos, n, TipoDeHamburguesa;
        double cargo, costo, pago;
        pago = 0;
        //Datos de entrada
        System.out.print("Ingrese el numero de hamburguesas: ");
        n = in.nextInt();
        in.nextLine();
        for (ProcesosSelectivos=1; ProcesosSelectivos<=n; ProcesosSelectivos++) {
            System.out.print("PROCESO " + ProcesosSelectivos);
            System.out.println("Seleccione el tipo de hamburguesa.");
            System.out.println("\t1.- S Sencilla");
            System.out.println("\t2.- D Doble");
            System.out.println("\t3.- T Triples");
            //procesos
            do {
                TipoDeHamburguesa = in.nextInt();
                in.nextLine();
                if (TipoDeHamburguesa<1||TipoDeHamburguesa>3)
                    System.out.print("Valor incorrecto. Ingrese nuevamente.: ");
            } while (TipoDeHamburguesa<1||TipoDeHamburguesa>3);
            costo=0;
            if(TipoDeHamburguesa==1)
                costo=20;
            if(TipoDeHamburguesa==2)
                costo=25;
            if(TipoDeHamburguesa==3)
                costo=28;
            System.out.println("Elija el tipo de pago.");
            System.out.println("\t1.- Efectivo");
            System.out.println("\t2.- Tarjeta");
            do {
                FormaDePago = in.nextInt();
                in.nextLine();
                if (FormaDePago<1||FormaDePago>2)
                    System.out.print("Valor incorrecto. Ingrese nuevamente.: ");
            } while (FormaDePago<1||FormaDePago>2);
            cargo=FormaDePago==1?0:costo*0.05;
            pago=pago+costo+cargo;
            //datos de slaida
            System.out.println("cargo por tipo de pago: " + cargo + "Dolares");
            System.out.println("costo original: " + costo + "Dolares");
        }
        System.out.println(ANSI_RED + "Total a pagar:" + pago + "Dolares" + ANSI_RESET);
    System.out.println(ANSI_PURPLE + "Gracias por su compra esperemos sea de su agrado" + ANSI_RESET);
    }

}