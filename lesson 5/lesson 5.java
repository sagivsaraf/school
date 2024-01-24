import java.util.Scanner;
import java.util.Random;
public class Main
    {
 public static void f1(String name)
    {
  System.out.println("hello "+name);
    }
   public static void f2(int num)
      {
          System.out.println(num/5);
      }
      public static int f3(int num1 , int num2)
      {
          return (num1*num2);
      }
  public static String f4(int numb1, int numb2, int numb3,int total ,double ave)
  {
      total = numb1 + numb2 + numb3;
      ave = (double) total /3;
      return ("the ave is " + ave);
  }
      public static String f5(int r)
      {
          double s=(3.14*(r*r));
          double p=(2*3.14*r);
          return ("s ="+s+"and p="+p);
      }
      public static String f6(double a , double b)
      {
          double c2 = a * a + b * b;
          double c = Math.sqrt(c2);
          return ("the size is " + c);
      }
          public static int f7(String word)
          {
              char dig1=word.charAt(0);
              char dig2=word.charAt(1);
              char dig3=word.charAt(2);
              return (dig3+dig2+dig1);
          }
          public static int f8 (int a1 , int d , int n)
          {
           int an=(a1+d*(n-5));
           return (an);
          }
          public static int f9(String str)
          {
           int len=str.length();
           return (len*len);
          }
      public static String f10(String str1 , String str2)
      {
          int len1=str1.length();
          int len2=str2.length();
          if (len1>len2)
              return (len1+"is bigger");
          else
              return (len2+"is bigger");
      }
      public static String f11(String str3 , int int1)
      {
          int size=str3.length();
          if(size==int1)
          return ("true");
          else
              return ("false");
      }
      public static String f12 ()
      {
          Random r=new Random();
          int num1=r.nextInt(6)+1;
          Random r1=new Random();
          int num2=r1.nextInt(6)+1;
          if (num1==num2)
              return ("true");
          else
              return ("false");
      }
      public static String f13 (char char1 , String str4)
      {
          int index=str4.indexOf(char1);
          if (index>1)
              return true;
          else
              return false;
      }

      public static void main(String[] args)
    {
      f1("Itay");
      f2(15);
      System.out.println(f3(2,5));
      System.out.println(f4(2,3,4,0,0));
      System.out.println(f5(5));
      System.out.println(f6(2,3));
      System.out.println(f7("abc"));
      System.out.println(f8(2,3,5));
      System.out.println(f9("abc"));
      System.out.println(f10("abc","ab"));
      System.out.println(f11("abc",3));
      System.out.println(f12());
      System.out.println(f13('a',"abc"));
    
    }
  }
