import java.io.File;  // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException;  // Import this class to handle errors

public class Main {
    public static void main(String[] args) {
        //W3Schools
        //CreateFile();
        //WriteToFile();
        //ReadFile();

        //Ex 11
        //CreatePersonFile();

        //Person Jan = new Person("Jan Brown", 188.8, false, 2);
        //System.out.println(Jan.MakeTitle());
        DataHandler handler = new DataHandler("Data.txt");
        //handler.SavePerson(Jan);

        Person loadedPerson = handler.LoadPerson();
        System.out.println(loadedPerson.MakeTitle());

        System.out.println("Hello world!");
    }

    public static void CreateFile(){
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void WriteToFile(){
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void ReadFile(){
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void CreatePersonFile(){
        try {
            File myObj = new File("PersonData.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}