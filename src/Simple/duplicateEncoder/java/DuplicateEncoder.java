package Simple.duplicateEncoder.java;

public class DuplicateEncoder {

    static String encode(String word) {
        word = word.toLowerCase();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            result.append(word.indexOf(c) == word.lastIndexOf(c) ? '(' : ')');
        }

        return result.toString();
    }

    //@Deprecated
    //static String encode(String word){
    //    final char[] chars = word.toLowerCase().toCharArray();
    //    Map<Character, Integer> map = new HashMap<>();
    //    StringBuilder result = new StringBuilder();
    //
    //    for(Character c : chars) {
    //        map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
    //    }
    //
    //    for(Character c : chars) {
    //        result.append(map.get(c) == 1 ? '(' : ')');
    //    }
    //
    //    return result.toString();
    //}

}
