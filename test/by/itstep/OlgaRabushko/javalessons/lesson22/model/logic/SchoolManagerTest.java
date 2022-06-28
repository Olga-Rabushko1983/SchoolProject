package by.itstep.OlgaRabushko.javalessons.lesson22.model.logic;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SchoolManagerTest {
    private int[][]groups;
    @Before
    public void init(){
       groups=new int[][]{{7,8,9,2},//4
                {9,8,9,10},    //9
                {7,7,1},//5
                {8,8,10,10}};

    }
    @Test
    public void testCalculateAvgMarkPositive(){
       // int[][] groups = getGroups();      //9
        double expected=7.4;

        double actual=SchoolManager.calculateAvgMark(groups);

        assertEquals(expected, actual, 0.5);
    }
    @Test
    public void testFindBadStudentGroups(){
        //int[][] groups = getGroups();      //9
        String expected="13";

        String actual=SchoolManager.findBadStudentGroups(groups);
        assertEquals(expected,actual);
    }
@Test
    public void testfindGroupsWithoutBadStudent() {
        //int[][] groups = getGroups();        //5
        String expected = "24";

        String actual = SchoolManager.findGroupsWithoutBadStudents(groups);
        assertEquals(expected, actual);
    }
}
