import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 声明测试类或测试方法的自定义显示名称。这个注解不被继承
 */
@DisplayName("测试类")
class DisplayNameDemo {

    @Test
    @DisplayName("测试方法一")
    void testWithDisplayNameContainingSpaces() {

    }

    @Test
    @DisplayName("测试方法二")
    void testWithDisplayNameContainingSpecialCharacters() {

    }

    @Test
    @DisplayName("测试方法三")
    void testWithDisplayNameContainingEmoji() {

    }
}

