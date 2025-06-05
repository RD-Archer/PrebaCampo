public class Funcion {

     String pelicula;
    String Horario;
     String Salas;
     int Cupos;

//constructor
    public Funcion(String pelicula, String horario, String salas, int cupos){

        this.pelicula=pelicula;
        this.Horario=horario;
        this.Salas=salas;
        this.Cupos=cupos;

    }


    //mostrador
    public String getPelicula(){
        return "Funcion de "+pelicula;
    }
    public String getHorario(){
        return Horario;
    }
    public String getSalas(){
        return Salas;

    }
    public int getCupos(){
        return Cupos;
    }

    public String toString(){

        return "Función: " + pelicula + " | Horario: " + Horario + " | Sala: " + Salas + " | Cupos: " + Cupos;
    }
}
