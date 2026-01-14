class Solution {
    public static void main(String[] args) {
        String missionName = "Sort";

        System.out.println(missionName.charAt(0));
        System.out.println(missionName.charAt(missionName.length() - 1));

        String newMission = "P" + missionName.substring(1, missionName.length() - 1) + "k";
        System.out.println(newMission);
    }
}
