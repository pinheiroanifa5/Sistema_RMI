
//sistema RMI em que um cliente possa enviar uma mensagem para um servidor



import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;import java.rmi.Remote;

public class RMIServer {
    public static void main(String[] args) {
        try {
            MensagemInterface mensagemService = new MensagemServiceImpl();

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("MensagemService", mensagemService);

            System.out.println("Servidor RMI pronto.");
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}

interface MensagemInterface extends Remote {
     String enviarMensagem(String mensagem) throws RemoteException;
}

class MensagemServiceImpl extends UnicastRemoteObject implements MensagemInterface {
     MensagemServiceImpl() throws RemoteException {
        super();
    }

     public String enviarMensagem(String mensagem) throws RemoteException {
        System.out.println("Mensagem recebida: " + mensagem);
        return "Mensagem! ";
    }
}






