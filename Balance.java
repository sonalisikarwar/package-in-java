
package MyPack;
public class Balance {
    String name;
    double bal;
    Balance(String n, double b){
        name=n;
        bal=b;
    }
    public void show(){
        if(bal<0)
            System.out.println("--> ");
        System.out.println(name + ": $" + bal);
        
        }
    }
    
    
/*class AccountBalance{
    public static void main(String args[]){
        Balance current[]=new Balance[3];
        current[0]=new Balance("armstrong",120.120);
        current[1]=new Balance("armstrongt",150.20);
        current[0]=new Balance("armstrongu",-12.30);
        for(int i=0;i<3;i++)current[i].show();
        
    }
}*/
