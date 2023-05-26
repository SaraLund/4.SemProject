public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Write a method void printMultiples()that prints on the screen the multiples of 7 that are less than 500.
        //PrintMultiples();

        //Write a method void printMultiples(int n)that prints on the screen the multiples of 7 that are less than n.
        //PrintMultiples(50);

        // Write a method void printMultiples(int k, int n)that prints on the screen the multiples of k that are less than n.
        PrintMultiples(50, 4);
    }

    public static void PrintMultiples(){
        for(int i = 0; i < 500; i++){
            if(i%7 == 0){
                System.out.println(i);
            }
        }
    }

    public static void PrintMultiples(int n){
        for(int i = 0; i < n; i++){
            if(i%7 == 0){
                System.out.println(i);
            }
        }
    }

    public static void PrintMultiples(int n, int k){
        for(int i = 0; i < n; i++){
            if(i%k == 0){
                System.out.println(i);
            }
        }
    }
}