package Models;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Usuario implements Asesoria {
    //Declaracion de atributos
    protected String nombre;
    protected String apellido;
    protected Integer rut;

    protected String fechaNacimiento;

    Scanner in = new Scanner(System.in);

    //metodo contructor sin parametros
    public Usuario() {
    }

    public Usuario(String nombre, String apellido, Integer rut, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        do {
            System.out.println("Ingrese su nombre");
            nombre = in.nextLine();
        } while (nombre.length() < 5 || nombre.length() > 50 );
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        do {
            System.out.println("Ingrese su apellido");
            apellido = in.nextLine();
        } while (apellido.length() < 5 || apellido.length() > 50);

        this.apellido = apellido;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        do {
            System.out.println("Ingrese su rut sin puntos ni digito verificador");
            rut = in.nextInt();
        }while (rut > 99999999 && rut > 1000000);
        this.rut = rut;
        in.nextLine();
           }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        do {
            System.out.println("Ingrese su fecha de nacimiento en el siguiente formato DD/MM/AAAA");
            fechaNacimiento = in.nextLine();
        }while (fechaNacimiento.isEmpty());
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", rut='" + rut + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }

    //Creacion del metodo mostrarEdad()

    public String mostrarEdad() {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(this.fechaNacimiento, fmt);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, ahora);
        return "El usuario tiene " + periodo.getYears() + " años";
    }

    //implementacion del metodo analizarUsuario()
    @Override
    public void analizarUsuario() {
        System.out.println("nombre de usuario: " + nombre + " " + apellido);
        System.out.println("Rut: " + rut);
    }
}
