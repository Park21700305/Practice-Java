//21700305 박지성 CH08
public class CH08_FriendCall_main {
    public static void main(String[] args) {
        CH08_Friend [] fr = new CH08_Friend[3];
        fr[0] = new CH08_Friend();
        fr[1] = new CH08_SchoolFriend("Handong Global University");
        fr[2] = new CH08_ClassFriend("Handong Global University", "Java Programming");
        for (int i=0;i<fr.length;i++)
        {
            fr[i].whatfriend();
            System.out.println(" ");
        }
    }
}