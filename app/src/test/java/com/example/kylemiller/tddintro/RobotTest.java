package com.example.kylemiller.tddintro;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by kylemiller on 05/09/2017.
 */

public class RobotTest {
    Robot robot;

    @Before
    public void before(){
        robot = new Robot("C3P0", "Gold");
    }


    @Test
    public void testRobotSetup(){
        assertEquals("C3P0", robot.getName());
        assertEquals("Gold", robot.getColour());
    }

    @Test
    public void testCheckBattery(){
        assertEquals(100.0, robot.getBattery(), 0.01);
    }

    @Test
    public void testMakeDrink(){
        String reply = robot.makeDrink("Gin & Tonic");
        assertEquals( "I am making Gin & Tonic", reply );
    }

    @Test
    public void testMakeDrinkReducesBattery(){
        robot.makeDrink("Gin & Tonic");
        assertEquals(90.0, robot.getBattery(), 0.01);
    }

    @Test
    public void testWashDishes(){
        String reply = robot.washDishes();
        assertEquals( "I am washing the dishes", reply );
    }

    @Test
    public void testWashDishesReducesBattery(){
        robot.washDishes();
        assertEquals(70.0, robot.getBattery(), 0.01);
    }

    @Test
    public void testDoDusting(){
        String reply = robot.doDusting();
        assertEquals( "I am dusting", reply );
    }

    @Test
    public void testDoDustingReducesBattery(){
        robot.doDusting();
        assertEquals(80.0, robot.getBattery(), 0.01);
    }

    @Test
    public void testRecharge(){
        robot.doDusting();
        robot.rechargeBattery();
        assertEquals(100.0, robot.getBattery(), 0.01);
    }
}
