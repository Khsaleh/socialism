/*
 * Social Muslim Comunity class -- Test
 * this class is created to capture the input from a user and pass it to the methodds
 */
package smc;
import java.util.Scanner;

/**
 *
 * @author Khaled Saleh
 */
public class SMC {

 
 
    public static void main(String[] args) {
        Scanner user_input= new Scanner(System.in);
        String first_name,last_name;
        int age;
        System.out.print("Enter Your First Name");
        first_name=user_input.next();
        System.out.print("Enter Your last Name");
        last_name = user_input.next();
        System.out.print("Enter Your Age");
        age= user_input.nextInt();
        String full_name = first_name + " " + last_name;
        Full_name full = new Full_name();
        full.check_name(full_name);
        AgerVerification age_1 = new AgerVerification();
        age_1.verify(age);
        
        
    }
    
    
}
