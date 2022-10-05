package aux;

import de.mirkosertic.bytecoder.api.Export;
import software.amazon.event.ruler.Ruler;

@SuppressWarnings({"HideUtilityClassConstructor"})
public class WebAssemblyMainClass {
  public static void main(String[] args) {
    // no-op, needed by ByteCoder so it can find the main method
  }

  @Export("matchesRule")
  public static boolean matchesRule(String event, String rule) throws Exception {
    return Ruler.matchesRule(event, rule);
  }
}
