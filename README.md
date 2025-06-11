# Finch-Robot

### Development Checklist

| Completed | Task         | Description |
|:---------:| :-----------:|:------------|
|    ✅     | Familiarize  | Learn how to: <ul><li>Connect to the robot</li><li>Interpret what built-in sensors detect</li><li>Program basics in SNAP!</li><li>Setup local developing environment to code in Java</li></ul>|
|    ✅     | 3D Design    |             |
|    ✅     | Develop Code |             |

---

<details>
<summary><strong>Inspiration for the Project</strong></summary>

I wanted people to test their **luck**.
</details>

---

### Design Cycle
<img src="Design-thinking-diagram.webp" alt="design cycle" width="300" height="300">

###### Include commentary on your experience with the design cycle during this project

---

### Code to Highlight
```java
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
```

---


- My motivation was to make people try out their luck by seeing how many points they earn. The further away from the center the ball lands the more points they get because it get more and more rare for the ball to go     further out of the center.
- I built this porject to give people a rush of dopamine when they score big making others want to test their luck too.
- My project stands out because my project is only based on luck.
