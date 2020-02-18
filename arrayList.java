//program to insert, delete, display in java

import java.util.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>(5);
        int n = 0;
    while(n!=4)
    {
        System.out.println("1 To insert value");
        System.out.println("2 To delete value");
        System.out.println("3 To display value");
        System.out.println("4 To exit value");
       Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        switch(n)
        {
            case 1:
                    insert(a);
                    break;
            case 2:
                    deleteit(a);
                    break;
            case 3:
                    display(a);
                    break;
            default:
                    System.out.println("you input to exit");
        }
    }
        //for(Integer obj: a)
          //  System.out.println(a);
     }
    static void display(ArrayList<Integer> a)
    {
        for(Integer obj:a)
            System.out.println(obj);
    }
    static void insert(ArrayList<Integer> a)
    {
        System.out.println("Enter number to insert");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        a.add(p);
    }
    static void deleteit(ArrayList<Integer> a)
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println("Enter value you want to delete");
        a.remove(s);
    }
}
