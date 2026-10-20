Este programa está diseñado para modelar y gestionar el ciclo de vida y el estado de desarrollo de un **proyecto de software** utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

* **Define la clase `ProyectoSoftware`:** Modela un proyecto tecnológico conteniendo sus atributos principales: el nombre del proyecto (`nombreProyecto`), la empresa cliente (`clienteEmpresa`) y la fase actual del desarrollo representada mediante un valor numérico (`faseActual`, donde 1=Análisis, 2=Desarrollo y 3=Despliegue).
* **Incorpora el constructor:** Permite inicializar los datos básicos del proyecto fijando obligatoriamente la `faseActual` en el valor inicial de `1` (Análisis) al momento de instanciar el objeto.
* **Controla el ciclo de vida (`avanzarFase` y `obtenerEstado`):** Implementa un método que incrementa progresivamente la fase de desarrollo en 1 (estableciendo un tope máximo de 3) y un método de consulta que traduce y devuelve el nombre en formato de texto correspondiente a la fase actual.
* **Ejecuta la prueba (`main`):** Instancia un objeto de tipo `ProyectoSoftware`, simula el avance completo a través de las distintas etapas del ciclo de vida e imprime la transición de las fases paso a paso por consola.
