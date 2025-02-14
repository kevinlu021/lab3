import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {1, 2, 3, 4};
    int[] input2 = {1, 2, 3};
    assertArrayEquals(new int[]{4,3,2,1}, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testReversedInPlace() {
    int[] input1 = {1, 2, 3, 4};
    int[] input1reversed = {4,3,2,1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(input1reversed, input1);
  }
}
