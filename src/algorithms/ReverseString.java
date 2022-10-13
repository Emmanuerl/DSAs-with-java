package algorithms;

public class ReverseString {
    public static void main(String[] args) {
        final var input = "favour";
        System.out.println(reverseStr("favour"));
    }

    public static String reverseStr(String input){
        var resultArr = new String[input.length()];
        for(int i = 0; i < input.length(); i++){
            resultArr[input.length() - i - 1] = String.format("%c",input.charAt(i));
        }
        return String.join("",resultArr);
    }
}
