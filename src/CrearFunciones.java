import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrearFunciones {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        //Asignacion de peliculas
        List<Pelicula> pelicula =new ArrayList<>();
        pelicula.add(new Pelicula("Los Vengadores", "Ciencia Ficción", 130, "PG-13"));
        pelicula.add(new Pelicula("Joker", "Misterio", 120, "R"));
        pelicula.add(new Pelicula("Project X", "Comedia", 115, "R"));
        pelicula.add(new Pelicula("Avatar", "Ciencia Ficción", 130, "PG-13"));
        pelicula.add(new Pelicula("Interstellar", "Ciencia Ficción", 169, "P"));
        pelicula.add(new Pelicula("El Señor de los Anillos", "Fantasía", 178, "PG-13"));

        //Asignacion de una funcion a las peliculas

        List<Funcion> funciones=new ArrayList<>();
        funciones.add(new Funcion(pelicula.get(0).getTitulo(), "08:30", "Sala 1", 50));
        funciones.add(new Funcion(pelicula.get(1).getTitulo(), "18:45", "Sala 2", 45));
        funciones.add(new Funcion(pelicula.get(2).getTitulo(), "20:00", "Sala 3", 60));
        funciones.add(new Funcion(pelicula.get(3).getTitulo(), "15:30", "Sala 4", 55));
        funciones.add(new Funcion(pelicula.get(4).getTitulo(), "17:00", "Sala 5", 40));
        funciones.add(new Funcion(pelicula.get(5).getTitulo(), "21:15", "Sala 6", 70));


        Usuario usuario1 = new Usuario("Rogelio", "rogeliodavid2006@gmail.com");


            System.out.println("Las peliculas con claseficacion: "+clasificacion+":");
        System.out.println("Ingrese la clasificación deseada (Ejemplo: PG, PG-13, R): ");
        String clasificacionBuscada = lectura.nextLine();

          for (Funcion funcion:funciones){
              System.out.println();
          }
          for


        }



    }


}
class clasificacion{

}
