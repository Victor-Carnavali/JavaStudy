
package dateandresolutionsystem;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;

public class DateAndResolutionSystem {

    public static void main(String[] args) {
        
        Date relogio = new Date();
        
        // Toolkit, resolution of window
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    
        // Print resolution of window
        System.out.println("the resolution is: "+size.width+" "+size.height);
        
        // Date properties 
        System.out.println("A hora do sistema e");
        System.out.println(relogio.toString());
        
        // Language of system
        System.out.println(System.getProperty("user.language"));
        
    }
    
}
