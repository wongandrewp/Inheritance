package wong.andrew.rotatearray;
import java.util.*;

/**
 * Created by andrewwong on 5/1/17.
 */
public class Main extends ArrayList{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <15; i++){
            list.add(i);
        }
        System.out.println(list);

        System.out.println(rotate(list,2));
    }
    public static List rotate(List<Integer> list, int k){

        for (int i = 0; i < k; i++){
            list.add(list.get(i));
        }

        for(int a = 0; a < k; a++){
            list.remove(0);
        }

        return list;
    }
}
