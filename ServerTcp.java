import java.net.*;  
import java.io.*;  
class ServerTcp
{  
    public static void main(String args[])throws Exception
    {  
        ServerSocket ss=new ServerSocket(3333);
        Socket s=ss.accept();  
        DataInputStream din=new DataInputStream(s.getInputStream());  
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
      
        String str="",str2=""; 
        while(!str.equals("stop"))
        {  
            str=din.readUTF();  
            System.out.println("client says: "+str);  
            str2=br.readLine();  
            dout.writeUTF(str2);  
            dout.flush();  
        }     
        din.close();  
        s.close();  
        ss.close();  
    }
}  




/*import java.io.*;
import java.net.*;
public class ServerTcp
{
  public static void main(String[] args) throws Exception
  {
      ServerSocket sersock = new ServerSocket(3000);
      System.out.println("Server  ready for chatting");
      Socket sock = sersock.accept( );  
      BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
	                     
      OutputStream ostream = sock.getOutputStream(); 
      PrintWriter pwrite = new PrintWriter(ostream, true);
 
                              
      InputStream istream = sock.getInputStream();
      BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
 
      String receiveMessage, sendMessage;
      while(true)
      {
        if((receiveMessage = receiveRead.readLine()) != null)  
        {
           System.out.println(receiveMessage);         
        }         
        sendMessage = keyRead.readLine(); 
        pwrite.println(sendMessage);             
        pwrite.flush();
      }               
    }                    
}*/                      
