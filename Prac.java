import java.util.Scanner;
public class Prac{
    public static void main( String []args){
        System.err.println("enter:");
        Scanner sc =new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        System.out.println(s1.toUpperCase());


        System.out.println(s1.toLowerCase());
        System.out.println(s1.equals(s2));
        System.out.println(s1.concat(s2));
        System.out.println(s1+""+s2);
        System.out.println(s1.substring(0,3));
        System.out.println(s1.trim());
        sc.close();

    }

}