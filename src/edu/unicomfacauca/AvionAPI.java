package edu.unicomfacauca;
//import javax.swing.*;
//import java.sql.ClientInfoStatus;
import java.util.Scanner;
public class AvionAPI implements Reservas {

    public AvionAPI(String s, String s1, String lima, String cancun) {
    }

    @Override
    public void reservar(){

        Scanner teclado = new Scanner(System.in);
        String nom = teclado.nextLine();
        System.out.println(nom);
    }

    @Override
    public void buscar() {

        buscarVuelos("02/07/2018", "08/07/2018", "Lima", "Cancun");
        buscarVuelos("02/07/2018", "08/07/2018", "Bogotá", "Quito");
        buscarVuelos("02/05/2021", "08/07/2021", "Piendamo", "Cali");
    }

   public void buscarVuelos(String fechaIda, String fechaVuelta, String origen, String destino) {
        System.out.println("==============================");
        System.out.println("Vuelos encontrados para " + destino + " desde " + origen);
       System.out.println("Fecha IDA: " + fechaIda + " Fecha Vuelta " + fechaVuelta);
        System.out.println("==============================");
   }

}