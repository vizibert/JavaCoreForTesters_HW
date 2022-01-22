package HW1;

public class Jumping extends Challenge {
    public Jumping(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(Member member) {
        member.jump(super.getDifficulty());
    }

}