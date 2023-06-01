/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Medac
 */
public class Usuario {
    private String Nombre;
    private int Puntuación;

    public Usuario(String Usuario, int Respuesta) {
        this.Nombre = Usuario;
        this.Puntuación = Respuesta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPuntuación() {
        return Puntuación;
    }

    public void setPuntuación(int Puntuación) {
        this.Puntuación = Puntuación;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Nombre=" + Nombre + ", Puntuacion=" + Puntuación + '}';
    }

    
    
    
    
}
