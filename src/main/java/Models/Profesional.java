package Models;
public class Profesional extends Usuario{
    //Declaracion de atributos
    private String titulo;
    private String fechaIngreso;

    //metodo contructor sin parametros
    public Profesional (){}

    public Profesional(String nombre, String apellido, Integer rut, String fechaNacimiento, String titulo, String fechaIngreso) {
        super(nombre, apellido, rut, fechaNacimiento);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    //generacion de metodo setter and getter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        do {
            System.out.println("Ingrese su titulo");
            titulo = in.nextLine();
        }while (titulo.length() < 5 || titulo.length() > 50);
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        do {
            System.out.println("Ingrese fecha de ingreso");
            fechaIngreso = in.nextLine();
        }while (fechaIngreso.isEmpty() || fechaIngreso.isBlank());
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                "} ";
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Titulo: " + titulo + " Fecha ingreso: " + fechaIngreso);
    }
}
