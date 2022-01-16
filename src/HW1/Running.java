package HW1;

public class Running extends Challenge {

        public Running(int difficulty) {
            super(difficulty);
        }

        @Override
        public void goChallenge(Member member) {
            member.run(super.getDifficulty());
        }

}

