package SistemadeProyectos;

import java.util.Scanner;



public class MenuProyecto {
	
	 public static void main(String[] args) {
		    boolean salir = false;
	        Scanner sn = new Scanner(System.in);
	        sn.useDelimiter("\n");
	        
	       
	        int opcion; 

	        Operacion operacion = new Operacion() ;
	        String nombre;
	        String horas;
	        String analista;

	        Proyectos c;
	        Scanner in = new Scanner(System.in);
	        do{
	        	System.out.println("  SISTEMA DE MANEJO DE PROYECTOS");
	        	System.out.println("    Seleccione la opcion deseada ");
	        	System.out.println("1. Ingresar Proyecto");
	            System.out.println("2. Listar los Proyectos");
	            System.out.println("3. Buscar Proyecto");
	            System.out.println("4. Existe Proyecto");
	            System.out.println("5. Eliminar Proyecto");
	            System.out.println("6. Salir");
		        switch(in.next()){
		            case "1":
		            	
		            	 System.out.println("Escriba el nombre del proyecto");
	                        nombre = sn.next();

	                        System.out.println("Escriba las horas del proyecto");
	                        horas = sn.next();
	                        
	                        System.out.println("Escriba el analista del proyecto");
	                        analista = sn.next();
	              
	                        c = new Proyectos(nombre,horas,analista);
	                        operacion.ingresarproyecto(c);
		         
		    
		        break;              
		            case "2":
		            	operacion.mostrarproyectos();
		         
		       break;
		               
		            case "3":
		            	System.out.println("Escribe un nombre");
                          nombre = sn.next();
                          operacion.buscarProyecto(nombre);
                          
		          
		               
		          case "4":
		        	  System.out.println("Escribe un nombre");
                      nombre = sn.next();

                      
                      c = new Proyectos(nombre,null, null);

                      if (operacion.existeproyecto(c)) {
                          System.out.println("Existe el proyecto");
                         
                      } else {
                          System.out.println("No existe proyecto");
                      }

                      break; 
		        	  
		        	  
		          case "5": 

		        	  System.out.println("Escribe un nombre");
                      nombre = sn.next();


                      
                      c = new Proyectos(nombre,null, null);

                           operacion.eliminarproyecto(c);

	                  break;
		        	  
		          case "6": 
                      salir = true;
                      break;
                  default:
                      System.out.println("Solo numeros entre 1 y 8");
              }

		        
		        
		        System.out.println("¿Si desesa salir del sistema digite Si ?");
		        if(in.next().equalsIgnoreCase("Si")) salir=true;
		        else salir=false;
		        
		    }while(!salir);

		   
		   }    
		 
}



