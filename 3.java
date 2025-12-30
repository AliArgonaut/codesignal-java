import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        ArrayList<String> bag = new ArrayList<>();
        bag.add("t-shirt");
        bag.add("shorts");
        bag.add("toothbrush");
        bag.add(1, "hat");
        System.out.println(bag);
    }
}
