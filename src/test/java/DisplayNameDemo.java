import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 声明测试类或测试方法的自定义显示名称。这个注解不被继承
 */
@DisplayName("A	special	test	case")
class DisplayNameDemo {

    @Test
    @DisplayName("Custom	test	name	containing	spaces")
    void testWithDisplayNameContainingSpaces() {

    }

    @Test
    @DisplayName("╯°□°）╯")
    void testWithDisplayNameContainingSpecialCharacters() {

    }

    @Test
    @DisplayName("?")
    void testWithDisplayNameContainingEmoji() {

    }
}

