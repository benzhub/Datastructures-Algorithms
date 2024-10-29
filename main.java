public class Main {
  public static void log(int[] numbers) {
    if (numbers != null && numbers.length > 0) {
      // O(1)
      System.out.println(numbers[0]);
    } else {
      System.out.println("The Array is empty or null");
    }

  }

  public static void loopArray(int[] numbers, String[] names) {
    // O(n)
    for (int index = 0; index < numbers.length; index++) {
      System.out.println(numbers[index]);
    }
    for (int index = 0; index < names.length; index++) {
      System.out.println(names[index]);
    }
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    String[] arr2 = { "Tom", "Jerry", "Mickey" };
    log(arr);
    // loopArray(arr, arr2);
  }
}