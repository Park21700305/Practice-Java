import java.util.Locale;

public class MyStringDemo {
    public static void main(String[] args) {
        String sentence = "Jesus Christ Is My Savior";
        int sIndex;
        System.out.println(sentence);
        System.out.println("012345678901234567890123456");
        sIndex = sentence.indexOf("Savior");
        System.out.println("The word \"Savoior\" starts at index " + sIndex);
        sentence = sentence.substring(0,sIndex) + "friend";
        System.out.println("the changed string is:");
        System.out.println(sentence);
        sentence = sentence.replace("friend","joy");
        sentence = sentence.toUpperCase();
        System.out.println("The changed string is:");
        System.out.println(sentence);
    }
}
