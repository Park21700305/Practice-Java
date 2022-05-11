//Rep#08 21700305 박지성
public class Staff extends Employee2 { //Employee2를 상속한 Staff클래스이다.
    private int payGrade; //클래스 외부에서 접근할 수 없도록 private으로 오브젝트 정보에 필요한 급여정보를 받을 정수형 변수를 선언한다.

    public Staff(String name, String dept, int id, int payGrade){ //이 클래스의 생성자로써 이름과 정보, 아이디와 급여정보를 받아와 오브젝트에 저장한다.
        super(name,dept,id); //이름과 정보,아이디는 상위클래스 생성자를 통해 초기화한다.
        this.payGrade = payGrade; //받아온 급여정보를 오브젝트이 급여정보로 저장한다.
    }

    public void reset(String newName, String newdept, int newid, int newpay) { //해당 오브젝트의 정보를 리셋할 메소드이다.
        super.reset(newName, newdept, newid);  //받아온 새로운 이름과 정보, 아이디를 super키워드로 상위 클래스 reset메소드를 통해 저장한다.
        this.payGrade = newpay; //받아온 급여정보를 오브젝트의 급여정보로 초기화한다.
    }

    public int getPayGrade(){ //해당 오브젝트의 급여정보를 정수형으로 보내는 accessor메소드이다.
        return this.payGrade; //해당 오브젝트의 급여정보를 정수형으로 보낸다.
    }

    public void setPayGrade(int payGrade){ //해당 오브젝트의 급여정보를 세팅하는 mutator메소드이다.
        this.payGrade = payGrade; //가져온 급여정보를 오브젝트의 급여정보로 초기화한다.
    }

    public void writeOutput() { //해당오브젝트의 정보를 예시결과 양식에 맞게 출력하는 메소드이다.
        super.writeOutput(); //상위 클래스의 메소드를 사용하여 payGrade이전의 정보들을 출력한다.
        System.out.println("Pay Grade: "+this.payGrade); //payGrade정보를 출력한다.
    }
}
