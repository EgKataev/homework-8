public class Arrays_2 {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println("Задание 1");
        int sum = 0;
        int[] arr = generateRandomArray();
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        System.out.println("Задание 2");
        int[] arr1 = generateRandomArray();
        int min = arr1[0];
        int max = arr1[0];
        for (int element : arr1) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");


        System.out.println("Задание 3");
        int[] arr2 = generateRandomArray();
        for (int i : arr2) {
            sum += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / (float) arr2.length + " рублей");


        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}