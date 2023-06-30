class PrimeCalculator {
    int nth(int nth) {
        if (nth <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer.");
        }

        int count = 0;
        int number = 2;

        while (count < nth) {
            if (isPrime(number)) {
                count++;
            }
            number++;
        }

        return number - 1;
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

