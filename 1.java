import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        // A packing list for a journey using Java containers (ArrayLists and Strings)
        ArrayList<String> travelItems = new ArrayList<>();
        travelItems.addAll(Arrays.asList("passport", "camera", "sunscreen", "hat"));

        // Currently, sunglasses are being appended to the list.
        // Your task is to add them at index 2 instead.
        travelItems.add(2, "sunglasses");
        System.out.print("Updated travel items: ");
        System.out.println(travelItems);
    }
}
