package HW1;

public class Member {
    private String name;
    private int maxRun;
    private int maxJump;
    private int passedChallenges = 0;
    private Status status;

    public Member(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Status getStatus() {
        if (passedChallenges == 2) {
            status = Status.Passed;
        } else {
            status = Status.Failed;
        }
        return status;
    }

    public String getMemberName() {
        return name;
    }

    public void run(int distance) {
        if (maxRun >= distance) {
            passedChallenges++;
            System.out.println(getMemberName() + " finished the race");
        }
    }

    public void jump(int height) {
        if (maxJump >= height) {
            passedChallenges++;
            System.out.println(getMemberName() + " passed the jumps");
        }
    }

}
