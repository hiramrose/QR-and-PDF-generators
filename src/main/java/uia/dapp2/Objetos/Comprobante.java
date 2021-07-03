package uia.dapp2.Objetos;

import java.util.Arrays;
import java.util.List;

public class Comprobante {
    private String nombreCliente;
    private List<Producto>[] producto;
    private Double total;

    public Comprobante(String nombreCliente, Double total, List<Producto>... producto) {
        this.nombreCliente = nombreCliente;
        this.producto = producto;
        this.total = total;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public List<Producto>[] getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto.toArray(new List[0]);
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombreCliente + "\n\n" +
                "Productos:\n" +
                Arrays.toString(producto).replace("[","").replace("]","").replace(",","") + "\n" +
                "Total: $" + total;
    }
}
