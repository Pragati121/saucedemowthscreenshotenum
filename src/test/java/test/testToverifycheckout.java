package test;

import org.testng.annotations.Test;

import java.io.IOException;

public class testToverifycheckout extends Baseclass {
    @Test
    public void checkout() throws IOException {
        Setup();
        pageFactory.getCheckoutMethod().Checkoutdetail();
    }
}
