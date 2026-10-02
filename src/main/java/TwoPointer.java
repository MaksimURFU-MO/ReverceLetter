import java.util.Objects;

public class TwoPointer {
    public static void main(String[] args) {
        TwoPointer t = new TwoPointer();
        System.out.println(t.reverse2("123mak9kd22@"));

    }
    public String reverse2(String letter) {
        if (Objects.isNull(letter)){
            return "Строка не может быть равна null";
        }
        int len = letter.length();
        char[] chars = letter.toCharArray();
        //char[] newChars = new char[len];
        int left = 0;
        int right = letter.length() - 1;
        while(left < right) {
            if (!Character.isLetter(chars[left]) && !Character.isLetter(chars[right])) {
                left++;
                right--;
            }
            if (Character.isLetter(chars[left]) && !Character.isLetter(chars[right])) {
                right--;
            }
            if (!Character.isLetter(chars[left]) && Character.isLetter(chars[right])) {
                left++;
            }
            if (Character.isLetter(chars[left]) && Character.isLetter(chars[right])) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        String result = new String(chars);
        return result;
    }
}
