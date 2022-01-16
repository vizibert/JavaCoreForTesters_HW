package HW1;

public class Course {
    private Challenge[] challenges;

    public Course (Challenge... challenges) {
        this.challenges = challenges;
    }

    public void doIt(Team team) {
        for (Member member: team.getMembers()) {
            for (Challenge challenge :challenges) {
                challenge.goChallenge(member);
                }
            }
        }
    }

