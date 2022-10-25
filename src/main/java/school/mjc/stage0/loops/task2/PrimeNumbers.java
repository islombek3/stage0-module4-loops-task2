package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        while (counter <= printToInclusive){
            if (ifPrime(counter) == true){
                System.out.println(counter);
            }
            counter++;
        }
    }

    public boolean ifPrime(int counter){
        if (counter != 2 && counter % 2 == 0|| counter != 3 && counter % 3 == 0 || 
        counter != 5 && counter % 5 == 0 || counter != 7 && counter % 7 == 0){
            return false;
        } else {
            return true;
        }
    }
}
