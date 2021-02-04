package Corte1;
import java.util.Scanner;


public class Principal {
    static Scanner entrada = new Scanner(System.in);
    static int preguntas, cantidad,acumulador,cantidadMax;
    static boolean validar=true;

    public static void main(String[] args) {
        Refrescos refresco1 = new Refrescos();
        Refrescos refresco2 = new Refrescos();
        Refrescos refresco3 = new Refrescos();
        Pagos pago1 = new Pagos();
        Pagos pago2 = new Pagos();
        Pagos pago3 = new Pagos();
        refresco1.setPrecio(8);
        refresco1.setDescuento(refresco1.getPrecio());
        refresco1.setPresentacion("235ml");
        refresco2.setPrecio(12);
        refresco2.setPresentacion("500ml");
        refresco3.setPrecio(13);
        refresco3.setDescuento(refresco1.getPrecio());
        refresco3.setPresentacion("500ml");
        System.out.println("Promocion: en la compra de 2 refrescos de 500ml llevese uno de 235ml gratis");
        Ventas.solicitarPedido(refresco1, refresco2, refresco3,pago1,pago2,pago3);
    }
    public static void menu(Refrescos refresco1, Refrescos refresco2, Refrescos refresco3, Pagos pago1, Pagos pago2,Pagos pago3){
        int opcion;
        System.out.println("Como va a pagar?\n1.Tarjeta\n2.Efectivo");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                Pagos.pagoTarjeta(refresco1, refresco2, refresco3, pago1, pago2,pago3);
                break;
        
            case 2:
                Pagos.pagoEfectivo(refresco1, refresco2, refresco3, pago1, pago2,pago3);
                break;
        }
    }
}
