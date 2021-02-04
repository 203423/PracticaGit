package Corte1;

public class Refrescos {
    //atributos
    private String presentacion;
    private double precio;
    private double descuento;
    private int cantidad;
    private double total;
    private int productoExtra;
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }
    public String getPresentacion() {
        return presentacion;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    public double getDescuento() {
        return descuento;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double getTotal() {
        return total;
    }
    public void setProductoExtra(int productoExtra) {
        this.productoExtra = productoExtra;
    }
    public int getProductoExtra() {
        return productoExtra;
    }
}
