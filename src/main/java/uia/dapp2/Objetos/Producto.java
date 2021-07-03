package uia.dapp2.Objetos;

import java.util.Objects;

public class Producto {
    private String nombreProducto;
    private String descripcion;
    private Integer cantidad;
    private Double precio;

    public Producto(String nombreProducto, String descripcion, Integer cantidad, Double precio) {
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\nProducto: " + nombreProducto + "\n" +
                "Descripción: " + descripcion + "\n" +
                "Cantidad: " + cantidad + "\n" +
                "Precio: $" + precio + "\n" ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(nombreProducto, producto.nombreProducto) &&
                Objects.equals(descripcion, producto.descripcion) &&
                Objects.equals(cantidad, producto.cantidad) &&
                Objects.equals(precio, producto.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreProducto, descripcion, cantidad, precio);
    }
}
