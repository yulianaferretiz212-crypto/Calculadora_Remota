import java.rmi.Remote;
import java.rmi.RemoteException;

//Extiende remote: le dice a Java 
//que esta interfaz puede ser usada desde otra maquina por la red.

public interface CalculadoraInterface extends Remote {
    // cada metodo lanza RemoteException porque
    // la llamada vieja por red y puede fallar en cualquier momen to.

    double sumar(double a, double b) throws RemoteException;

    double restar(double a, double b) throws RemoteException;
}