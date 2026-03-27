import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

//SERVIDOR
//Arranca el registro RMI y publica la calculadora
//Para que los clientes pueden encontrarla y usarla

public class Servidor {

    public static void main(String[] args) {
        try{

        //Paso 1: Crear el objeto con la logica de la calculadora.
        //Al instanciar CalculadoraImpl, UnicasteRemoteObject
        // lo deja listo para recibir llamada por red
        CalculadoraImpl calculadora = new CalculadoraImpl();
        
        //Paso 2: Crear el registro de RMI en el puerto estandar 1099
        //El Registry es el directorio donde se publican los objetos remotos.
        Registry registry = LocateRegistry.createRegistry(1099);

        //Paso 3: Publicar la calculadora con un nombre clave.
        // El cliente usara este mismo nombre 
        registry.rebind("Calculadora", calculadora);

        System.out.println("==============================");
        System.out.println("  Servidor RMI iniciado");
        System.out.println("  Puerto : 1099");
        System.out.println("  Servicio: Calculadora");
        System.out.println("  Esperando clientes...");
        System.out.println("==============================");

    } catch (Exception e) {
        System.err.println("Error al iniciar el servidor: " + e.getMessage());
        e.printStackTrace();
        }
    }
}


