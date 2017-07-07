# Hello
import java.io.*;
import java.util.*;
public class Hello
{
public static void main(String args[])throws IOException
{
int n,i;
BufferedReader br=new Bufferedreader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
for(i=0;i<=n;i++)
{
System.out.println("Hello");
}
}
}
