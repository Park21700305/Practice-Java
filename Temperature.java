//21700305 박지성 Report#06
import java.util.Scanner;//사용자에게로부터 온도를 입력받기위한 java.util 패키지.

public class Temperature { //Temperature 클래스 구성.
    private double degree; //온도값을 받기위한 더블형 변수이다. 소수점 한자리까지 반올림한 값을 받기 위해 double.
    private char scale; //섭씨온도와 화씨온도를 구분하기 위한 문자형 변수이다.
    public Temperature (double degree, char scale){ // 단위와 수치를 모두 받을 시 시행되는 생성자이다.
        this.degree = degree; //받은 단위와 수치를 해당 오브젝트의 수치와 단위에 넣는다.
        this.scale = scale;
    }
    public Temperature(double degree) //수치만 받았을 시 시행되는 생성자이다.
    {
        this.degree = degree; //받은 수치를 해당 오브젝트의 수치변수에 넣는다.
        this.scale = 'C'; //단위는 받지 않았으므로 기본값 C로 설정한다.
    }
    public Temperature(char scale) //단위만 받았을 시 시행되는 생성자이다.
    {
        this.degree = 0; //수치는 받지 않았으므로 기본값 0으로 설정한다.
        this.scale = scale; //받은 단위를 해당 오브젝트의 instance 변수에 넣는다.
    }
    public Temperature() //아무 값도 받지 않았을 시 시행되는 생성자이다.
    {
        this.degree = 0; //기본값 0으로 설정한다.
        this.scale = 'C'; //기본값 C로 성정한다.
    }
    public double getF(){ //섭씨온도를 화씨온도로 변환하여 반환하는 메소드이다.
        double f = (double)9/5*this.degree + 32; //해당 섭씨온도 수치를 화씨온도로 (C * 9.0 / 5.0 + 32.0) 변환한다.
        f = Math.round(f);//이후 round 메소드를 통해서 소수점 한자리까지 반올림한다.
        return f; //변환된 화씨온도의 수치를 반환한다.
    }
    public double getC(){ //화씨온도를 섭씨온도로 변환하여 반환하는 메소드이다.
        double c = (double) 5/9 * (this.degree-32); //해당 화씨온도 수치를 섭씨온도로 ((F - 32) / 1.8) 변환한다.
         c = Math.round(c);//이후 round 메소드를 통해서 소수점 한자리까지 반올림한다.
        return c; //섭씨온도로 변환된 수치를 반환한다.
    }
    public void set(double degree) {
        this.degree = degree;
    } //가져온 수치를 해당 수치를 담는 변수에 담는다.
    public void set(char scale) {
        this.scale = scale;
    } //가져온 단위를 해당 단위를 담는 변수에 담는다.
    public void set(double degree, char scale) //가져온 수치와 단위를 해당 수치와 단위를 담는 변수에 담는다.
    {
        this.degree = degree;
        this.scale = scale;
    }
    public void writeOutput(){ //해당 오브젝트의 수치와 단위를 출력하는 메소드이다.
        System.out.println("The number of degrees: " + this.degree); //오브젝트의 수치를 출력한다.
        System.out.println("The scale: " + this.scale); //오브젝트의 단위를 출력한다..
    }
    public void readInput(){ //사용자로부터 온도의 수치와 단위를 입력받는다.
        Scanner scanner = new Scanner(System.in);
        this.degree = scanner.nextDouble(); //소수점까지 받기 위해 double형 변수로 받는다.
        String s = scanner.next(); //혹시모를 하나이상의 값 입력오류를 방지하기위해 문자열로 단위를 받는다.
        this.scale = s.charAt(0); //이후 처음 위치한 문자를 char로 변환 후 scale에 담는다.
    }
    public void writeC(){ //해당 오브젝트의 온도를 섭씨온도로 출력하는 메소드이다.
        if(this.scale == 'C' || this.scale == 'c'){ //해당 오브젝트가 이미 섭씨온도 일때, 단위가 C이거나 c라면
            System.out.println(this.degree + " " + this.scale); //있는 그대로를 출력한다.
        }
        else{ //화씨라면
            System.out.println(this.getC() + " C"); //getC메소드를 통해 수치를 섭씨로 변환 후 출력한다.
        }
    }
    public void writeF(){ //해당 오브젝트의 온도를 화씨온도로 출력하는 메소드이다.
        if(this.scale == 'F' || this.scale == 'f'){ //해당 오브젝트가 이미 화씨온도 일때, 단위가 F이거나 f라면
            System.out.println(this.degree + " " + this.scale); //있는 그대로를 출력한다.
        }
        else{ //섭씨라면
            System.out.println(this.getF() + " F"); //getF메소드를 통해 수치를 섭씨로 변환 후 출력한다.
        }
        }


