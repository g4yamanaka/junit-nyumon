package org.example.exercise3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class YokuaruServiceTest {
    @Mock
    YokuaruDao dao;

    @InjectMocks
    YokuaruService service;

    AutoCloseable autoCloseable;

    @BeforeEach
    void before() {
        autoCloseable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void after() throws Exception {
        autoCloseable.close();
    }

    @Test
    void mockTest() {
        Mockito.doReturn(Arrays.asList("hello", "world")).when(dao).selectHoge();
        String actual = service.execute();
        String expected = "hello★world";
        assertEquals(expected, actual);
    }
}
