/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacificinstitute;

/**
 *
 * @author Valentina
 */
public class Alumno extends Persona{
    
    private int cursosCursados;   
    
    public Alumno(String nombre, int rut, String apellido, int cursos) {
        super(nombre, rut, apellido);
        this.cursosCursados = cursos;
    }
    
    public int getCursosCursados() {
        return cursosCursados;
    }

    public void setCursosCursados(int cursosCursados) {
        this.cursosCursados = cursosCursados;
    }
    @Override
    protected String mostrarDatos() {
       return "Nombre: "+getNombre()+"\n"+
                "Apellido: "+getApellido()+"\n"+
                "Rut: "+getRut()+"\n"+
                "Cursos cursados: "+getCursosCursados();
    }
}
