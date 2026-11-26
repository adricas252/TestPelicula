public class TestPelicula {
    public static void main (String[] args) {

        Pelicula pelicula = new Pelicula("Origen", "Christopher Nolan", 148);

        System.out.println("Datos de la pelicula: ");
        pelicula.mostrarInformacion();

        //Modificar atributos
        pelicula.setTitulo("Interestellar");
        pelicula.setDirector("Christopher Nolan");
        try {
            pelicula.setDuracionMinutos(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(pelicula);

        //System.out.println(pelicula.titulo);

        System.out.println("Titulo: " + pelicula.getTitulo());
        System.out.println("Pelicula: " + pelicula.getDirector());
        System.out.println("Duracion: " + pelicula.getDuracionMinutos());
    }
}

