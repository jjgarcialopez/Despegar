package edu.unicomfacauca;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckFacade {

    private AvionAPI avionAPI = new AvionAPI("02/07/2018", "08/07/2018", "Popayan", "Bogotá");
   private AvionAPI avionAPI2;
    private HotelAPI hotelAPI;
    private ArrayList<AvionAPI> lstAviones;


  public CheckFacade() {

//      avionAPI2 = new AvionAPI("02/07/2018", "08/07/2018", "Lima", "Quito");
//        lstAviones.add(avionAPI);
//        lstAviones.add(avionAPI2);
      hotelAPI = new HotelAPI();

    }
    public void menu(int opcion){

        switch (opcion){
            case 1:
                avionAPI.buscar();
                break;
            case 2:
                hotelAPI.buscar();
                break;
            case 3:
                hotelAPI.reservar();
                break;
            default:
                System.out.println("la opción digitada no es válida, por favor intente nuevamente");
                break;

        }
    }

}