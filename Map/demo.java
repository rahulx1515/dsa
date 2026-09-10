package Map;
import java.util.*;

public class demo {
    public static void main(String[] args) {
        String text = "This is demo String with demo text";
        HashMap<String , Integer> map = new HashMap<>();
        for(String word : text.split(" ")){
            if(map.containsKey(word)){
                int curr_val = map.get(word);
                map.put(word , curr_val + 1 );
            }
            else{
                map.put(word, 1);
            }
        }
        System.out.println(map);
    }
}