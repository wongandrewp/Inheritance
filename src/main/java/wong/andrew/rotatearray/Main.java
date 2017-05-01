package wong.andrew.rotatearray;
import java.util.*;

/**
 * Created by andrewwong on 5/1/17.
 */
public class Main{
    public static void main(String[] args) {
        Rotater rotater = new Rotater();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <7; i++){
            list.add(i);
        }
        System.out.println(list);

        System.out.println(rotater.rotate(list,3));
    }

}
