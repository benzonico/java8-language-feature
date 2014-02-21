import java.awt.*;
import java.util.concurrent.Callable;
import java.util.stream.IntStream;

public class LambdaExpressions {

  public static void main(String[] args) {

    boolean flag = true;
    Callable<Integer> c = flag ? () -> 23 : () -> 42;
    IntStream.range(1, 5).map(x->x*x).forEach(System.out::println);
    IntStream.range(1, 5).map((x)-> { return x*x-1; } ).forEach(System.out::println);

    IntStream.range(1,5).mapToObj(x-> new PairSquare(x,x*x)).forEach(System.out::println);

    IntStream.range(1,5).mapToObj((@Foo int a)-> new PairSquare(a,a*a)).forEach(System.out::println);
    IntStream.range(1,5).mapToObj((int a)-> {return a-a;}).forEach(System.out::println);

  }

  static class PairSquare {
    int value;
    int square;
    PairSquare(int value, int square) {
      this.square = square;
      this.value = value;
    }

    @Override
    public String toString() {
      return value+":"+square;
    }
  }
}
