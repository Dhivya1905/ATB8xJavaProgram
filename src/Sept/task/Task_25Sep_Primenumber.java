package Sept.task;

public class Task_25Sep_Primenumber {
    public static void main(String[] args)
    {
        //Prime Number 1 to 100

        for(int num=2;num<=100;num++) {
            boolean isprime = true;

            for (int i = 2; i<=Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
                if (isprime) {
                    System.out.println(num);

            }


        }
    }
}
