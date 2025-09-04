public class Libro {
    String autor;
    String titulo;
    int numPaginas;
    public Libro(){
        autor = "Albert Camus";
        titulo = "La peste";
        numPaginas = 345;
    }
    public Libro(String autor1, String obraTitulo, int numeroPaginas){
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
    public int getNumPaginas() {
        return numPaginas;
    }

}


