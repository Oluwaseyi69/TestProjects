package New;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UndoStringBuilderTest {
    @Test
    public void testToUndoStringBuilder(){
        UndoStringBuilder stringBuilder = new UndoStringBuilder();
        stringBuilder.append("to be or not to be");
        assertEquals("to be or not to be", stringBuilder.toString());
        stringBuilder.replace(3, 5, "eat");
        assertEquals("to eat or not to be", stringBuilder.toString());
        stringBuilder.replace(17, 19, "eat");
        assertEquals("to eat or not to eat", stringBuilder.toString());
        stringBuilder.reverse();
        assertEquals("tae ot ton ro tae ot", stringBuilder.toString());
        stringBuilder.undo();
        assertEquals("to eat or not to eat", stringBuilder.toString());
    }

}