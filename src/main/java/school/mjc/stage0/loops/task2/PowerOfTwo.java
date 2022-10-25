package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter = 0, i = 2;
        if (power >= 0){
            while (counter <= power){
                double result = Math.pow(i, counter);
                System.out.println(Math.round(result)); 
                counter++;
            }
        } else {
            System.out.println("too much power");
        }
    }
}
