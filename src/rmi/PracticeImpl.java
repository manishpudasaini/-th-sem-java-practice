package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PracticeImpl extends UnicastRemoteObject implements Practice{
     PracticeImpl() throws RemoteException{
        super();
    }
    @Override
    public int addNum(int a, int b) throws RemoteException {
        return a+b;
    }
}
