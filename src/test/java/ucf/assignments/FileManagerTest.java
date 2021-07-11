/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {

    @Test
    void readFromFile() {
        //given
        FileManager fileManager = new FileManager();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("run a lot  |  Incomplete |  2021-07-23 |");
        expected.add("poop       |  Complete   |  2021-07-09 |");
        expected.add("brush face |  Complete   |  2021-07-14 |");
        //then
        assertEquals(expected, fileManager.readFromFile("C:\\Users\\19172\\OneDrive\\Desktop\\Viggiani-cop330-Assignment4-master\\src\\main\\resources\\readTest.txt"));
    }
}
