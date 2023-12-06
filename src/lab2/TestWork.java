package lab2;

public class TestWork {
    public static void main(String[] args) {
        Work2 testName = new Work2();
        int[] mass = new int[]{1, 2, 3, 4, 5};
        testName.Sum(mass);

        System.out.println("Аргументы: ");
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }

        testName.sumHarmonic();

        testName.sumRandom();

        testName.searchFactorial(5);
    }
}
