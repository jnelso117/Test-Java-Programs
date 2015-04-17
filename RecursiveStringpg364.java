
public class RecursiveStringpg364 
{
  public static String mystery(String s)
  {
	  int N = s.length();
	  if (N <= 1) return s;
	  String a = s.substring(0, N/2);
	  String b = s.substring(N/2, N);
	  System.out.println(a);
	  System.out.println(b);
	  return mystery(b) + mystery(a);
	  //reverses string;
	  
  }
  public static void main(String[] args)
  {
	  String s = "How are you";
	  System.out.println(s);
	  System.out.print(mystery(s));
  }
}
