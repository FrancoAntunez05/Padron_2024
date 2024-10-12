
/**
 * Write a description of class Comprobacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
    public class Comprobacion {
    
    public static void realizarComprobacion() {
        
        Habitante h= new Habitante();

        
        h.setNombre("Franco");
        h.setApellido1("Antunez");
        h.setApellido2("Castro");

        
        System.out.println(h.getNombre() + " " + 
                           h.getApellido1() + " " + 
                           h.getApellido2());
    }
}

