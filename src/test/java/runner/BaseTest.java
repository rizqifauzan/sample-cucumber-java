package runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseTest {

    @Before
    public void setup(){
        System.out.println("Before");
        int c = 0/2;
    }


    @After
    public void after(){
        System.out.println("After .....");
        int d = 0/2;

    }
}
