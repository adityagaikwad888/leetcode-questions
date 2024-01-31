import java.util.*;

////////////// We Use HashMap for creation of the set in java ///////////////////////////

class RandomizedSet {
    HashMap map ;
    List list ;
    Random rand ;
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = (int)map.get(val);
        int lasti = list.size();
        if (index != lasti) {
            list.set(index, list.get(lasti));
            map.put(list.get(lasti), index);

        }
        map.remove(val);
        list.remove(lasti);
        return true;
    }
    
    public int getRandom() {
        return (int)list.get(rand.nextInt(list.size()));
    }
}

public class Insert_Delete_GetRandom_O1 {
    public static void main(String[] args) {
        System.out.println("ok");
    }
}
