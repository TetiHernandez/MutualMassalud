
package massalud.modelo;

public class Especialidad {
    private int idEspecialidad = -1;
    private String especialidad;

    public Especialidad() {
    }

    public Especialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return idEspecialidad + " - " + especialidad; 
    }

    
    // Getters y setters    
    
    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
