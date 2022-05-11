//21700305 박지성 CH08
public class CH08_SchoolFriend extends CH08_Friend {
    private String sentence;
    public CH08_SchoolFriend(String sentence){
        super();
        this.sentence = sentence;
    }
    public void whatfriend(){
        super.whatfriend();
        System.out.println(this.sentence);
    }
}
