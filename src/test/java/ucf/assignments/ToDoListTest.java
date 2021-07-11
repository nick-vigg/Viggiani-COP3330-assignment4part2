package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    void addItem() {
        //given
        ToDoList actual = new ToDoList();
        ArrayList<Item> expected = new ArrayList<Item>();
        Item item = new Item();
        //when
        actual.addItem(item);
        expected.add(item);
        //then
        assertEquals(expected.get(0).getItemDescription(), actual.getItem(0).getItemDescription());
        }

    @Test
    void removeItem() {
        //given
        ToDoList actual = new ToDoList();
        Item item1 = new Item();
        Item item2 = new Item();
        item1.setItemDescription("run a lot");
        item1.setItemStatus(false);
        item1.setItemDueDate(LocalDate.parse("2021-07-23"));
        item2.setItemDescription("poop");
        item2.setItemStatus(true);
        item2.setItemDueDate(LocalDate.parse("2021-07-09"));
        ArrayList<Item> expected = new ArrayList<Item>();
        actual.addItem(item1);
        actual.addItem(item2);
        expected.add(item1);
        expected.add(item2);
        //when
        actual.removeItem(0);
        expected.remove(0);
        //then
        assertEquals(expected.get(0).getItemDescription(), actual.getItem(0).getItemDescription());

    }

    @Test
    void getItem() {
        //given
        ToDoList actual = new ToDoList();
        Item item1 = new Item();
        Item item2 = new Item();
        item1.setItemDescription("run a lot");
        item1.setItemStatus(false);
        item1.setItemDueDate(LocalDate.parse("2021-07-23"));
        item2.setItemDescription("poop");
        item2.setItemStatus(true);
        item2.setItemDueDate(LocalDate.parse("2021-07-09"));
        ArrayList<Item> expected = new ArrayList<Item>();
        actual.addItem(item1);
        actual.addItem(item2);
        expected.add(item1);
        expected.add(item2);
        //then
        assertEquals(actual.getItem(0), expected.get(0));
    }

    @Test
    void getSize() {
        //given
        ToDoList actual = new ToDoList();
        Item item1 = new Item();
        Item item2 = new Item();
        item1.setItemDescription("run a lot");
        item1.setItemStatus(false);
        item1.setItemDueDate(LocalDate.parse("2021-07-23"));
        item2.setItemDescription("poop");
        item2.setItemStatus(true);
        item2.setItemDueDate(LocalDate.parse("2021-07-09"));
        ArrayList<Item> expected = new ArrayList<Item>();
        actual.addItem(item1);
        actual.addItem(item2);
        expected.add(item1);
        expected.add(item2);
        //then
        assertEquals(actual.getSize(), expected.size());
    }

    @Test
    void testGetItem() {
        //given
        ToDoList actual = new ToDoList();
        Item item1 = new Item();
        Item item2 = new Item();
        item1.setItemDescription("run a lot");
        item1.setItemStatus(false);
        item1.setItemDueDate(LocalDate.parse("2021-07-23"));
        item2.setItemDescription("poop");
        item2.setItemStatus(true);
        item2.setItemDueDate(LocalDate.parse("2021-07-09"));
        ArrayList<Item> expected = new ArrayList<Item>();
        actual.addItem(item1);
        actual.addItem(item2);
        expected.add(item1);
        expected.add(item2);
        //then

    }

    @Test
    void getTitles() {
        //given
        ToDoList actual = new ToDoList();
        Item item1 = new Item();
        Item item2 = new Item();
        item1.setItemDescription("run a lot");
        item1.setItemStatus(false);
        item1.setItemDueDate(LocalDate.parse("2021-07-23"));
        item2.setItemDescription("poop");
        item2.setItemStatus(true);
        item2.setItemDueDate(LocalDate.parse("2021-07-09"));
        ArrayList<String> expected = new ArrayList<String>();
        actual.addItem(item1);
        actual.addItem(item2);
        expected.add("run a lot");
        expected.add("poop");
        //when
        ArrayList<String> actualTitles = actual.getTitles();
        //then
        assertEquals(expected, actualTitles);
    }

    @Test
    void getDates() {
        //given
        ToDoList actual = new ToDoList();
        Item item1 = new Item();
        Item item2 = new Item();
        item1.setItemDescription("run a lot");
        item1.setItemStatus(false);
        item1.setItemDueDate(LocalDate.parse("2021-07-23"));
        item2.setItemDescription("poop");
        item2.setItemStatus(true);
        item2.setItemDueDate(LocalDate.parse("2021-07-09"));
        ArrayList<LocalDate> expected = new ArrayList<LocalDate>();
        actual.addItem(item1);
        actual.addItem(item2);
        expected.add(LocalDate.parse("2021-07-23"));
        expected.add(LocalDate.parse("2021-07-09"));
        //when
        ArrayList<LocalDate> actualDates = actual.getDates();
        //then
        assertEquals(expected, actualDates);
    }

    @Test
    void getComplete() {
        //given
        ToDoList actual = new ToDoList();
        Item item1 = new Item();
        Item item2 = new Item();
        item1.setItemDescription("run a lot");
        item1.setItemStatus(false);
        item1.setItemDueDate(LocalDate.parse("2021-07-23"));
        item2.setItemDescription("poop");
        item2.setItemStatus(true);
        item2.setItemDueDate(LocalDate.parse("2021-07-09"));
        ArrayList<Boolean> expected = new ArrayList<Boolean>();
        actual.addItem(item1);
        actual.addItem(item2);
        expected.add(false);
        expected.add(true);
        //when
        ArrayList<Boolean> actualComplete = actual.getComplete();
        //then
        assertEquals(expected, actualComplete);
    }

    @Test
    void isComplete() {
        //given
        ToDoList actual = new ToDoList();
        Item item1 = new Item();
        Item item2 = new Item();
        item1.setItemDescription("run a lot");
        item1.setItemStatus(false);
        item1.setItemDueDate(LocalDate.parse("2021-07-23"));
        item2.setItemDescription("poop");
        item2.setItemStatus(true);
        item2.setItemDueDate(LocalDate.parse("2021-07-09"));
        ArrayList<String> expected = new ArrayList<String>();
        actual.addItem(item1);
        actual.addItem(item2);
        expected.add("poop");
        //when
        ArrayList<String> actualTitles = actual.isComplete();
        //then
        assertEquals(expected, actualTitles);
    }

    @Test
    void isIncomplete() {
        //given
        ToDoList actual = new ToDoList();
        Item item1 = new Item();
        Item item2 = new Item();
        item1.setItemDescription("run a lot");
        item1.setItemStatus(false);
        item1.setItemDueDate(LocalDate.parse("2021-07-23"));
        item2.setItemDescription("poop");
        item2.setItemStatus(true);
        item2.setItemDueDate(LocalDate.parse("2021-07-09"));
        ArrayList<String> expected = new ArrayList<String>();
        actual.addItem(item1);
        actual.addItem(item2);
        expected.add("run a lot");
        //when
        ArrayList<String> actualTitles = actual.isIncomplete();
        //then
        assertEquals(expected, actualTitles);
    }
}