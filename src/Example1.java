import java.util.ArrayList;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args){
        var studentNames = new ArrayList<String>();
        var reader = new Scanner(System.in);
        var userResponse = "";
        while (!userResponse.equals("done")){
            System.out.println("Enter next name or 'done' to end:");
            userResponse = reader.nextLine();
            if (!userResponse.equals("done") ){
                studentNames.add(userResponse);

            }
        }
    System.out.println("The students in your class are");
        for(var Name: studentNames){
            System.out.println(Name);
        }
    }
}
