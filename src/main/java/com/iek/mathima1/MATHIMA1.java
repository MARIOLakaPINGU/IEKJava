

package com.iek.mathima1;


import java.util.Scanner;

public class MATHIMA1 {
    
        public static String name;
        public static String lastName;
        public static int age;
        public static char gender;
        public static double salary;
        public static boolean adult;
        public static boolean female;
        static public Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("kostas", 'm');
        Employee emp2 = new Employee("Mariola",'f');
        
        
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
    
    static boolean getFemale(){
        if (gender == 'F'){
            female = true;
        }else{
            female = false;
        }
        return female;
    }
    
    static boolean getAdult(){
        if(getAge()>18){
            adult = true;
            
        }else{
            adult = false;
        }
        return adult;
    }
    
    static double getSalary(){
        
        return (salary);
    }
    
    static void setSalary(double x){
        salary = x;
    }
    
    static void getAge(int y){
        age = y;
    }
    
   
}


