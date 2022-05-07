//21700305 박지성 Rep_Chap05
//해당 점수의 비율대로 그래프에 '*'을 출력하는 클래스이다.
public class Rep_Chap05 {
    //점수를 담기 위한 정수형 클래스 변수 A,B,C,D,F를 선언한다. 이때 외부에서는 클래스 메소드로만 접근할 수 있게 private 선언한다.
    private int A,B,C,D,F;
    //정수형 클래스 변수 A,B,C,D,F에 점수를 세팅할 클래스 메소드이다. 순서대로 정수형 클래스 변수 A,B,C,D,F에 정수값을 assign한다.
    public void setNum(int numA,int numB,int numC,int numD,int numF){
        this.A = numA;
        this.B = numB;
        this.C = numC;
        this.D = numD;
        this.F = numF;
    }
    //총합대비 비율을 계산하기 위해 정수형 클래스 변수 A,B,C,D,F에 입력된 값을 모두 더하여 반환하는 클래스 메소드이다.
    public int total(){
        return (this.A + this.B + this.C + this.D + this.F);
    }
    //점수의 총합을 기준으로 정수형 클래스 변수 A,B,C,D,F의 백분율을 계산하는 반환형 double의 메소드이다.
    //이때 하나의 클래스 변수의 백분율 값이 하나의 반환값이 되어야하기 때문에 총 다섯개의 동일한 메소드로 구성한다.
    public double percentA(){
        return (this.A*100/this.total());
    }
    public double percentB(){
        return (this.B*100/this.total());
    }
    public double percentC(){
        return (this.C*100/this.total());
    }
    public double percentD() { return (this.D*100/this.total()); }
    public double percentF(){
        return (this.F*100/this.total());
    }
    //위에서 아래로 A,B,C,D,F의 백분율에 해당하는 값 절반의 개수로 '*'을 출력하는 메소드이다.
    //해당하는 변수의 백분율/2를 한 후 반올림한 개수(i)만큼 별의 출력을 반복한다. 이후 밑라인에 해당 변수 명을 출력한다.
    //이때 반올림의 값만큼 반복하기 위해 Math.round함수를 사용한다.
    public void printGraph(){
        for(int i=0; i<Math.round(this.percentA()/2); i++)
            System.out.print("*");
        System.out.println(" A");
        for(int i=0; i<Math.round(this.percentB()/2); i++)
            System.out.print("*");
        System.out.println(" B");
        for(int i=0; i<Math.round(this.percentC()/2); i++)
            System.out.print("*");
        System.out.println(" C");
        for(int i=0; i<Math.round(this.percentD()/2); i++)
            System.out.print("*");
        System.out.println(" D");
        for(int i=0; i<Math.round(this.percentF()/2); i++)
            System.out.print("*");
        System.out.println(" F");
    }
    //그래프의 라인을 출력하는 메소드이다.
    //10단위로 0부터 100까지 일정한 간격으로 ‘|’와 ‘*’이 출력되도록 하기위해 System.out.println함수 3개로 직접 출력한다.
    // 예시와 같이 숫자와 다음 숫자사이에 ‘*’이 정확히 6개가 위치하여 ‘*’하나에 2%의 의미를 갖도록한다.
    public void printLine() {
        System.out.println("0    10    20    30    40    50    60    70    80    90    100%");
        System.out.println("|    |     |     |     |     |     |     |     |     |     |");
        System.out.println("************************************************************");
    }
    //클래스 오브젝트 tmp를 생성한 후 예시처럼 A,B,C,D,F에 순서대로 1,4,6,2,1의 값을 세팅한다.
    //이후 그래프의 라인을 출력하고 밑 라인에 해당 값의 백분율/2(반올림)의 갯수만큼 별을 출력한다.
    public static void main(String[] args) {
        Rep_Chap05 tmp = new Rep_Chap05();
        tmp.setNum(1,4,6,2,1);
        tmp.printLine();
        tmp.printGraph();
    }
}



