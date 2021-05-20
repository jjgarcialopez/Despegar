package edu.unicomfacauca;
import java.util.Scanner;
public class HotelAPI implements Reservas {
    @Override
    public void reservar(){
        int precio;
        System.out.println("Hoteles encontrados\n");
        System.out.println("Marque 1 para : Hotel A\n habitación sencilla $100.000\n habitación doble $200.000\n");
        System.out.println("Marque 2 para : Hotel B\n habitación sencilla, incluye 1 desayuno $200.000\n habitación cama doble+ desayuno +bebida $300.000\n");
        System.out.println("Marque 3 para : Hotel C\n Suite $300.000\n habitación doble+buffet+bebidas barra libre x 1 día\n por el valor de  $400.000 Suite premium con bebidas ilimitadas + buffet+servicios de lavandería incluidos\n");
        System.out.println("¿En que hotel desea hacer su reserva?\n");
        Scanner opc = new Scanner(System.in);
        int opcion = opc.nextInt();
        switch (opcion){
            case 1:
                precio = pedirValor();
                if (precio>=100000 && precio<200000)
                {
                    System.out.println("Se reservó la habitación sencilla\n");
                }
                else if (precio>=200000){
                    System.out.println("Se reservó la habitación con cama doble.");
                    if (200000-precio>0){
                        System.out.println("sobra $"+(200000-precio));
                    }
                }
                else{
                    System.out.println("No se realizara reserva en este hotel.");
                }
                break;
            case 2:
                precio = pedirValor();
                if (precio==200000)
                {
                    System.out.println("Se reservó habitación sencilla, incluye 1 desayuno\n");
                }
                else if (precio==300000)
                {
                    System.out.println("habitación cama doble+ desayuno +bebida\n");
                }
                else{
                    System.out.println("No se realizara reserva en este hotel.");
                }
                break;
            case 3:
                precio = pedirValor();
                if (precio==300000)
                {
                    System.out.println("Se reservo 1 habitación doble + buffet+bebidas barra libre x 1 día \n");
                }
                if (precio==400000)
                {
                    System.out.println("***Felicidades**** se reservó 1 Suite premium con bebidas ilimitadas + buffet +  servicios de lavandería incluidos\n");
                }
                else{
                    System.out.println("No se realizó ninguna reserva.");
                }
                break;
            default:
                System.out.println("la opción digitada no es válida, por favor intente nuevamente");


        }
    }

    public int pedirValor(){
        System.out.println("¿Cuanto va a pagar?");
        Scanner val = new Scanner(System.in);
        int precio = val.nextInt();
        return precio;
    }
    @Override
    public void buscar() {
        buscarHoteles("02/07/2018", "08/07/2018","Hotel A","Hotel B","Hotel C");
    }
    public void buscarHoteles(String fechaEntrada, String fechaSalida, String nombre1, String nombre2, String nombre3) {
        System.out.println("==============================");
        System.out.println("Hoteles encontrados");

        System.out.println("Entrada: " + fechaEntrada + " Salida: " + fechaSalida);
        System.out.println(nombre1);
        System.out.println(nombre2);
        System.out.println(nombre3);
        System.out.println("==============================");
    }

}