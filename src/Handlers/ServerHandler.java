package Handlers;

import com.bulletphysics.collision.dispatch.CollisionWorld;
import com.bulletphysics.dynamics.vehicle.WheelInfo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Денис Рабочая on 13.02.2017. This class of RunServer.
 */
public class ServerHandler extends Thread {
    static ServerSocket serverSocket;
    public ServerHandler()
    {
        start();
        sStart();
        sHandle();
    }


    void sStart()
    {
        try {
            serverSocket = new ServerSocket(54815);
            System.out.println("Server start at port: " + serverSocket.getLocalPort());
        }catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    void sHandle()
    {
        while (true)
        {
            try {
                Socket socket = serverSocket.accept();
            }catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }
}
