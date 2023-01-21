package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void WhenGretBot() {
        String in = "Hi, bot.";
        String result = DummyBot.answer(in);
        String expected = "Hi, SmartAss.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenByeBot() {
        String in = "Bye.";
        String result = DummyBot.answer(in);
        String expected = "See you later.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenUnknownBot() {
        String in = "What the fuck?";
        String result = DummyBot.answer(in);
        String expected = "I don't know. Please, ask another question.";
        assertThat(result).isEqualTo(expected);
    }
}
