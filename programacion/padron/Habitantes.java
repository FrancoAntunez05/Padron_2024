
/**
 * Write a description of class Habitante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Habitantes{
    public static void main(String[] args) {
        
        Habitante h = new Habitante();
        
        h.setNombre("Franco");
        h.setApellido1("Antunez");
        h.setApellido2("Castro");

        System.out.println("Nombre: " + h.getNombre());
        System.out.println("Primer Apellido: " + h.getApellido1());
        System.out.println("Segundo Apellido: " + h.getApellido2());
    }
}




