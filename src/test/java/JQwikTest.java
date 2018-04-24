import net.jqwik.api.Example;
import net.jqwik.api.Label;

class JQwikTest {
    @Example
    @Label("Hello from Jqwik!")
    boolean helloFromJqwik() {
        return false;
    }
}
