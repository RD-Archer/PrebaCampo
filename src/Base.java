import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//Clase pelicula
class Pelicula extends CrearFunciones{
    private String titulo;
    private String genero;
    private int duracion;
    private String clasificacion;


    public Pelicula(String titulo,String genero,int duracion,String clasificacion){
        this.titulo=titulo;
        this.genero=genero;
        this.duracion=duracion;
        this.clasificacion=clasificacion;

    }

    public String getTitulo(){
        return titulo;
    }

    public String toString(){

        return "Pelicula: "+titulo+" | Genero: "+genero+" | Duracion:"+duracion+"|Clasicicacion:"+clasificacion;
    }
}

//Clase Usuario
class Usuario{
    private String nombre;
    private String correo;
    private List<String> boletosComprados;
    private List<String> peliculasRentadas;

    //constructor
    public Usuario(String nombre,String correo) {
        super();
        this.correo=correo;
        this.nombre=nombre;
        this.boletosComprados = new ArrayList<>();
        this.peliculasRentadas = new ArrayList<>();

    }
    public String getNombre() {
        return nombre;
    }
    public String getCorreo(){
        return correo;
    }
    //Compra

    public List<String> getBoletosComprados() {
        return boletosComprados;
    }

    public List<String> getPeliculasRentadas() {
        return peliculasRentadas;
    }

    public void compraBoletos(String funcion){
        if (funcion!=null&&!funcion.isEmpty()) {
            boletosComprados.add(funcion);
        }

    }
    public void rentaPeliculas(String Renta){
        if (Renta!=null&&!Renta.isEmpty()){
        peliculasRentadas.add(Renta);
        }
    }


    public String toString(){
        return "Nombre: " + nombre + " | Correo: " + correo +
                "\nBoletos comprados: " + boletosComprados +
                "\nPelículas rentadas: " + peliculasRentadas;
    }

}


