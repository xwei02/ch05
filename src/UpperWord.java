public class UpperWord {
    public static void upperCasePosition(String input) {
        boolean found = false;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.toUpperCase(c) == c) {
                System.out.println(c + " " + i);
                found = true;
                break;
            }
        }
        if (found = false) {
            System.out.println("-1");
            }
        }

    public static void main(String[] args) {
        upperCasePosition("abcd"); //prints -1
        upperCasePosition("AbcD"); //prints A 0
        upperCasePosition("abCD"); //prints C 2
    }


}
