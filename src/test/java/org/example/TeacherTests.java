package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTests {
    @Test
    public void testCreateTeacher() {
        Teacher teacher = new Teacher("Math", "Alice");
        assertEquals("Alice", teacher.getName());
        assertEquals("Math", teacher.getClassName());
    }

    @Test
    public void testGettersAndSetters() {
        Teacher teacher = new Teacher("Math", "Alice");
        teacher.setName("Bob");
        teacher.setClassName("Science");
        assertEquals("Bob", teacher.getName());
        assertEquals("Science", teacher.getClassName());
    }

    @Test
    public void testToString() {
        Teacher teacher = new Teacher("Math", "Alice");
        assertEquals("Alice (Math)", teacher.toString());
    }
}
