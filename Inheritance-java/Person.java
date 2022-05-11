//Rep#08 21700305 박지성
public class Person { //다섯개의 클래스의 차상위 클래스가 되는 Person 클래스.
    private String name; //클래스 내에서 접근과 수정이 가능하도록 private 선언을 하여 이름을 담을 String 변수를 선언한다.

    public Person(String name){ //메인에서 사용되는 Person의 생성자이다.
        this.name = name; //메인에서 받아온 이름을 해당 오브젝트의 이름으로 구성한다.
    }
    public void setName(String name) { //해당 오브젝트의 이름을 세팅하는 mutator메소드이다.
        this.name = name; //세팅할 이름을 해당 오브젝트의 이름에 넣는다.
    }

    public String getName() { //해당 오브젝트의 이름을 가져오는 accessor메소드이다.
        return name; //해당 오브젝트의 이름을 String으로 전달한다.
    }
    public void writeOutput(){ //해당 오브젝트의 정보를 출력하는 메소드이다.
        System.out.println("Name: "+this.getName()); //예시결과에 맞게 해당 오브젝트의 이름을 가져와 출력한다.
        // 이때 getName메소드를 사용할 수도 있다.
    }
}
