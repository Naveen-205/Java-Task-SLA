package task;
import java.util.ArrayList;

public class ArrayList2 {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        for(int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
        
    }
}
