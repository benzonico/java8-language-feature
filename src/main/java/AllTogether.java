import com.sun.swing.internal.plaf.metal.resources.metal_zh_HK;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AllTogether {


  private int meth(int a){
    return a-1;
  }

  private void print(){
    IntStream.range(1, 5).map(this::meth).forEach(System.out::println);
  }
  public static void main(String[] args) {

    //static method reference
    IntStream.range(1, 12).forEach(MethodReferences::printer);
    IntStream.range(1,12).map(new MethodReferences()::square).forEach(System.out::println);
    System.out.println(new MethodReferences<Math>().sumAbs(-2, 3));
    Stream<String> list = Arrays.asList("foo", "barqix").stream();

    MethodReferences.Utilities ut2 = new MethodReferences.Utilities(10);
    MethodReferences.Utilities ut1 = new MethodReferences. @Foo Utilities(100);

    IntStream.range(1, 5).map((true ?  new MethodReferences. @Foo Utilities(100): ut2)::multiply).forEach(System.out::println);



  }
}
