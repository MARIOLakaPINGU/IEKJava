

package com.iek.mathima1;


import java.util.Scanner;

public class MATHIMA1 {
    
        public static String name;
        public static String lastName;
        public static int age;
        public static char gender;
        public static double salary;
        
        static public Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int x = 123;
        System.out.println(x);
        
        
        
        
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
        
        getAge(); // kalei thn function
        getSalary(); // kalei thn function
        
        System.out.println(getAge()); //kanei print thn function
        System.out.println(getSalary()); //kanei print thn function 
        
        
    }
    
    static void employeeStat(){
        System.out.println("Name: " + name );
        System.out.println("Lastname: " + lastName );
        System.out.println("Age: " + age );
        System.out.println("Gender: "+ gender);
        System.out.println("Salary: " + salary + "€");
    }
    
    
    static int getAge(){
        
        return(age);
        
    }
    
    static double getSalary(){
        
        return (salary);
    }
    
    
    
   
}


