//Rep#08 21700305 박지성
public class PolymorphismDemo
{
    public static void main(String[] args)
    {
        Person[] people = new Person[7];
        people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
        people[1] = new Undergraduate("Kick, Anita", 9931, 2);
        people[2] = new Student("DeBanque, Robin", 8812);
        people[3] = new Undergraduate("Bugg, June", 9901, 4);
// The next two are the new entrants into the array
        people[4] = new Employee2("Ken,Bill", "Dept of Computer Science",
                3056);
        people[5] = new Faculty("Mock, Kenrick", "Computer Science",
                3056, "Professor of Computer Science");
        people[6] = new Staff("Jones, James", "Mathematical Sciences",
                1551, 15);
        for (Person p : people)
        {
            p.writeOutput();
            System.out.println();
        }
    }
}