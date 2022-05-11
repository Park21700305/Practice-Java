//Rep#08 21700305 박지성
public class Undergraduate extends Student { //Student를 상속한 Undergraduate클래스이다.
        private int level; //클래스 외부에서 접근할 수 없도록 private으로 Undergraduate정보에 필요한 학년을 받을 정수형 변수를 선언한다.

        public Undergraduate(String name, int studentNumber, int level){ //이 클래스의 생성자로써 이름과 학번, 학년을 받아와 오브젝트에 저장한다.
            super(name,studentNumber); //super키워드를 사용하여 이름과 학번을 저장한다.
            this.level = level; //해당 오브젝트에 받아온 학년을 저장한다.
        }

        public void reset(String newName, int newStudentNumber, int newlevel){ //해당 오브젝트의 정보를 리셋할 메소드이다.
            super.reset(newName,newStudentNumber); //받아온 새로운 이름과 학번을 super키워드로 상위 클래스 reset메소드를 통해 저장한다.
            this.level = newlevel; //받아온 학년을 해당 오브젝트의 학년으로 저장한다.
        }

        public int getLevel(){ //학년을 보내는 accessor메소드이다.
            return this.level; //해당 오브젝트의 학년을 정수로 보낸다.
        }

        public void setLevel(int newLevel){ //해당 오브젝트의 학년을 세팅하는 mutator메소드이다.
            this.level = newLevel; //가져온 학년을 해당오브젝트의 학년으로 세팅한다.
        }

        public void writeOutput() { //해당오브젝트의 정보를 예시결과 양식에 맞게 출력하는 메소드이다.
            super.writeOutput(); //상위 클래스의 메소드를 사용하여 level이전의 정보들을 출력한다.
            System.out.println("Student Level : "+this.level); //해당 오브젝트의 학년을 출력한다.
        }
    }

