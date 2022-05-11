//21700305 박지성 CH08
public class CH08_History extends CH08_Book{
    private String author;
    public CH08_History(String name, String author){
       super(name);
       this.author =  author;
    }
    public String toString(){
        return("Id: "+getId()+"\nBook Name: "+getName()+"\nAuthor: "+this.author);
    }
    public void print(){
        String tmp = this.toString();
        System.out.println("<<History>>");
        System.out.println(tmp);
    }
}
