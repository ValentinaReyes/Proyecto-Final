
package pacificinstitute;

/**
 *
 * @author Valentina
 */
public class Tutor extends Persona {

    private boolean certificated;

    public boolean isCertificated() {
        return certificated;
    }

    public void setCertificated(boolean certificated) {
        this.certificated = certificated;
    }
    
    public Tutor(String nombre, int rut, String apellido, boolean certificated) {
        super(nombre, rut, apellido);
        this.certificated = certificated;
    }

    
    
    @Override
    protected String mostrarDatos() {
        String certificado;
        if (isCertificated()==true) {
            certificado = "Si"; 
        }else {
            certificado ="No";
        }
        return "Nombre: "+getNombre()+"\n"+
                "Apellido: "+getApellido()+"\n"+
                "Rut: "+getRut()+"\n"+
                "Certificado? :"+certificado; 
    }
}
