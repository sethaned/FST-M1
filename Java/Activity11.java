import java.util.*;
public class Activity11 {

        public static void main(String args[]){
            HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap.
            map.put(1,"Red"); //Put elements in Map.
            map.put(2,"Blue");
            map.put(3,"Pink");
            map.put(4,"Yellow");
            map.put(5,"Green");
            map.remove(4);
            // Map after removing a colour
            System.out.println("After removing Yellow: " + map);

            if(map.containsValue("Red")){
                System.out.println("Green exists in the Map");
            } else {
                System.out.println("Green does not exist in the Map");
            }
            System.out.println("Size of the HashMap:" + map.size());
            }
}
