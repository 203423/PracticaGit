package Corte1;

import java.util.Scanner;
public class Pagos {
    private String tipoPago;
    private long numeroTarjeta;
    private int nip;
    private double total;
    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
    public String getTipoPago() {
        return tipoPago;
    }
    public void setNumeroTarjeta(long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    public long getNumeroTarjeta() {
        return numeroTarjeta;
    }
    public void setNip(int nip) {
        this.nip = nip;
    }
    public int getNip() {
        return nip;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double getTotal() {
        return total;
    }
    static Scanner entrada = new Scanner(System.in);


    public static void pagoTarjeta(Refrescos refresco1, Refrescos refresco2, Refrescos refresco3, Pagos pago1, Pagos pago2, Pagos pago3){
        int i=0;
        refresco1.setProductoExtra(refresco2.getCantidad()/2);
        refresco1.setTotal(refresco1.getDescuento()*refresco1.getCantidad());
        refresco2.setTotal(refresco2.getPrecio()*refresco2.getCantidad());
        refresco3.setTotal(refresco3.getDescuento()*refresco3.getCantidad());
        refresco1.setCantidad(refresco1.getCantidad() + refresco2.getProductoExtra());
        pago3.setTotal(refresco1.getTotal()+refresco2.getTotal()+refresco3.getTotal());
        System.out.println("Felicidades, tiene 15% de descuento en las bebidas de 235ml y 600ml");
        if (refresco1.getProductoExtra()>1) {
            System.out.println("Felicidades, por comprar "+ refresco2.getCantidad()+" de 500ml, se lleva gratis "+refresco1.getProductoExtra()+" de 235ml");
        }
        System.out.println("Item: "+"\nRefresco de "+refresco1.getPresentacion()+"\t"+refresco1.getCantidad()+"\t$"+refresco1.getTotal());
        System.out.println("Refresco de "+refresco2.getPresentacion()+"\t"+refresco2.getCantidad()+"\t$"+refresco2.getTotal());
        System.out.println("Refresco de "+refresco3.getPresentacion()+"\t"+refresco3.getCantidad()+"\t$"+refresco3.getTotal());
        System.out.println("Total: $"+pago3.getTotal());
        System.out.println("¡Aviso! Si ingresa su numero de tarjeta o nip de forma incorrecta 2 veces, se cancelara la orden");
        while (i != 2) {
            System.out.println("Digite su numero de tarjeta");
            pago1.numeroTarjeta =entrada.nextLong();
            String tarjetaString = Long.toString(pago1.numeroTarjeta);
            if (tarjetaString.length()==16){
                System.out.println("Digite su nip");
                pago1.nip=entrada.nextInt();
                if (pago1.nip>=1000 && pago1.nip<=9999){
                    System.out.println("Pago exitoso");
                    i=2;
                }
                else{
                   System.out.println("nip invalido");
               }
            }
            else{
                System.out.println("Numero de tarjeta invalido");
            }
            i=i++;
        }
        

    }
    public static void pagoEfectivo(Refrescos refresco1, Refrescos refresco2, Refrescos refresco3, Pagos pago1, Pagos pago2,Pagos pago3){
        refresco1.setProductoExtra(refresco2.getCantidad()/2);
        refresco1.setTotal(refresco1.getDescuento()*refresco1.getCantidad());
        refresco2.setTotal(refresco2.getPrecio()*refresco2.getCantidad());
        refresco3.setTotal(refresco3.getDescuento()*refresco3.getCantidad());
        refresco1.setCantidad(refresco1.getCantidad() + refresco2.getProductoExtra());
        pago3.setTotal(refresco1.getTotal()+refresco2.getTotal()+refresco3.getTotal());
        System.out.println("Felicidades, tiene 15% de descuento en las bebidas de 235ml y 600ml");
        if (refresco1.getProductoExtra()>1) {
            System.out.println("Felicidades, por comprar "+ refresco2.getCantidad()+" de 500ml, se lleva gratis "+refresco1.getProductoExtra()+" de 235ml");
        }
        System.out.println("Item: "+"\nRefresco de "+refresco1.getPresentacion()+"\t"+refresco1.getCantidad()+"\t$"+refresco1.getTotal());
        System.out.println("Refresco de "+refresco2.getPresentacion()+"\t"+refresco2.getCantidad()+"\t$"+refresco2.getTotal());
        System.out.println("Refresco de "+refresco3.getPresentacion()+"\t"+refresco3.getCantidad()+"\t$"+refresco3.getTotal());
        System.out.println("Total: $"+pago3.getTotal());
    }
}
