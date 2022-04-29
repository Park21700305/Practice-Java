//CH05_실습_21700305_박지성

public class CH05_MyPassFail {
    private String name;
    private int score;
    public void writeoutput() {
        String grade;
        if (score > 50)
            grade = "pass";
        else
            grade = "fail";
        System.out.println(name + ": " + score + ": " + grade);
    }
    public int getScore() {return score;}
    public String getName() {return name;}
    public void setdata(String s_name, int s_score){
        name = s_name;
        score = s_score;
    }
    public Boolean equals(CH05_MyPassFail in_object) {
        if(this.name.equals(in_object.name) & (this.score == in_object.score))
            return true;
        else
            return false;
    }
    public void copyFrom(CH05_MyPassFail in_object) {
        this.name = in_object.name;
        this.score = in_object.score;
    }
    public static void identifyOrSameValue(CH05_MyPassFail student1, CH05_MyPassFail student2){
        if(student1 == student2){
            System.out.println("Student1 and Student2 are Same object, Same hashcode");
            System.out.println("Student1 and Student2 have same state, Same value of instance variables");
        }
        else if((student1.toString() != student2.toString()) & (student1.equals(student2))){
            System.out.println("Student1 and Student2 have different value of instance variables");
            System.out.println("Student1 and Student2 have same state, Same value of instance variables");
        }
        else{
            System.out.println("Student1 and Student2 are different object, different Hashcode");
            System.out.println("Student1 and Student2 have different value of instance variables");
        }
    }
}
