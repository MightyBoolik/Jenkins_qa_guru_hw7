import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SimpleTest {
    @Test
    @Tag("positive")
    @DisplayName("Positive test")
    void simplePositiveTest() {
        step("Assert That true is true", () ->
                assertThat(true, is(true)));
    }


    @Test
    @Tag("negative")
    @DisplayName("Negative test")
    void simpleNegativeTest() {
        step("Assert That true is true", () ->
                assertThat(true, is(false)));

    }
}