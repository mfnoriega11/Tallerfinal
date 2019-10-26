package SistemadeProyectos;

import java.io.Serializable;



public class Proyectos implements Serializable {
	
	 private static final long serialVersionUID = -1L;
	    
	    private String nombre;
	    private String horas;
	    private String analista;
	    
	    public Proyectos(String nombre, String horas,String analista) {
	        this.nombre=nombre;
	        this.horas=horas;
	        this.analista=analista;
	        
	       
	    }
	    
	    public Proyectos(String nombre, String analista) {
	      
	    	 this.nombre=nombre;
		     this.horas=analista;
		     this.analista=analista;
	    }

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getHoras() {
			return horas;
		}

		public void setHoras(String horas) {
			this.horas = horas;
		}

		public String getAnalista() {
			return analista;
		}

		public void setAnalista(String analista) {
			this.analista = analista;
		}
		public boolean equals(Object o){
	        if(o instanceof Proyectos){
	        	Proyectos c = (Proyectos)o;
	            return this.equals(c);
	        }else{
	            return false;
	        }
	    }
		
		public boolean equals(Proyectos c) {

	        if (this.nombre.trim().equalsIgnoreCase(c.getNombre().trim())) {
	            return true;
	        }

	        return false;
		
		
   }
		@Override
	    public String toString() {
	        return "nombre=" + nombre + ", horas=" + horas + ",analista="+analista;
		
    }
}


