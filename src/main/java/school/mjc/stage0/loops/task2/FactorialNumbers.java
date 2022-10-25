package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 1, result = 1;
        System.out.println(result);
        while (counter <= printToInclusive){
            result *= counter;
            System.out.println(result);
            counter++;
        }

    }
}
