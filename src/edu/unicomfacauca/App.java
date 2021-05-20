package edu.unicomfacauca;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        CheckFacade cliente1 = new CheckFacade();
        int opcion=0;
        do {
            System.out.println("\n");
            System.out.println("**Menú de Busquedas**\n Seleccione:\n1 Para buscar nuevos vuelos \n2 Para buscar  hoteles disponibles  \n3 reservar Hotel ");
            Scanner opc = new Scanner(System.in);
            opcion = opc.nextInt();
            cliente1.menu(opcion);
        }while (opcion <4 || opcion>0);
    }

}