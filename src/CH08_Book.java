//21700305 박지성 CH08
public class CH08_Book {
    public static int id=0;
    private int id1;
    private String name;
    public CH08_Book(String name){
        id1 = ++id;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id1;
    }
    public String toString(){
        return("Id: "+getId()+"\nBook Name: "+getName());
    }
    public void print(){
        String tmp = this.toString();
        System.out.println("<<BOOK>>");
        System.out.println(tmp);
    }
}
