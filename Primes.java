public class Primes {
    public static void main(String[] args) {
        int largestNum = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[largestNum];
        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }
        int p = 2;
        int i = 3;
        while (p < arr.length) {
            while (i < arr.length) {
                if (i % p == 0) {
                    arr[i] = false;
                }
                i++;
            } 
            p++;
            i = p+1;
        }

        System.out.println("Prime numbers up to " +largestNum+":");
        int count_prime = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]) {
                System.out.println(j);
                count_prime++;
            }
        }

        int percentage = (int)(((double) count_prime / (double) largestNum) * 100);
        System.out.println("There are "+ count_prime +" primes between 2 and "+ largestNum +" ("+ percentage +"% are primes)");
    }
}