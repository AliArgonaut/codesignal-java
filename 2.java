import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        ArrayList<String> suitcase = new ArrayList<>(Arrays.asList("shirt", "shorts", "toothbrush", "shoes"));
        suitcase.add("sunglasses");
        suitcase.add(2, "socks");
        System.out.print("Updated suitcase: ");
        System.out.println(suitcase);
        String firstItem = suitcase.get(0); // 'shirt'
        String lastItem = suitcase.get(suitcase.size() - 1); // 'sunglasses'
        System.out.println(firstItem + " " + lastItem);
        suitcase.remove(3);
        System.out.print("Final suitcase contents: ");
        System.out.println(suitcase);
    }
}
