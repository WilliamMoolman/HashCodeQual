import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Controller {
    private int D; //Duration of sim
    private int I; //Intersections
    private int S; //Streets
    private int V; //Cars
    private int F; //Bonus points /car

    public static void main(String[] args){
        try {
            String file = "a.txt";
            Controller c = new Controller(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public Controller(String input){
        try {
            Scanner scFile = new Scanner(new File(input));
            Scanner scLine = new Scanner(scFile.nextLine());
            readCarsFrom
            D = scLine.nextInt();
            I = scLine.nextInt();
            S = scLine.nextInt();
            V = scLine.nextInt();
            F = scLine.nextInt();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }


    }


    private void readCarsFromFile(Scanner sc) {

    }

}