    public boolean isGreaterThan(Temperature a){ //해당 오브젝트의 온도가 비교하는 온도 a보다 큰지 확인하는 메소드이다.
        if((this.scale == 'C' && a.scale == 'F') || (this.scale == 'C' && a.scale == 'f') || (this.scale == 'c' && a.scale == 'F')
        || (this.scale == 'c' && a.scale == 'f')){ //만약 비교하는 두 온도의 단위가 다르다면
            if(this.scale == 'C' || this.scale == 'c'){ //그리고 해당 오브젝트의 온도단위가 섭씨라면
                if(this.degree-a.getC()>0) return true; //a의 화씨온도를 섭씨 수치로 변환 후 해당오브젝트의 수치와 비교한다.
                //해당 오브젝트가 크다면 true를 반환한다.
                else return false; //해당 오브젝트가 크지 않다면 false를 반환한다.
            }
            else{ //해당 오브젝트의 온도단위가 화씨라면 a의 온도는 섭씨이므로 a의 수치를 화씨로 변환 후 비교한다.
                if(Double.compare(this.degree,a.getF())>0) return true; //해당 오브젝트의 수치가 크다면 true를 반환한다.
                else return false;  //해당 오브젝트의 수치가 크지 않다면 false를 반환한다.
            }
        }
        else{ //해당 오브젝트와 a의 온도 단위가 같다면 바로 수치를 비교한다.
            if(Double.compare(this.degree,a.degree)>0) return true; //해당 오브젝트가 크다면 true를 반환한다.
            else return false; //해당 오브젝트의 수치가 크지 않다면 false를 반환한다.
        }
    }
    public boolean isLessThan(Temperature a){ //해당 오브젝트의 온도가 비교하는 온도 a보다 작은지 확인하는 메소드이다.
        if((this.scale == 'C' && a.scale == 'F') || (this.scale == 'C' && a.scale == 'f') || (this.scale == 'c' && a.scale == 'F')
                || (this.scale == 'c' && a.scale == 'f')){ //만약 비교하는 두 온도의 단위가 다르다면
            if(this.scale == 'C' || this.scale == 'c'){ //그리고 해당 오브젝트의 온도단위가 섭씨라면
                if(Double.compare(this.degree,a.getC())<0) return true; //a의 화씨온도를 섭씨 수치로 변환 후 해당오브젝트의 수치와 비교한다.
                    //해당 오브젝트가 작다면 true를 반환한다.
                else return false; //해당 오브젝트가 작지 않다면 false를 반환한다.
            }
            else{ //해당 오브젝트의 온도단위가 화씨라면 a의 온도는 섭씨이므로 a의 수치를 화씨로 변환 후 비교한다.
                if(Double.compare(this.degree,a.getF())<0) return true; //해당 오브젝트의 수치가 작다면 true를 반환한다.
                else return false; //해당 오브젝트의 수치가 작지 않다면 false를 반환한다.
            }
        }
        else{ //해당 오브젝트와 a의 온도 단위가 같다면 바로 수치를 비교한다.
            if(Double.compare(this.degree,a.degree)<0) return true; //해당 오브젝트의 수치가 작다면 true를 반환한다.
            else return false; //해당 오브젝트의 수치가 작지 않다면 false를 반환한다.
        }
    }
    public boolean equals(Temperature a){ //해당 오브젝트의 온도가 비교하는 온도 a와 수치가 같은지 확인하는 메소드이다.
        if(((this.scale == 'C') && (a.scale == 'F')) || (this.scale == 'C' && a.scale == 'f') || (this.scale == 'c' && a.scale == 'F')
                || (this.scale == 'c' && a.scale == 'f')){ //만약 비교하는 두 온도의 단위가 다르다면
            if(this.scale == 'C' || this.scale == 'c'){ //그리고 해당 오브젝트의 온도단위가 섭씨라면
                if(Double.compare(this.degree,a.getC())==0) return true; //a의 화씨온도를 섭씨 수치로 변환 후 해당오브젝트의 수치와 비교한다.
                //같으면 true, 다르다면 false를 반환한다.
                else return false;
            }
            else{ //해당 오브젝트의 온도단위가 화씨라면
                if(Double.compare(this.degree,a.getF())==0) return true; //a의 섭씨온도를 화씨 수치로 변환 후 해당오브젝트의 수치와 비교한다.
                //같다면 true, 다르다면 false를 반환한다.
                else return false;
            }
        }
        else{ //해당 오브젝트와 a의 온도단위가 같다면 바로비교한다.
            if(Double.compare(this.degree,a.degree)==0) return true; //같다면 true, 다르다면 false를 비교한다.
            else return false;
        }
    }

}
