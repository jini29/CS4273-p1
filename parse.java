import java.io.BufferedReader; // import the BufferedReader class
import java.io.FileReader; // import the FileReader class
import java.io.IOException; // import the IOException class
import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner; // import the Scanner class

/**
 * parse : a class to parse csv files into a string list 
 * @param args : args not used, user input is gathered via java.util.Scanner
 *      
 *      use: 
 *              user enters es/en to choose which file to parse. The file is then parsed and stored in an array list. 
*/
public class parse{
public static void main(String[] args) throws IOException
{
    System.out.println("enter which language: en / es");
    
    // Using Scanner for Getting Input from User
    Scanner in = new Scanner(System.in);
    String file = in.nextLine();


    //tryen to create a buffered reader for a file reader 
    try (BufferedReader csv = new BufferedReader(new FileReader(file+".csv"))) {

        // creating a temp String row for the row data
        String row;

        //creating a string array to hold the row data
        String[] data = null;



        ArrayList<String> letters = new ArrayList<String>(); // Create an ArrayList object
        

         while((row = csv.readLine()) != null)
        {
            data = row.split(",");

            for(String s : data)
            letters.add(s);
        } 
        /* Printing Output */
        //for(String s: letters)
        //    System.out.println(s);
    }
    catch(Exception e)
    {
        System.out.println("!! File Not Found !!");
    }
    
    in.close();
}

}
