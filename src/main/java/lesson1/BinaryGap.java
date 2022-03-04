package lesson1;

public class BinaryGap {
  public static int solution(int N) {
    String binary = Integer.toBinaryString(N);
    int length = 0;
    int ones = 0;

    for (int i = binary.length() - 1, count = 0; i >= 0; i--) {

      char byOneBy = binary.charAt(i);

      if (byOneBy == '1') {
        count = 0;
        ones++;
      }

      if (byOneBy == '0' && ones > 0)
        count += 1;

      if (count > length)
        length = count;
    }

    return ones > 1 ? length : 0;
  }
}
