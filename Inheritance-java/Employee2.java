//Rep#08 21700305 박지성
public class Employee2 extends Person{ //이전에 생성한 Person클래스를 상속받는 Employee2클래스이다.
    private String dept; //클래스 외부에서 접근할 수 없도록 private으로 Employee정보에 필요한 정보를 받을 문자열 변수를 선언한다.
    private int id; //클래스 외부에서 접근할 수 없도록 private으로 Employee정보에 필요한 아이디를 받을 정수  변수를 선언한다.

    public Employee2(String name, String dept, int id){ //메인에서 사용되는 Employee2클래스의 생성자이다.
        super(name); //Person을 상속하였으므로 super키워드에 받아온 이름을 넘겨 Employee2이름으로 구성한다.
        this.dept = dept; //받아온 정보를 해당오브젝트의 정보로 저장한다.
        this.id = id; //받아온 아이디를 해당오브젝트의 아이디로 저장한다.
    }

    public void reset(String newName, String newdept, int newid){ //해당 오브젝트의 정보를 다시 세팅할 수 있는 메소드이다.
        super.setName(newName); //Person에서 정의한 함수를 사용하여 이름변수를 수정한다.
        this.dept = newdept; //받아온 정보를 해당오브젝트의 정보로 저장한다.
        this.id = newid; //받아온 아이디를 해당오브젝트의 아이디로 저장한다.
    }

    public String getEmployDept(){ //해당 오브젝트의 정보를 문자열로 전달한다.
        return this.dept;
    }

    public int getEmployId(){ //해당 오브젝트의 아이디를 정수로 전달한다.
        return this.id;
    }

    public void setEmployDept(String newDept){ //해당 오브젝트의 정보를 문자열로 전달한다.
        this.dept = newDept;
    }

    public void setEmployId(int newId){ //해당 오브젝트의 아이디를 정수로 전달한다.
        this.id = newId;
    }

    public void writeOutput() { //해당 오브젝트의 모든 정보를 예시결과의 양식에 맞게 출력한다.
        super.writeOutput(); //오브젝트의 이름은 super키워드로 상위 클래스에서 가져온다.
        System.out.println("Dept: "+this.dept); //해당 오브젝트의 정보와 아이디를 출력한다.
        System.out.println("Employee ID: "+this.id);
        //이때 get메소드를 사용할 수도 있다.
    }
}
