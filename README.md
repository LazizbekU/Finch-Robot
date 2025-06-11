# Finch-Robot

### Development Checklist

| Completed | Task         | Description |
|:---------:| :-----------:|:------------|
|    ✅     | Familiarize  | Learn how to: <ul><li>Connect to the robot</li><li>Interpret what built-in sensors detect</li><li>Program basics in SNAP!</li><li>Setup local developing environment to code in Java</li></ul>|
|    ✅     | 3D Design    |             |
|    ❌     | Develop Code |             |

---

<details>
<summary><strong>Inspiration for the Project</strong></summary>

I wanted to serve people **Oreos** as a prize for participating!
</details>

---

### Design Cycle
<img src="design_cycle.png" alt="design cycle" width="300" height="300">

###### Include commentary on your experience with the design cycle during this project

---

### Code to Highlight
public class FinchTest {
    public static void main(String[] args) {
        for(int i = 0; i<30; i++){
            Finch myFinch = new Finch();
            while(myFinch.getDistance()>20) {
        	    myFinch.setMove("F", 10, 50);
            }
            myFinch.stop(30);
            int turn = Math.random()*180;
            if(turn>90) {
        	    myFinch.setTurn("L", turn, 50);
        
            }else {
        	    myFinch.setTurn("R", turn+90, 50);
            }
        }
        myFinch.stop();
        myFinch.quit();
    }
}

---

### Choose At Least Three of the Following to Include:
- What was your motivation?
- Why did you build this project? (Note: the answer is not "Because it was a homework assignment.")
- What problem does it solve?
- What did you learn?
- What makes your project stand out?
