

package com.iek.mathima1;


import java.util.Scanner;

public class MATHIMA1 {
    
    
    
    public static void main(String[] args) {
        
        String name;
        String lastName;
        int age;
        char gender;
        double salary;
        
        
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
        
        System.out.println("Name: " + name +" Lastname: " + lastName + " Age: " + age + " Gender: "+ gender + " Salary: " + salary);
        
        
        
        
        
        
    }
}

