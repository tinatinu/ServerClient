import java.net.*;  
    import java.io.*; 
    class MyClient{  
    public static void main(String args[])throws Exception{ 
    Socket s=new Socket("localhost",3333);  
    DataInputStream din=new DataInputStream(s.getInputStream()); 
