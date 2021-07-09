package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    void getTitle() {
        //given
        ToDoList list = new ToDoList();
        String title = "Title";
        //when
        list.setTitle("Title");
        //then
        assertEquals(title, list.getTitle());
    }

    @Test
    void addItem() {
        //given
        ToDoList actual = new ToDoList();
        Item item = new Item();
        ArrayList expected = new ArrayList();
        //when
        actual.addItem(item);
        expected.add(item);
        //then
        assertEquals(expected, actual);
        }

    @Test
    void removeItem() {
        //given
        ToDoList actual = new ToDoList();
        Item item = new Item();
        ArrayList expected = new ArrayList();
        //when
        actual.removeItem(item);
        expected.remove(item);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void getItems() {
        //given
        ToDoList list = new ToDoList();

    }
}