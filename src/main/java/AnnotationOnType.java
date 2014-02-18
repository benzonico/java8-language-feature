import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AnnotationOnType<@Bar T extends @Foo HashMap & @Foo Serializable> extends java.util. @Foo HashMap implements @Foo Serializable, InterfaceTest {
  @SuppressWarnings("unchecked") private @Foo int @Foo [] @Foo[] tab;

  public static final AnnotationOnType[]@Foo[] tabs = new AnnotationOnType @Foo [12] @Qix @Foo [12];

  public int[] @Foo [] getTab(@Foo int toto) throws @Foo IllegalStateException{
    try {
      throw new IllegalAccessException();
    }catch (@Foo IllegalAccessException e){

    }
    if(toto>0) {
      throw new @Foo IllegalStateException("message");
    }
    return tab;
  }

  public static <@Bar @Foo @Qix S extends HashMap & Serializable> AnnotationOnType<@Foo S> createInstance(){
    Collection<@Foo ? extends S> collection;
    @Foo List<@Foo ?> list;
    return new @Foo AnnotationOnType<@Qix S>();
  }

  Map<@Foo String, @Foo T> nonNullString;

  @Override
  public String[][] test() {
    return new String[0][];
  }
}
