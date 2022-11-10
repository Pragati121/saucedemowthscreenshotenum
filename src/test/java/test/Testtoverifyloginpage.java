package test;

import org.testng.annotations.Test;

import java.io.IOException;

public class Testtoverifyloginpage extends Baseclass {
    @Test
    public void loginTest() throws IOException {
        Setup();
        pageFactory.getLoginobject().USerMethod();
    }
}
