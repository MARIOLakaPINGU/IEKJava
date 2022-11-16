

package com.iek.mathima1;


import java.util.Scanner;

public class MATHIMA1 {
    
        public static String name;
        public static String lastName;
        public static int age;
        public static char gender;
        public static double salary;
    
    
    public static void main(String[] args) {
        
        
        
        
        Scanner console = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        
        name = console.nextLine();
        
        System.out.println("Enter lastname: ");
        
        lastName = console.nextLine();
       
       
        System.out.println("Enter age: ");
        age = console.nextInt();
        
        
        System.out.println("Enter gender: (M/F) ");
        gender = console.next().charAt(0);
        
        System.out.println("Enter salary: ");
        salary = console.nextDouble();
        
        employeeStat();
        
        
    }
    
    static void employeeStat(){
        System.out.println("Name: " + name );
        System.out.println("Lastname: " + lastName );
        System.out.println("Age: " + age );
        System.out.println("Gender: "+ gender);
        System.out.println("Salary: " + salary + "€");
    }
}

