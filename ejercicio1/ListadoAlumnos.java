/*
 * Ejercicio 1. Los profesores de la escuela hemos tenido un problema a la hora de exportar 
 * los listados de los alumnos y cada uno de ellos se ha duplicado en cada línea. 
 * Suponiendo la lectura de un fichero, línea a línea 
 * (podemos crear una variable de tipo Cadena para almacenar una supuesta línea errónea y probar con ella). 
 * Ayúdanos a generar el listado correcto, mostrándolo corregido por pantalla.
 * Tomando como ejemplo la lectura de una línea de un supuesto fichero proporcionado “Tomás Pérez CamposTomás Pérez Campos”,
 * como resultado debería generarse una línea con “Tomás Pérez Campos”, es decir, 
 * habrá que hacer el correspondiente tratamiento de cadenas para que se corrija 
 * cualquier cadena con dicho error (fíjate bien en el formato de entrada y en el de salida deseado).
 */

package dam2.inicial.ejercicio1;

public class ListadoAlumnos 
{

	public static void main(String[] args) 
	{
		// Creamos la variable tipo cadena lineaErronea para almacenar en ella un ejemplo de un supuesto error y probar.
		String lineaErronea = "Tomás Pérez CamposTomás Pérez Campos";
		
		//Partiendo por la mitad la cadena, sabremos dónde acaba el resultado correcto y donde empieza el error.
		int longitudCorrecta = lineaErronea.length()/2;
		
		//Imprimimos lineaErronea desde la posicion 0 hasta la longitud correcta.
		System.out.println(lineaErronea.substring(0, longitudCorrecta));

		//También se podría haber hecho asi System.out.println(lineaErronea.substring(0, lineaErronea.length()/2));
	}

}
