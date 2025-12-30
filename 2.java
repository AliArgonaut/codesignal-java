import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        // Start by creating an ArrayList representing suitcase items
        ArrayList<String> suitcase = new ArrayList<>(Arrays.asList("shirt", "shorts", "toothbrush", "shoes"));

        // Let's add "sunglasses" at the end of our suitcase
        suitcase.add("sunglasses");

        // Oops! We forgot socks. Let's insert socks at index 2
        suitcase.add(2, "socks");
        System.out.print("Updated suitcase: ");
        System.out.println(suitcase);

        // Now, let's get the first and the last item from the suitcase
        String firstItem = suitcase.get(0); // 'shirt'
        String lastItem = suitcase.get(suitcase.size() - 1); // 'sunglasses'
        System.out.println(firstItem + " " + lastItem);

        // Finally, let's remove "toothbrush" as we prefer to buy a new one at our
        // destination
        suitcase.remove(3);
        System.out.print("Final suitcase contents: ");
        System.out.println(suitcase);
        // Expected output:
        // Final suitcase contents: [shirt, shorts, socks, shoes, sunglasses]
    }
}
