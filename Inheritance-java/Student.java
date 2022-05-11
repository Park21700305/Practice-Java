//Rep#08 21700305 박지성
public class Student extends Person { //이전에 생성한 Person클래스를 상속받는 Student클래스이다.
    private int studentNumber; //클래스 외부에서 접근할 수 없도록 private으로 Student정보에 필요한 학번을 받을 정수형 변수를 선언한다.

    public Student(String name, int studentNumber){ //메인에서 사용되는 Student클래스의 생성자이다.
        super(name); //Person을 상속하였으므로 super키워드에 받아온 이름을 넘겨 Student의 이름으로 구성한다.
        this.studentNumber = studentNumber; //받아온 이름을 해당오브젝트의 학번으로 저장한다.
    }

    public void reset(String newName, int newStudentNumber){ //이름과 학번을 다시 세팅할 수 있는 메소드이다.
        super.setName(newName); //Person에서 정의한 함수를 사용하여 이름변수를 수정한다.
        this.studentNumber = newStudentNumber; //새로 받아온 이름을 해당오브젝트의 학번으로 수정한다.
    }

    public int getStudentNumber(){ //해당 오브젝트의 학번을 정수로 전달한다.
        return this.studentNumber;
    }

    public void setStudentNumber(int newStudentNumber){ //새로 받아온 학번을 해당 오브젝트의 학번으로 저장한다.
        this.studentNumber = newStudentNumber;
    }

    public void writeOutput() { //해당 오브젝트의 모든 정보를 예시결과의 양식에 맞게 출력한다.
        super.writeOutput(); //오브젝트의 이름은 super키워드로 상위 클래스에서 가져온다.
        System.out.println("Student Number: "+this.studentNumber); //해당 오브젝트의 학번을 출력한다.
        //이때 get메소드를 사용할 수도 있다.
    }
}
