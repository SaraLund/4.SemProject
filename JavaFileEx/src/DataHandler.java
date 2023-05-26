import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataHandler {
    private String DataFileName;

    private String[] persons;

    public String getDataFileName(){
        return DataFileName;
    }

    public DataHandler(String dataFileName){
        this.DataFileName = dataFileName;
    }

    public void SavePerson(Person person){
        try {
            FileWriter myWriter = new FileWriter(DataFileName);
            myWriter.write(person.MakeTitle());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public Person LoadPerson(){
        ReadFile();
        String[] person = persons[0].split(";", 4);
        Person newPerson = new Person(person[0], Double.parseDouble(person[1]), Boolean.parseBoolean(person[2]), Integer.parseInt(person[3]));
        return newPerson;
    }

    public void ReadFile(){

        try {
            File myObj = new File("Data.txt");
            persons = new String[(int)myObj.length()];
            Scanner myReader = new Scanner(myObj);
            int i = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                persons[i] = data;
                i++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
