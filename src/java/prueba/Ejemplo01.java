
package prueba;

import dao.MascotaDao;
import entidades.Mascota;

/**
 *
 * @author USUARIO
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MascotaDao mascotadao= new MascotaDao();
        Mascota mascota = new Mascota(1,"gtrhr", "fdfhf", "fdhhfh");
        mascotadao.guardarMascota(mascota);
    }
    
}
