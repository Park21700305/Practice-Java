//21700305 박지성 CH08
public class CH08_Science extends CH08_Book {
    private String publisher;
    public CH08_Science(String name, String publisher) {
        super(name);
        this.publisher = publisher;
    }

    public String toString(){
        return("Id: "+getId()+"\nBook Name: "+getName()+"\nPublisher: "+this.publisher);
    }
    public void print(){
        String tmp = this.toString();
        System.out.println("<<Science>>");
        System.out.println(tmp);
    }
}
