import java.util.Scanner;

public class EdadPromedioJTG {
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_WHITE = "\u001B[37m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_CYAN = "\u001B[36m";
  public static void main (String[] args){
    int EdadDeAlumnos=0;
    int totalsalon;
    int totalescuela;
    int totalalumnos;
    Scanner sca = new Scanner (System.in);
    System.out.println(ANSI_GREEN + "Cantidad de salones: " + ANSI_RESET);
    int CantidadSalones = sca.nextInt();
    System.out.println(ANSI_GREEN + "Cantidad de alumnos de cada salon: " + ANSI_RESET);
    int CantidadAlumnosPorSalon = sca.nextInt();
    totalsalon=0;
    totalescuela=0;
    totalalumnos=0;
    for (int x=1; x<=CantidadSalones; x++){
            System.out.println(ANSI_CYAN + "El salon numero : " + ANSI_RESET + ANSI_GREEN + x + ANSI_RESET);
      for (int i=1; i<=CantidadAlumnosPorSalon; i++){
      System.out.println(ANSI_YELLOW + "Introduce la edad de la persona numero : " + i + "\n" + ANSI_RESET);
      EdadDeAlumnos = sca.nextInt();
      totalsalon = totalsalon + EdadDeAlumnos;
      totalescuela = totalescuela + EdadDeAlumnos;
      totalalumnos = CantidadAlumnosPorSalon*CantidadSalones;
      }
      int mediadelsalon = (int) (totalsalon/CantidadAlumnosPorSalon);
      System.out.println(ANSI_YELLOW + "La edad promedio del salon : " + x + " ES : " + ANSI_RED + mediadelsalon + ANSI_RESET + ANSI_RESET);
      totalsalon=0;
     
    }
    int mediadelaescuela = (int) (totalescuela/totalalumnos);
          System.out.println(ANSI_RED + "La edad promedio de toda la escuela es : " + mediadelaescuela + ANSI_RESET);
  }

}