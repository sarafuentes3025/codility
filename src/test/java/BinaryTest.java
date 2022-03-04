import lesson1.BinaryGap;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryTest {

  @Test
  public void solution_test() {
    assertThat(BinaryGap.solution(1041)).isEqualTo(5);
  }

  @Test
  public void solution_test2() {
    assertThat(BinaryGap.solution(32)).isEqualTo(0);
  }

  @Test
  public void solution_test3() {
    assertThat(BinaryGap.solution(15)).isEqualTo(0);
  }

  @Test
  public void solution_test4() {
    assertThat(BinaryGap.solution(9)).isEqualTo(2);
  }
}
