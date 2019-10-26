package SistemadeProyectos;



import lista_dinamica.ListaDinamica;

public class Operacion {
	

    private ListaDinamica<Proyectos> Proyectos;
	
    

    public Operacion() {
    	 this.Proyectos = new ListaDinamica<>();
    }

    public void ingresarproyecto(Proyectos c) {

        
        if (!Proyectos.exists(c)) {
        	Proyectos.addLast(c);
            System.out.println("Se ingreso el proyecto");
        } else {
            System.out.println("El proyecto  con ese nombre ya existe");
        }

    }
    
    public boolean existeproyecto(Proyectos c) {

        return Proyectos.exists(c);

    }
    
    public void mostrarproyectos() {

        if (Proyectos.isEmpty()) {
            System.out.println("No hay Proyectos que mostrar");
        } else {
            
            System.out.println(Proyectos.toString());
        }

    }
    
    public void buscarProyecto(String nombre) {

    	Proyectos aux = new Proyectos (nombre, null, null);

        
        int posicion = Proyectos.indexOf(aux);

       
        if (posicion == -1) {
            System.out.println("No se ha encontrado el proyecto");
            
        } else {
            
            aux = Proyectos.get(posicion);
            System.out.println("las horas del proyecto son  " + aux.getHoras()); 
            System.out.println("El analista del proyecto es   " + aux.getAnalista());
        }

    }
    
    public void eliminarproyecto(Proyectos c) {

        
        int posicion = Proyectos.indexOf(c);

       
        if (posicion == -1) {
            System.out.println("No se ha eliminado el proyecto porque no existe");
        } else {
            
        	Proyectos.remove(posicion);
            System.out.println("Se ha eliminado el proyecto");
        }

    }

}
