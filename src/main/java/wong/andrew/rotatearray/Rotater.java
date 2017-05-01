package wong.andrew.rotatearray;
import java.util.*;
/**
 * Created by andrewwong on 5/1/17.
 */
public class Rotater extends ArrayList {

    public static List rotate(List<Integer> list, int k){

        for (int j = 0, i = 0; j < k; j++, i++){
            list.add(list.get(i));
        }

        for(int a = 0; a < k; a++){
            list.remove(0);
        }

        return list;

    }

}
