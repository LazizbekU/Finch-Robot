public class FinchTest {
    public static void main(String[] args) {
        Finch myFinch = new Finch(); // Only create once!

        for (int i = 0; i < 30; i++) {
            while (myFinch.getDistance() > 20) {
                myFinch.setMove("F", 10, 50);
            }

            myFinch.stop();
            myFinch.sleep(30000); // Wait 30 seconds

            int turn = (int)(Math.random() * 180); // 0–179
            if (turn > 90) {
                myFinch.setTurn("L", turn, 50);
            } else {
                myFinch.setTurn("R", turn + 90, 50);
            }
        }

        myFinch.stop();
        myFinch.quit();
    }
}
