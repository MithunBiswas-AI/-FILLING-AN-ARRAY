
public class Main {
    public static void main(String[] args) {

                int[] numbersArray = new int[10];


        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = 9 - i;
        }


        System.out.println("Values in the array:");

        for (int number : numbersArray) {
            System.out.println(number);
        }

    }
}