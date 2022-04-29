//21700305_박지성 Report_02
import javax.swing.*;

public class CheckDate {
    int dateProgram() {
        int day, month;
        String tmp;
        String input = JOptionPane.showInputDialog(null, "Enter a date in the format month/day/year.\n" +
                "I will output the date in the format day.month.year", "input", JOptionPane.QUESTION_MESSAGE);
        if(input != null) {
            if(input.length() != 10){
                JOptionPane.showConfirmDialog(null, "Please follow this format => mm/dd/yyyy", "wrong input", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            }
            else{
                if(!input.substring(2, 3).equals("/") | !input.substring(5, 6).equals("/")){
                    JOptionPane.showConfirmDialog(null, "Please follow this format => mm/dd/yyyy", "wrong input", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                    return 1;
                }
                month = Integer.parseInt(input.substring(0, 2));
                day = Integer.parseInt(input.substring(3, 5));
                if (month < 1 || month > 12) {
                    JOptionPane.showConfirmDialog(null, "month and day have to be 01~12 & 01~31", "wrong input", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                } else if (day < 1 || day > 31) {
                    JOptionPane.showConfirmDialog(null, "month and day have to be 01~12 & 01~31", "wrong input", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                } else if ((input.length() == 10) & (input.substring(2, 3).equals("/")) & (input.substring(5, 6).equals("/"))) {
                    tmp = (input.substring(3, 5) + "." + input.substring(0, 2) + "." + input.substring(6, 10));
                    JOptionPane.showConfirmDialog(null, input + " converts to: " + tmp, "Message", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showConfirmDialog(null, "Please follow this format => mm/dd/yyyy", "wrong input", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else{
            return -1;
        }
        return 1;
    }

    public static void main(String[] args) {
        CheckDate checkDate = new CheckDate();

        while (true) {
            if (checkDate.dateProgram() == -1) {
                if (JOptionPane.showConfirmDialog(null, "프로그램을 종료하시겠습니까?", "종료", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
                    break;
                }
                else ;
            }
            else ;
        }
    }
}

