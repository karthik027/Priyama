# Priyama
import java.util.*;
import java.io.*;
public class Power
{
  
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    Integer a=sc.nextInt();
    String b=String.valueOf(a);
    int l=b.length();
    char[] c=b.toCharArray();
    int sum=0;
    int pow=1;
    for(int i=0;i<l;i++)
    {       pow=1;
      for(int j=0;j<l;j++)
      {
        int k=c[i]-48; 
        pow=pow*k;
        //System.out.println(pow);
      }
      sum=sum+pow;
    }
    System.out.println(sum);
  }
}
