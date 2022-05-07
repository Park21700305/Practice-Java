//21700305 박지성
public class CH06a_Neo {
    private String a;
    private static int count = 0;
    public CH06a_Neo(String a){
        this.a = a;
        count++;
    }
    public void emoticonStyle(){
        System.out.println("Neo is " + this.a + ".");
    }
    public static int gethowmany(){
        return count;
    }
}
