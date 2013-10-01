/*
 * To check if the name exists in our DB
 * 
 */
package smc;

/**
 *
 * @author Khaled Saleh
 */
public class FullName {
    
    private String full_name;
    
    public void check_name(String full){
        boolean found = false;
        this.full_name = full;
        String[] namesArray = {"khaled saleh","fadi abdeen", "hussam yousef"};
        for( int i=0;i<namesArray.length;i++){
            
            if (namesArray[i].equals(full)){
                found = true;
                break;
            }
        }
        if(found){System.out.println("You Are on the black list");}
        else{System.out.print("We Dont Have a record of your name");}
    }          
    
}
