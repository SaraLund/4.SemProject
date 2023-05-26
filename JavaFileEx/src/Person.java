public class Person {
    private String Name;
    private double Height;
    private boolean IsMarried;
    private int NumOfChildren;

    public Person(String name, double height, boolean isMarried, int numOfChildren){
        this.Name = name;
        this.Height = height;
        this.IsMarried = isMarried;
        this.NumOfChildren = numOfChildren;
    }

    public String MakeTitle(){
        return Name + ";" + Height + ";" + IsMarried + ";" + NumOfChildren;
    }
}
