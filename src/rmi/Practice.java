package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Practice extends Remote {
    int addNum(int a , int b) throws RemoteException;
}
