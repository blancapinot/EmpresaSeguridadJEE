package Models;
public class Administrativo extends Usuario {
    //Declaracion de atributos
    private String area ;
    private String experienciaPrevia;

    //metodo contructor sin parametros
    public Administrativo() {
    }
    //metodo contructor con parametros

    public Administrativo(String nombre, String apellido, Integer rut, String fechaNacimiento, String area, String experienciaPrevia) {
        super(nombre, apellido, rut, fechaNacimiento);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }
    //generacion de metodo setter and getter
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        do {
            System.out.println("Indique su Area");
            area = in.nextLine();
        }while (area.length() < 5 || area.length() > 20);
        this.area = area;
    }
    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }
    public void setExperienciaPrevia(String experienciaPrevia) {
        do {
            System.out.println("Indique su experiencia previa");
            experienciaPrevia = in.nextLine();
            this.experienciaPrevia = experienciaPrevia;
        }while (experienciaPrevia.length() >100);
    }
    @Override
    public String toString() {
        return super.toString()+
                "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                "} ";
    }
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Area: " + area);
        System.out.println("Experiencia previa: " + experienciaPrevia);
    }
}
