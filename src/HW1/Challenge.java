package HW1;

public abstract class Challenge {
        private int difficulty;

        public Challenge(int difficulty) {
            this.difficulty = difficulty;
        }

        public int getDifficulty() {
            return difficulty;
        }

        public void goChallenge (Member member){}
}
