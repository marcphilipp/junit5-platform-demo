import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.jupiter.api.Assertions.fail

class SpekTest : Spek({
    describe("Spek") {
        it("can say hello loudly") {
            fail("Hello from Spek!");
        }
    }
})
