package HW1;

public class Main {

    public static void main(String[] args) {
        Team team = new Team("Paws and Tails",
                new Member("Cat", 80, 200),
                new Member("Dog", 150, 200),
                new Member("Rat", 30, 60),
                new Member("Swan", 60, 1000));

        team.teamInfo();

        Course course = new Course(new Running(70), new Jumping(150));

        System.out.println("Look who and what challenges passed:");
        course.doIt(team);
        System.out.println("---------------------------------------------------------");

        System.out.println("So, it's time for showing the results! \nAs a reminder, the course is considered passed when both challenges are passed.");
        team.showResults();
    }
}

