package arrays;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
    String name = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String fristName = sc.nextLine();
        System.out.println("enter your last name");
        String lastname = sc.nextLine();
        System.out.println("full name "+fristName+" "+lastname);
    int ages[]= new int[4];

        for (int age:ages
             ) {
            System.out.println(age);
        }
       // System.out.println(age[8]);
    }
}
