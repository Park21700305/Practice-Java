//CH05_실습_21700305_박지성

public class CH05_MyPassFail_main {
    public static void main(String[] args)
    {
        System.out.println("Before copying\n");
        String name = "Hongkildong";
        CH05_MyPassFail student1 = new CH05_MyPassFail();
        CH05_MyPassFail student2 = new CH05_MyPassFail();
        student1.setdata(name, 80);
        student2.setdata("KimChulSoo", 40);
        CH05_MyPassFail.identifyOrSameValue(student1, student2);
        student1.writeoutput();
        student2.writeoutput();
        System.out.println("Hashcode of student1: " + student1.toString());System.out.println("Hashcode of student2: " + student2.toString());
        student1.copyFrom(student2);
        System.out.println("\n\nAfter copying\n");
        CH05_MyPassFail.identifyOrSameValue(student1, student2);
        student1.writeoutput();
        student2.writeoutput();
        System.out.println("Hashcode of student1: " + student1.toString());System.out.println("Hashcode of student2 " + student2.toString());System.out.println("\n\nAfter assigning the variable\n");
        student1.setdata("HongKilDong", 80);
        student2.setdata("KimChulSoo", 40);
        student1 = student2;
        CH05_MyPassFail.identifyOrSameValue(student1, student2);
        student1.writeoutput();
        student2.writeoutput();
        System.out.println("Hashcode of student1: " + student1.toString());System.out.println("Hashcode of student2 " + student2.toString());}
}