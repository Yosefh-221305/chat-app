import java.net.*;
import java.io.*;
class server {
    
    ServerSocket server;
    Socket socket;
    BufferedReader br;
    PrintWriter out;
    //constructor
    public server(){
        try {
           server = new ServerSocket(7777);
           System.out.println("Server is Ready to accept connection");
           System.out.println("Waiting....");
           socket = server.accept();

            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            out = new PrintWriter(socket.getOutputStream());

        startReading();
        startWriting();

        } catch (Exception e) {
            e.printStackTrace();
        }
   
        
    }
    public void startReading(){
        //thread-will read and keep giving

        Runnable r1=()->{
            System.out.println("reader Started...");
            while (true) 
            {
                String msg=br.readLine();
              
                
            }
        };

    }
    public void startWriting(){

        //thread-will collect data from the user and then send down to client

        Runnable r2=()->{
            
        };

    }


    public static void main(String[] args) {
        System.out.println("This is Server..Goin to Start server");
        new server();
    }

}
