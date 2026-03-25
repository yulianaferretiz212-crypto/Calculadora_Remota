import java.rmi.registry.LocateRegistry;import java.rmi..registry.registry;

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
        
        }
    }

}
