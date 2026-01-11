import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        ArrayList<String> packingList = new ArrayList<>();
        packingList.add("clothes");
        packingList.add("toothbrush");
        packingList.add("passport");
        packingList.add("camera");

        String itemToCheck = "passport";
        boolean isItemPacked = false;
        int itemIndex = -1;

        if (packingList.contains(itemToCheck)) {
            isItemPacked = true;
            itemIndex = packingList.indexOf(itemToCheck);
        }

        System.out.println("Is the item packed? " + isItemPacked);
        System.out.println("Item index: " + itemIndex);
    }
}
