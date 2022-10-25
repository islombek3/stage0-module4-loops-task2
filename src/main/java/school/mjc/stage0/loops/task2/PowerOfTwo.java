package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter = 0, i = 2;
        if (power >= 0){
            while (counter <= power){
                int result = i ^ counter;
                System.out.println(result); 
            }
        } else {
            System.out.println("too much power");
        }
    }
}
