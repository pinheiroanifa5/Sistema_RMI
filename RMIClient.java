
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Remote;

public class RMIClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            MensagemInterface mensagemService = (MensagemInterface) registry.lookup("MensagemService");

            String resposta = mensagemService.enviarMensagem(" servidor ok!");
            System.out.println("Mensagem: " + resposta);
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
