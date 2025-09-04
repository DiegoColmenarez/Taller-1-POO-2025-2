public class Libro {
    String autor;
    String titulo;
    String numPaginas;
    public Libro(){
        autor = "Albert Camus";
        titulo = "La peste";
        numPaginas = "364";
    }
    private Libro(String autor1, String obraTitulo, String numeroPaginas){
        autor = autor1;
        titulo = obraTitulo;
        numPaginas = numeroPaginas;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getNumPaginas() {
        return numPaginas;
    }
    public static void main(String[] args) {
        Libro obra = new Libro();
        System.out.println("Titulo: " + obra.titulo);
        System.out.println("Numero de paginas: " + obra.numPaginas);
        System.out.println("Autor: " + obra.autor);
        Libro obra2 = new Libro("Gabriel Garcia Marquez", "Cronicas de una muerte anunciada", "80");
        System.out.println("Titulo: " + obra2.getTitulo());
        System.out.println("Numero de paginas: " + obra2.getNumPaginas());
        System.out.println("Autor: " + obra2.getAutor());
    }
}


