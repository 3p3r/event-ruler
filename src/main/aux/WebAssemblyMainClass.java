package aux;

import software.amazon.event.ruler.Patterns;
import software.amazon.event.ruler.ValuePatterns;

@SuppressWarnings({"HideUtilityClassConstructor"})
public class WebAssemblyMainClass {
  public static void main(String[] args) {
    ValuePatterns cut = Patterns.exactMatch("foo");
    System.out.println(cut.pattern());
    System.out.println("Hello World!");
  }
}
