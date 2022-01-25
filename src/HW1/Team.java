package HW1;

public class Team {
    private String name;
    private Member[] members;

    public Team(String name, Member... members ) {
        this.name = name;
        this.members = members;
    }

    public String getTeamName () {
       return name;
    }

    public Member[] getMembers() {
        return members;
    }

    public void teamInfo() {
        System.out.println("Wow! We have a new team: " + "\"" + getTeamName() + "\"");
        System.out.println("Applause for the teammates:");
        for (Member member : members) {
            System.out.print(member.getMemberName() + " ");
        }
        System.out.println("\n---------------------------------------------------------");
    }

    public void showResults () {
        for (Member member : members) {
            if (member.getStatus() == Status.Passed) {
                System.out.println(member.getMemberName() + " passed the course");
            } else
                System.out.println(member.getMemberName() + " failed the course");

        }
    }
}



