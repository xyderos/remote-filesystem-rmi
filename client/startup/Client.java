package client.startup;

import client.view.UserInterface;
import common.CatalogueServer;

import java.net.MalformedURLException;
import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        try {
            CatalogueServer server = (CatalogueServer) Naming.lookup("FILE_SERVER");
            UserInterface ui = new UserInterface(server);
        } catch (RemoteException e) {
            System.out.println("Couldn't find server");
            e.printStackTrace();
        } catch (NotBoundException e) {
            System.out.println("Couldn't find server");
            e.printStackTrace();
        } catch (MalformedURLException e) {
            System.out.println("Couldn't find server");
            e.printStackTrace();
        }
    }
}