package ood.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

@Disabled("Тесты отключены. Удалить аннотацию после реализации генератора")
class MyGeneratorTest {
    private final Generator generator = new MyGenerator();

    @Test
    public void whenAllKeysMatchThenProduceString() {
        String template = "I am a ${name}, Who are ${subject}?";
        Map<String, String> args = new HashMap<>();
        args.put("name", "Max");
        args.put("subject", "you");
        String result = generator.produce(template, args);
        assertEquals("I am a Max, Who are you?", result);
    }

    @Test
    public void whenMissingKeyInMapThenThrowException() {
        String template = "I am a ${name}, Who are ${subject}?";
        Map<String, String> args = new HashMap<>();
        args.put("name", "Max");
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                generator.produce(template, args));
        assertTrue(exception.getMessage().contains("Missing key"));
    }

    @Test
    public void whenExtraKeyInMapThenThrowException() {
        String template = "Hello ${name}";
        Map<String, String> args = new HashMap<>();
        args.put("name", "Max");
        args.put("subject", "you");
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                generator.produce(template, args));
        assertTrue(exception.getMessage().contains("Extra key"));
    }
}