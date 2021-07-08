package ucf.assignments;

import javafx.util.converter.LocalDateStringConverter;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void setItemStatusTrue() {
        //given
        Item item = new Item();
        boolean status = true;
        //when
        item.setItemStatus(true);
        //then
        assertEquals(status, item.getItemStatus());
    }

    @Test
    void setItemStatusFalse() {
        //given
        Item item = new Item();
        boolean status = false;
        //when
        item.setItemStatus(false);
        //then
        assertEquals(status, item.getItemStatus());
    }

    @Test
    void setItemDescription() {
        //given
        Item item = new Item();
        String desc = "Item Description";
        //when
        item.setItemDescription("Item Description");
        //then
        assertEquals(desc, item.getItemDescription());
    }

    @Test
    void setItemDueDate() {
        //given
        Item item = new Item();
        LocalDate date = LocalDate.of(2002, 03, 07);
        //when
        item.setItemDueDate(date);
        //then
        assertEquals(date, item.getItemDueDate());

    }
}