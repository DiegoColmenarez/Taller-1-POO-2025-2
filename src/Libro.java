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

}


