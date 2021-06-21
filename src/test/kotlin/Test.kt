import kotlin.test.*
import kotlin.test.Test

class Test {
    @Test
    fun testSomething() {
        val s = "String"
        assertIs<String>(s)

        val someList = listOf(1, 2, 3)

        assertContentEquals(
            listOf(1,2,3),
            someList,
            "Lists should have same elements"
        )

        val sum = 0.1 + 0.2
        assertEquals(
            0.3,
            sum,
            0.0001
        )
    }
}
