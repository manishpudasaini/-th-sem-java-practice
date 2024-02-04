package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RmiServer {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        PracticeImpl practiceImpl = new PracticeImpl();
        LocateRegistry.createRegistry(1234);
        Naming.rebind("rmi://localhost:1234/test",practiceImpl);
        System.out.println("Server is started.......");
    }
}
