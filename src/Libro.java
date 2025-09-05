public class Libro {
    String autor;
    String titulo;
    int numPaginas;
    public Libro(){
        autor = "Albert Camus";
        titulo = "La peste";
        numPaginas = 345;
    }
    public Libro(String autor, String titulo, int numPaginas){
        this.autor = autor;
        this.titulo = titulo;
        this.numPaginas = numPaginas;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getNumPaginas() {
        return numPaginas;
    }
    //recuerda aclarar este punto en el video.
    public String toString() {
        return "Titulo: " + titulo + "\n" +
                "Numero de paginas: " + numPaginas + "\n" +
                "Autor:  " + autor;
    }

    public static void main(String[] args) {
        Libro libro = new Libro("Albert Camus", "La peste", 364);
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Numero de paginas: " + libro.getNumPaginas());
    }
}


