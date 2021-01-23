
package Utilities;

public class CitasRepoMethods {
    
    public static boolean validarAnoBisiesto(String year){
        return Integer.parseInt(year)%4 == 0;
    }
    
}
