public class primeNumber {
    public static void main(String[] args) {
        int num = 2, count;
        while (num < 100) {
            count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(num);
            }
            num++;
        }
    }
}
