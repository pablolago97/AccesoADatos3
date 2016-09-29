
package copybytesimaxe;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author plago-bergonpazos
 */
public class Copybytesimaxe {


    public static void main(String[] args) throws IOException {
        
        File imagen = new File ("/home/local/DANIELCASTELAO/plago-bergonpazos/NetBeansProjects/copybytesimaxe/imagen.png");
        FileInputStream x = new FileInputStream(imagen);
        FileOutputStream y = new FileOutputStream("/home/local/DANIELCASTELAO/plago-bergonpazos/NetBeansProjects/copybytesimaxe/imagen2.png",true);
       
        /* int z;
        
        while((z=x.read())!=-1){
            y.write(z);
        }
        x.close();
        y.close();*/
        
        
        BufferedInputStream a = new BufferedInputStream(x);
        BufferedOutputStream b = new BufferedOutputStream(y);
        int z;
        
        while((z=x.read())!=-1){
            y.write(z);
        }
        x.close();
        y.close();
            
        
        
    }
    
}
