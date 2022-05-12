import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Please, enter 10 integers.");


        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            Scanner in = new Scanner(System.in);
            array[i] = in.nextInt();
        }
        

        System.out.println(isStrictlyGrowing(array));
    }

    public static String isStrictlyGrowing(int[] array){
        for (int i = 1; i < array.length; i++) {
            if(array[i-1] >= array [i]){
                return ("Your array is not strictly growing, because " + array[i-1] + " is bigger(or equals) " + array[i] +".");
            }
        }
        return "Your array is  strictly growing.";
    }





}
