import java.util.Random;

public class Base {
    public static void main(String[] args) {
        int intArray[];
        intArray = new int[20];
        Random random = new Random();
        int Low = -10;
        int High = 10;


        for (int a = 0; a < intArray.length; a++) {
            intArray[a] = random.nextInt(High - Low) + Low;
            System.out.print(intArray[a] + ", ");
        }
//        System.out.println(intArray);
        int max = Low - 1;
        int min = High + 1;
        int maxIndex = 0;
        int minIndex = 0;
        for (int a = 0; a < intArray.length; a++) {
            if (intArray[a] < 0 && intArray[a] >= max) {
                max = intArray[a];
                maxIndex = a;
            }
            if (intArray[a] >= 0 && intArray[a] <= min) {
                min = intArray[a];
                minIndex = a;
            }
        }
        if (max >= Low && min <= High) {
            intArray[minIndex] = max;
            intArray[maxIndex] = min;
        } else {
            System.out.println("Array contains only positive(negative) numbers");
        }
        System.out.println("Twisted array");
//        System.out.println(intArray.toString());
        for (int a = 0; a < intArray.length; a++) {
            System.out.print(intArray[a] + ", ");
        }


    }
}

