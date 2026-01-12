import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        ArrayList<String> suitcase = new ArrayList<>();
        suitcase.add("toothbrush");
        suitcase.add("tee shirts");
        suitcase.add("cool hat");

        String goodbyeMessage = "going on vacation!";

        System.out.print(suitcase.get(0));
        System.out.print(suitcase.getLast());
        System.out.print(goodbyeMessage.toUpperCase());
    }
}
