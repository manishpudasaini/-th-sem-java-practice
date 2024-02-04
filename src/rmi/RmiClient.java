package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RmiClient {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        Practice practice = (Practice) Naming.lookup("rmi://localhost:1234/test");
        int sumOfNum = practice.addNum(3,3);
        System.out.println("Sum of two number "+ sumOfNum);
    }
}
