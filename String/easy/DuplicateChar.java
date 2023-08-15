package String.easy;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {
    public static void main(String[] args) {
        printDuplicate("hefjwkjsflksjdflksj");
    }

    static void printDuplicate(String s) {
        HashMap<Character,Integer> hash = new HashMap<>();
        for(int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            if(hash.containsKey(c)) {
                hash.put(c,hash.get(c) + 1);
            } else {
                hash.put(c, 1);
            }
        }

        for (Map.Entry<Character,Integer> entry : hash.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.println(entry.getKey() +" => "+ entry.getValue());
            }
    }
}
}