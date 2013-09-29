/*
 * This Class is to check on the age
 * the age comply to age restrictions criteria
 */
package smc;

/**
 *
 * @author Khaled Saleh
 */
public class AgerVerification {
    
    private int age;
    
    public void verify(int a){
        this.age = a;
        
        if ( a <= 16 ){
            System.out.println(" You should go play some where far away from this app ");
        } else if( a >=18 && a < 65) {
                    System.out.println(" Your Age Is Qualify for Match ");

    } else
                    System.out.println(" Man You are too old for that shit ");
    
        
    }
    
}
