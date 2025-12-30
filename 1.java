import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        ArrayList<String> travelItems = new ArrayList<>();
        travelItems.addAll(Arrays.asList("passport", "camera", "sunscreen", "hat"));
        travelItems.add(2, "sunglasses");
        System.out.print("Updated travel items: ");
        System.out.println(travelItems);
    }
}
