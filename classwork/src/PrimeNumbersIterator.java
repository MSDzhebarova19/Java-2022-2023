import java.util.Iterator;

public class PrimeNumbersIterator implements Iterator<Integer> {

    private int currentNumber = 2;
    private final int maxNumber;
    private final int[] primeNumbers;

    public PrimeNumbersIterator(int maxNumber) {
        this.maxNumber = maxNumber;
        this.primeNumbers = new int[maxNumber];
    }

    @Override
    public boolean hasNext() {
        while (currentNumber < maxNumber) {
            if (isPrime(currentNumber)) {
                return true;
            }
            currentNumber++;
        }
        return false;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more prime numbers.");
        }
        primeNumbers[currentNumber-2] = currentNumber;
        return currentNumber++;
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}