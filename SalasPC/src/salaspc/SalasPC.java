
package salaspc;

/**
 *
 * @author faem
 */
public class SalasPC {

    public static void main(String[] args) {
        Sala sala = new Sala(5);
        sala.incluirPC(0, new PC(20.3));
        sala.incluirPC(2, new PC(21.4));
        sala.incluirPC(4, new PC(30.5));
        sala.encenderMenorConsumo();
        sala.encenderMenorConsumo();  
        System.out.println(sala.Encendidas());
    }
    
}
