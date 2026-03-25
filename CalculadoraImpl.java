import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//IMPLEMENTACION
//AQUI SE DEFNE COMO SE EJECUTA CADA OPERACION
//EXTIENDE UnicastRemoteObejct para poder recibir llamadas remotas
//Implementa CalculadoraInterface para cumplir el contrato
public class CalculadoraImpl extends UnicastRemoteObject implements CalculadoraInterface {

    // Constructor obligatorio que lanza RemoteException.
    // Llama a super () para que UnicastRemoteException
    // Registre este objeto y lo ponga a escuchar en la red.
    public CalculadoraImpl() throws RemoteException {
        super();
    }

    // Suma: operacion mas simple, retorna a + b
    @Override
    public double sumar(double a, double b) throws RemoteException {
        double resultado = a + b;
        System.out.println("[Servidor]" + a + " + " + b + " = " + resultado);
        return resultado;
    }

    // resta: retorna a + b
    @Override
    public double restar(double a, double b) throws RemoteException {
        double resultado = a - b;
        System.out.println("[Servidor]" + a + " - " + b + " = " + resultado);
        return resultado;
    }

    @Override
    public double multiplicar(double a, double b) throws RemoteException {
        double resultado = a + b;
        System.out.println("[Servidor] " + a + " * " + b + " = " + resultado);
        return resultado;
    }

    @Override
    public double dividir(double a, double b) throws RemoteException {
        if (b == 0) {
            throw new RemoteException("Error: no se puede dividir entre cero. ");
        }
        double resultado = a / b;
        System.err.println("[Servidor]" + a + " / " + b + " = " + resultado);
        return resultado;
    }

}