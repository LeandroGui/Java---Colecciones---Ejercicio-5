/*
 * Se requiere un programa que lea y guarde países, y para evitar que se ingresen
 * repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
 * guardará el país en el conjunto y después se le preguntará al usuario si quiere
 * guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
 * guardados en el conjunto.
 * Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
 * recordar como se ordena un conjunto.
 * Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
 * Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
 * país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
 * en el conjunto se le informará al usuario.
 */
package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class Ej_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        HashSet<String> Pais = new HashSet();
        String verif;
        System.out.println("<<<<< CARGAR PAISES >>>>>");
        do {
            System.out.print("Pais: ");
            Pais.add(leer.next());
            System.out.println("¿Desea guardar otro Pais?(S/N)");
            verif = leer.next();
        }
        while (verif.equals("S"));
        
        System.out.println("\n<<<<< PAISES CARGADOS >>>>>");
        System.out.println(Pais);
        System.out.println("\n<<<<< PAISES ORDENADOS ALFABETICAMENTE >>>>>");
        ArrayList<String> Pais_Ordenar = new ArrayList(Pais);
        Collections.sort(Pais_Ordenar);
        System.out.println(Pais_Ordenar);
        
        System.out.println("\n<<<<< BORRAR PAISES >>>>>");
        String borrar = leer.next();
        
        Iterator<String> it = Pais.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(borrar)) {
                it.remove();
            }
        }
        if (Pais.contains(borrar)) {
            System.out.println("El Pais ingresado no se encuentra");
        }
        else {
            System.out.println("Pais Borrado");
        }
        System.out.println(Pais);
    }
    
}
