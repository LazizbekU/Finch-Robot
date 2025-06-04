public class FinchTest {
    public static void main(String[] args) {
        Finch myFinch = new Finch();
        while(myFinch.getDistance()>20) {
        	myFinch.setMove("F", 10, 50);
        }
        myFinch.stop(5);
        int turn = (Math.random*180);
        if(turn>90) {
        	myFinch.setTurn("L", turn, 50);
        
        }else {
        	myFinch.setTurn("R", turn+90, 50);
        }
    }
}
