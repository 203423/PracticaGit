package Corte1;
import java.util.Scanner;
public class Ventas {
    static Scanner entrada = new Scanner(System.in);
    public static void solicitarPedido(Refrescos refresco1,Refrescos refresco2,Refrescos refresco3,Pagos pago1, Pagos pago2, Pagos pago3){
        boolean validador=true;
        pago1.setTipoPago("tarjeta");
        pago2.setTipoPago("efectivo");
        int preguntas,acumulador=0,cantidad,cantidadMax;
        //mostrar precios
        System.out.println("Precio de refrescos: \n235ml: $"+refresco1.getPrecio()+"\n500ml: $"+refresco2.getPrecio()+"\n600ml: $"+refresco3.getPrecio());
        // condicional verano
        System.out.println("Es verano por lo que hay descuento en los siguientes productos");
        refresco1.setDescuento(refresco1.getPrecio()*(0.85));
        refresco3.setDescuento(refresco3.getPrecio()*(0.85));
        System.out.println("Precio con descuento 235ml: $"+refresco1.getDescuento());
        System.out.println("Precio con descuento 600ml: $"+refresco3.getDescuento());
        //condición refrescos
        System.out.println("Cuantos refrescos va a comprar?(Maximo 5)");
        preguntas= entrada.nextInt();
        cantidadMax=preguntas;
        if (preguntas>5 || preguntas <1){
            System.out.println("Usted no puede pasar por caja rapida");
        }
        System.out.println("Cuantos refrescos de 235ml?");
        cantidad = entrada.nextInt();
        refresco1.setCantidad(cantidad);
        acumulador=acumulador+cantidad;
        if (cantidad>cantidadMax){
            acumulador=0;
            System.out.println("No es un numero valido");
            validador=false;
        }
        if (acumulador<cantidadMax && validador==true){
            System.out.println("Cuantos refrescos de 500ml?");
            cantidad=entrada.nextInt();
            refresco2.setCantidad(cantidad);
            acumulador=acumulador+cantidad;
            if(cantidad>5||acumulador>cantidadMax){
                System.out.println("No es un numero valido");
            }

        }
        if (acumulador<cantidadMax && validador==true){
            System.out.println("Cuantos refrescos de 600ml?");
            cantidad=entrada.nextInt();
            refresco3.setCantidad(cantidad);
            acumulador=acumulador+cantidad;
            if (cantidad>5||acumulador>5){
                System.out.println("No es un numero valido");
            }
        }
        if (validador==true) {
            Principal.menu(refresco1,refresco2,refresco3,pago1,pago2,pago3);
        }
    }
}