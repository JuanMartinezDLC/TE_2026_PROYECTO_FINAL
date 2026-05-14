package mx.proyecto.backend_api.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "alumnos")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String numeroCuenta;
    private String carrera;
    private String correo;
    private String telefono;
    private String estado; // activo, baja, concluido
    private Double totalHorasAcumuladas;

    // Relación N:1 con Programa (Los alumnos deben estar asociados a un programa específico)
    @ManyToOne
    @JoinColumn(name = "programa_id")
    private Programa programaAsignado;

    // --- GETTERS Y SETTERS ---

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidoPaterno() { return apellidoPaterno; }
    public void setApellidoPaterno(String apellidoPaterno) { this.apellidoPaterno = apellidoPaterno; }

    public String getApellidoMaterno() { return apellidoMaterno; }
    public void setApellidoMaterno(String apellidoMaterno) { this.apellidoMaterno = apellidoMaterno; }

    public String getNumeroCuenta() { return numeroCuenta; }
    public void setNumeroCuenta(String numeroCuenta) { this.numeroCuenta = numeroCuenta; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Double getTotalHorasAcumuladas() { return totalHorasAcumuladas; }
    public void setTotalHorasAcumuladas(Double totalHorasAcumuladas) { this.totalHorasAcumuladas = totalHorasAcumuladas; }

    public Programa getProgramaAsignado() { return programaAsignado; }
    public void setProgramaAsignado(Programa programaAsignado) { this.programaAsignado = programaAsignado; }
}