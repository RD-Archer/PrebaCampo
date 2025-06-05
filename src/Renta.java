public class Renta {
        //argumentos
    private Usuario usuario;
    private Pelicula pelicula;
    private int diasRenta;
    private double costoPorDia;

    //constructor
    public Renta( Usuario usuario, Pelicula pelicula, int diasRenta, double costoPorDia){
        this.usuario=usuario;
        this.pelicula=pelicula;
        this.diasRenta=diasRenta;
        this.costoPorDia=costoPorDia;

    }

    //metodo renta costo
    public double calcularCostoTotal(){

        return diasRenta*costoPorDia;
    }

    public void Registro(){

        System.out.println("Renta registrada");
        System.out.println("Usuario: "+ usuario.getNombre());
        System.out.println("Pelicula: "+pelicula.getTitulo());
        System.out.println("Dia");

    }
    public String toString(){

        return "Renta -> Película: " + pelicula.getTitulo() +
                " | Días rentados: " + diasRenta +
                " | Costo por día: $" + costoPorDia +
                " | Costo total: $" + calcularCostoTotal();
    }

}
