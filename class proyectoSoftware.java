class proyectoSoftware{
String nombreProyecto;
String clienteEmpresa;
int faseActual;

    
public proyectoSoftware(String nombrePoyecto, String clienteEmpresa){
this.nombreProyecto = nombrePoyecto;
this.clienteEmpresa = clienteEmpresa;
this.faseActual = 1;
}

void avanzarFase(){
if(this.faseActual < 3){
    this.faseActual ++;
}else{
    System.out.println("El proyecto se encunetra en la ultima fase de desarrollo (Despliegue)");
}
}

 String obtenerEstado() {
        switch (this.faseActual) {
            case 1:
                return "Análisis";
            case 2:
                return "Desarrollo";
            case 3:
                return "Despliegue";
            default:
                return "Fase desconocida";
        }
    }

public static void main(String[] args) {
    
proyectoSoftware proyecto = new proyectoSoftware("Sistema de Gestión", "TechCorp");

        System.out.println("Fase inicial: " + proyecto.obtenerEstado()); 

        proyecto.avanzarFase();
        System.out.println("Nueva fase: " + proyecto.obtenerEstado()); 

        proyecto.avanzarFase();
        System.out.println("Nueva fase: " + proyecto.obtenerEstado()); 
    
        proyecto.avanzarFase(); 
    }
}

