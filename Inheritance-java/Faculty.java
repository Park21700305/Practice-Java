//Rep#08 21700305 박지성
public class Faculty extends Employee2{ //Employee2를 상속한 Faculty클래스이다.
    private String title; //클래스 외부에서 접근할 수 없도록 private으로 오브젝트 정보에 필요한 타이틀을 받을 문자열 변수를 선언한다.

    public Faculty(String name, String dept, int id, String title){ //이 클래스의 생성자로써 이름과 정보, 아이디와 타이틀을 받아와 오브젝트에 저장한다.
        super(name,dept,id); //이름과 정보,아이디는 상위클래스 생성자를 통해 초기화한다.
        this.title = title; //받아온 타이틀을 오브젝트이 타이틀로 저장한다.
    }

    public void reset(String newName, String newdept, int newid, String newtitle) { //해당 오브젝트의 정보를 리셋할 메소드이다.
        super.reset(newName, newdept, newid); //받아온 새로운 이름과 정보, 아이디를 super키워드로 상위 클래스 reset메소드를 통해 저장한다.
        this.title = newtitle; //받아온 타이틀을 오브젝트의 타이틀로 초기화한다.
    }

    public String getTitle(){ //해당 오브젝트의 타이틀을 문자열로 보내는 accessor메소드이다.
        return this.title; //해당 오브젝트의 타이틀을 문자열로 보낸다.
    }

    public void setTitle(String title){ //해당 오브젝트의 타이틀을 세팅하는 mutator메소드이다.
        this.title = title; //가져온 타이틀을 오브젝트의 타이틀로 초기화한다.
    }

    public void writeOutput() { //해당오브젝트의 정보를 예시결과 양식에 맞게 출력하는 메소드이다.
        super.writeOutput(); //상위 클래스의 메소드를 사용하여 title이전의 정보들을 출력한다.
        System.out.println("Title: "+this.title); //title정보를 출력한다.
    }
}
