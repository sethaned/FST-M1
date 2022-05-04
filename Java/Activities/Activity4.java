import java.util.Arrays;
public class Activity4 {
    public static void main(String[] args) {
//defining an array of integer type
        int[] data = { 9, 5, 1, 4, 3 };
//invoking sort() method of the Arrays class
        Arrays.sort(data);
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < data.length; i++)
        {
            //System.out.println(data[i]);
           System.out.printf(Arrays.toString(data));
           break;
         }
    }
}