import java.io.*;
import java.net.*;
class Cip
{
public static void main(String args[])
{
Socket soc;
PrintStream ps;
try {
  InetAddress ia=InetAddress.getLocalHost();
  soc=new Socket(ia,8020);
ps=new PrintStream(soc.getOutputStream());
ps.println(ia);
}
catch(IOException e)
{
System.out.println("The exception is: "+e); }
}
}
