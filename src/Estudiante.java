public class Estudiante {
    String nombre;
    int edad;
    String curso;
    public Estudiante(){
        nombre = "Alejandro";
        edad = 19;
        curso = "Programacion orientada a objetos (POO)";
    }
    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public Estudiante(String nombre, int edad, String curso){
        this(nombre, edad);
         this.curso = curso;
    }


}
