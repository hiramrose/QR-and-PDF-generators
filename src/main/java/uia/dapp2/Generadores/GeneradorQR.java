package uia.dapp2.Generadores;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class GeneradorQR {
    public static void main(String[] args) throws Exception {
        //Dirección URL a cifrar
        String url = "https://www.apple.com/mx/shop/buy-iphone/iphone-12";

        //Generando código QR en formato de tipo imagen
        ByteArrayOutputStream salida = QRCode.from(url).to(ImageType.PNG).stream();

        //Creando archivo en la ruta especificada
        File archivo = new File("C:\\Users\\Hiram Rosas\\Downloads\\codigoQR.png");
        FileOutputStream fSalida = new FileOutputStream(archivo);

        //Estableciendo la salida
        fSalida.write(salida.toByteArray());
        fSalida.flush();
        System.out.println("Se ha exportado el código QR de la cadena " + "["+url+"]");
    }
}
