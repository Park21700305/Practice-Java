//21700305 박지성 Report_03
import javax.swing.*;//창을 띄우기 위한 패키지

public class CheckDate2 {
    int dateProgram() { //입력한 값의 일을 월에 따라 판단하기 전 오류들과 mm/dd/yyyy의 형석을 지키지 않은 오류을 잡아 피드백을 띄우는 함수이다.
        int day, month;//입력값의 특정 부분을 정수형을 변환하여 올바른 값인지 판단하기 위해 넣어줄 정수형 변수이다.
        String input = JOptionPane.showInputDialog(null, "Enter a date in the format month/day/year.", "input", JOptionPane.QUESTION_MESSAGE);
        //함수 시작 시 JOptionPane.showInputDialog을 통해 입력창을 띄운 뒤 날짜를 입력받는다.
        if(input != null) {//입력창에서 어떠한 값이라도 입력을 했을 경우 다음의 오류들을 검사한다.
            if(input.length() != 10){//입력값의 길이가 10이 아닐경우, 즉 일차적으로 mm/dd/yyyy의 형식이 아닐경우 올바른 형식으로 입력하는 메시지와 함께 오류창을 띄운다.
                JOptionPane.showConfirmDialog(null, "Please follow this format => mm/dd/yyyy", "wrong input", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            }
            else{//입력값의 길이가 10일 경우 substring함수를 사용하여 올바른 위치에 '/'이 위치하였는지 검사한다.
                if(!input.substring(2, 3).equals("/") | !input.substring(5, 6).equals("/")){
                    //올바른 위치에 '/'가 없거나 다른 문자가 있을 경우 올바른 형식으로 입력하라는 메시지와 함께 오류창을 띄운 후 함수 종료를 위해 1을 반환한다.
                    JOptionPane.showConfirmDialog(null, "Please follow this format => mm/dd/yyyy", "wrong input", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                    return 1;
                }
                //위 조건에서 오류들이 걸러졌다면 일차적인 날짜의 범위를 확인한다.
                month = Integer.parseInt(input.substring(0, 2));//parseInt함수와 substring함수를 통해 월과 일의 문자를 추출한 후 비교를 위해 정수형으로 변환한다.
                day = Integer.parseInt(input.substring(3, 5));
                if (month < 1 || month > 12) {//월이 1~12범위의 밖일 경우 month and day have to be 01~12 & 01~31문구와 함께 오류창을 띄운다.
                    JOptionPane.showConfirmDialog(null, "month and day have to be 01~12 & 01~31", "wrong input", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                } else if (day < 1 || day > 31) {//일의 값이 1~31범위의 밖일 경우 month and day have to be 01~12 & 01~31문구와 함께 오류창을 띄운다.
                    JOptionPane.showConfirmDialog(null, "month and day have to be 01~12 & 01~31", "wrong input", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                } else if ((input.length() == 10) & (input.substring(2, 3).equals("/")) & (input.substring(5, 6).equals("/"))) {
                    dateProgram2(input); //길이가 10이고 위치해야할 '/'가 올바르게 위치하고 일,월의 범위도 올바를 경우 2차 조건을 검사하기 위해 입력값(문자열 input)을 dateProgram2에 전달한다.
                } else {//위에서 거르지 못한 오류가 있을 경우 Please follow this format => mm/dd/yyyy피드백과 함께 오류창을 띄운다.
                    JOptionPane.showConfirmDialog(null, "Please follow this format => mm/dd/yyyy", "wrong input", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else{//JOptionPane.showInputDialog에서 취소를 누르면 null값이 반환된다. 이 경우에는 위 과정을 거치지 않고 -1을 반환한다.
            return -1;
        }
        return 1;//JOptionPane.showInputDialog에서 취소를 누르지 않은 모든 경우, 즉 입력값이 null이 아닌 경우 1을 반환한다.
    }

    void dateProgram2(String date) {//레포트 03의 핵심 기능인 특정월의 일수와 윤년을 판단하여 피드백을 주는 함수이다.
        int month = Integer.parseInt(date.substring(0, 2)); //dateProgram과 동일하게 parseInt함수와 substring함수를 통해 월,일,년도의 값을 정수로 변환한다.
        int day = Integer.parseInt(date.substring(3, 5));
        int year = Integer.parseInt(date.substring(6, 10));

        if (((month == 4) || (month == 6) || (month == 9) || (month == 11)) && (day == 31)) {//4,6,9,11월임에도 31일을 입력한 경우
            // (**여기서 1~31의 범위를 벗어난 경우 이미 dateProgram함수에서 걸러졌기때문에 이 함수에서는 고려하지 않는다.**)
            JOptionPane.showConfirmDialog(null, month + "월은 30일까지 있습니다.", "wrong input", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        }//해당 달은 30일까지 있다는 메시지와함께 오류창을 띄운다.
        else if (month == 2) {//2월일경우 입력값의 년도가 윤년도인지 판단한다.
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {//4로 나누어지고 100으로 나누어지지 않거나 400으로 나누어지는경우 윤년에 해당된다.
                if (day > 29) {//29일을 포함하는 윤년이지만 29일을 초과하는 값을 입력한경우 윤년 2월은 29일까지 있습니다 피드백과 함께 오류창을 출력한다.
                    JOptionPane.showConfirmDialog(null, "윤년 2월은 29일까지 있습니다.", "wrong input", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                } else {// 이전 dateProgram함수에서 1~31이 아닌 값을 걸렀기 때문에 29일을 초과하지 않는다면 올바른 날짜이므로 올바른 날짜입니다 피드백을 띄운다.
                    JOptionPane.showConfirmDialog(null, date + " => 올바른 날짜입니다.", "Message", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (day > 28) {// 윤년도가 아님에도 2월에 28일을 초과한 경우 윤년이 아닌 2월은 28일까지 있습니다 피드백과 함께 오류창을 띄운다.
                JOptionPane.showConfirmDialog(null, "윤년이 아닌 2월은 28일까지 있습니다.", "wrong input", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            } else {// 그렇지 않은 경우 이전 dateProgram함수를 거쳐 1~28사이이기 때문에 올바른 날짜 피드백을 출력한다.
                JOptionPane.showConfirmDialog(null, date + " => 올바른 날짜입니다.", "Message", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        } else {// 위 조건에 해당이 안되는 경우는 이전 dateProgram함수에 의해 올바른 형식과 일수는 1~31사이 이고 월은 1,2,3,5,7,8,10,12이기 때문에 올바른 날짜 피드백을 출력한다.
            JOptionPane.showConfirmDialog(null, date + " => 올바른 날짜입니다.", "Message", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
    }



    public static void main(String[] args) {
        CheckDate2 checkDate = new CheckDate2();//dateProgram함수를 사용하기위해 CheckDate형 오브젝트를 생성한다.

        while (true) {//반복문 안에서 break를 만나지 않을 경우 무한반복한다.
            if (checkDate.dateProgram() == -1) {//dateProgram함수에서 -1을 반환한 경우(입력창에서 취소를 누른경우) 프로그램 종료여부를 묻는 창을 띄운다.)
                if (JOptionPane.showConfirmDialog(null, "프로그램을 종료하시겠습니까?", "종료", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
                    break;//종료창에서 만약 확인을 누를 경우 JOptionPane.OK_CANCEL_OPTION의 옵션으로 0이 반환되기 때문에 확인을 누를 경우 0이 반환되며 break를 만나 반복문을 빠져나와 프로그램을 종료한다.
                }
                else ; //종료창에서 확인을 누르지 않고 취소를 누를 경우 반복문을 빠져나오지 않는다.
            }
            else ; //dateProgram에서 -1이 아닌1을 반환한 경우 오류창에서 확인을 누르거나 올바른 값을 입력하여 확인을 누른것이므로 반복문을 그대로시행한다.
        }
    }
}

