
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * junit 标准类
 */
public class StandardTests {

    /**
     * 表示被注解的方法应该在当前类的所有@Test，@RepeatedTest，@ParameterizedTest和 @TestFactory方法之前执行;
     * 类似于JUnit	4的@BeforeClass。	这样的方法可以继承（除非被 隐藏或覆盖），并且必须是静态的（除非使用“per-class”测试实例生命周期）。
     */
    @BeforeAll
    static void initAll() {
        System.out.println("BeforAll==测试之前");
    }

    /**
     * 表示被注解的方法应在当前类的每个@Test，@RepeatedTest，@ParameterizedTest 或@TestFactory方法之前执行;
     * 类似于JUnit	4的@Before。	除非被覆盖，否则这些方法可以继承。
     */
    @BeforeEach
    void init() {
        System.out.println("BeforEach==测试之前");
    }

    /**
     * 表示方法是测试方法。与JUnit4的@Test注解不同的是，这个注解没有声明任何属性，因为JUnit Jupiter中的测试扩展是基于他们自己的专用注解来操作的。除非被覆盖，否则这些方法可以继承。
     */
    @Test
    void succeedingTest() {
        System.out.println("Test==测试内容");
    }

    @Test
    void failingTest() {
        fail("a	failing	test");
    }

    @Test
    /** 用于禁用测试类或测试方法;	类似于JUnit4的@Ignore。这个注解不能继*/
    @Disabled("for	demonstration	purposes")
    void skippedTest() {
        //	not	executed
    }

    /**
     * 表示被注解的方法应在当前类的每个@Test，@RepeatedTest，@ParameterizedTest 或@TestFactory方法之后执行;
     * 类似于JUnit	4的@After。	除非被覆盖，否则这些方法可以继 承。
     */
    @AfterEach
    void tearDown() {
        System.out.println("测试之后处理");
    }

    /**
     * 表示被注解的方法应该在当前类的所有@Test，@RepeatedTest，@ParameterizedTest和 @TestFactory方法之后执行;
     * 类似于JUnit	4的@AfterClass。	这样的方法可以继承（除非被隐 藏或覆盖），并且必须是静态的（除非使用“per-class”测试实例生命周期）。
     */
    @AfterAll
    static void tearDownAll() {
        System.out.println("测试之后处理");
    }
}
