
public interface DefaultMethodsInterface {

  default int method1() {
    return 1;
  }

  default <T> String methodGeneric(T t){
    return t.toString();
  }

  default void voidMethod(){
    System.out.println("noop");
  }
}
