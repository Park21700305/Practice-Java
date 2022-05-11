//21700305 박지성 CH08
public class CH08_ClassFriend extends CH08_SchoolFriend {
    private String sentence1;
    public CH08_ClassFriend(String sentence,String sentence1){
        super(sentence);
        this.sentence1 = sentence1;
    }
    public void whatfriend(){
        super.whatfriend();
        System.out.println(this.sentence1);
    }
}
