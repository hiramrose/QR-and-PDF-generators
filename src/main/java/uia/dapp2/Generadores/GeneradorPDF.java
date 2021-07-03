package uia.dapp2.Generadores;

import com.itextpdf.text.*;
import uia.dapp2.Objetos.Comprobante;
import uia.dapp2.Objetos.Producto;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneradorPDF {
    public static void main(String[] args) throws Exception {
        //Instancia de un nuevo documento
        Document documento = new Document();

        //Escritura para pdf
        PdfWriter.getInstance(documento,new FileOutputStream("C:\\Users\\Hiram Rosas\\Downloads/comprobante.pdf"));

        //Añadir imagen
        Image imagen = Image.getInstance("src/main/java/uia/dapp2/Imagenes/codigoQR.png");
        imagen.scaleToFit(100,100);
        imagen.setAlignment(Chunk.ALIGN_BOTTOM);

        //Creando un párrafo
        Paragraph parrafo = new Paragraph();
        parrafo.setAlignment(Paragraph.ALIGN_LEFT);
        parrafo.setFont(FontFactory.getFont("Tahoma",16,Font.BOLD,BaseColor.DARK_GRAY));
        parrafo.add("Su comprobante de compra.\n\n");

        //Creando pie de página
        Paragraph footer = new Paragraph();
        footer.setAlignment(Paragraph.ALIGN_CENTER);
        footer.add("\nNo se aceptan devoluciones.\nApple Inc.");

        //Abrir documento
        documento.open();

        //Añadiendo párrafo con imagen
        documento.add(imagen);
        documento.add(parrafo);

        //Creando algunos productos
        Producto producto = new Producto(
                "Iphone 12 mini",
                "Teléfono celular de alta gama",
                1,
                19999.00
                );
        Producto producto2 = new Producto(
                "Earphones",
                "Audífonos de alta fidelidad",
                2,
                999.00
        );

        //Creando mi lista de compras
        List<Producto> misCompras = new ArrayList<Producto>();
        misCompras.add(producto);
        misCompras.add(producto2);

        //Creando los datos del comprobante de compra
        Comprobante comprobanteEjemplo = new Comprobante(
                "Laura Echeverría",
                //Puede hacerse por medio de una función 
                producto.getPrecio() + producto2.getPrecio()*2,
                misCompras
        );
        System.out.println(comprobanteEjemplo.toString());
        //Añadiendo objeto con los datos del comprobante de compra
        documento.add(new Paragraph(comprobanteEjemplo.toString()));
        documento.add(footer);
        //Cerrando documento
        documento.close();
    }
}
