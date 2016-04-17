

package magicsquare;

/**
 *
 * @author mike
 */
import java.util.Scanner;
import java.io.File;
public class MagicSquare {

    /**
     * @param args the command line arguments
     */
    static Scanner input;
    public static void main(String[] args) {
        try{
            int[][] copySquare;
            int numSquare;
            boolean boo = true;
            Scanner keyboard = new Scanner(System.in);
            String inFile;
            System.out.println("Enter input filename: ");
            inFile = keyboard.next();
            
            

            File file = new File( inFile );
            input = new Scanner( file );
            numSquare = input.nextInt();
            System.out.printf("Checking a %d x %d Magic Square!\n", numSquare , numSquare);
            int magicNumber = (numSquare*((numSquare*numSquare)+1)/2); 
            copySquare = new int[numSquare][numSquare];
            displaySquare(copySquare, magicNumber);
            System.out.println();
            if (!checkRows(copySquare, magicNumber)){
                boo = false;
            }
            System.out.println();
            if (!checkColumns(copySquare, magicNumber)){
                boo = false;
            }
            System.out.println();
            if (!checkDiagonals(copySquare, magicNumber)){
                boo = false;
            }
            System.out.println();
            if (!checkUnique(copySquare, magicNumber)){
                boo = false;
            }
            System.out.println();
            
            if (boo == false){
                System.out.println("MAGIC SQUARE: BAD");
            }
            else
                System.out.println("MAGIC SQUARE: GOOD");
            
        }
        catch (Exception ex){
            System.out.println("An error has occured!");
            System.out.println(ex.toString());
        }
    }
    
    public static void displaySquare(int[][] square, int a){// TODO code application logic here
      
        
        System.out.printf("The magic number is %d\n" , a);
        System.out.print("    ");
        for(int i = 1; i <= square.length; i++ ){
            
            System.out.printf("[%2d] ", i);
           
        }
        System.out.println();
        for(int i = 0; i < square.length; i++)
        {
            System.out.printf("[ %d]", i+1);
            for(int j = 0; j < square.length; j++)
            {
                square[i][j]= input.nextInt();
                System.out.printf("%4d ", square[i][j]);
            }
            System.out.println();
            
        }
    }
    public static boolean checkRows(int[][] foo, int b){
        boolean boo = true;
        
        for(int i = 0; i < foo.length; i++){
            int sum = 0;
            for(int j = 0; j < foo.length; j++){
                sum += foo[i][j];
            
            }
            if (sum != b){
                boo =  false;
                System.out.printf("ROW %2d:BAD (%d instead of %d)\n", i+1, sum, b);
            }
            else
                System.out.printf("ROW %2d:GOOD\n", i+1 );
            
        }
    
        return boo;
    }
    public static boolean checkColumns(int[][] foo, int b){
        boolean boo = true;
       for(int i = 0; i < foo.length; i++){
            int sum = 0;
            for(int j = 0; j < foo.length; j++){
                sum += foo[j][i];
            
            }
            if (sum != b){
                boo =  false;
                System.out.printf("COL %2d:BAD (%d instead of %d)\n", i+1, sum, b);
            }
            else
                System.out.printf("COL %2d:GOOD\n", i+1 );
        }
        return boo;
        
    }
    public static boolean checkDiagonals(int[][] foobar, int d){
        boolean boo = true;
        int sum = 0;
        for(int i = 0; i < foobar.length; i++){
            for(int j = 0; j < foobar.length; j++){
               if(i == j)
                sum += foobar[i][j];
                
            }   
        }
        if (sum != d)
        {
            boo =  false;
            System.out.println("DIAG 1: BAD");
        }
        else
            System.out.println("DIAG 1: GOOD");
                
        sum = 0;
        for(int i = foobar.length - 1; i >= 0; i--){
            for(int j = foobar.length - 1; j >= 0; j--){
               if(i == j)
                sum += foobar[i][j];
            }
        }
        if (sum != d)
        {
            boo =  false;
            System.out.println("DIAG 2: BAD");
        }
        else
            System.out.println("DIAG 2: GOOD");

        return boo;
    }
    public static boolean checkUnique(int[][] dilligaf, int e){
        for(int i = 0; i < dilligaf.length; i++){
            for(int j = 0; j < dilligaf.length; j++){
                for(int k = 0; k < dilligaf.length; k++){
                    for(int l = 0; l < dilligaf.length; l++){
                        if (i != k && j != l){
                            if(dilligaf[i][j] == dilligaf [k][l]){
                                System.out.print("UNIQUE: BAD");
                                return false;
                            }
                        }
                    
                    }
                }  
            }
        }
        System.out.println("UNIQUE: GOOD");
        return true;
    }
}
