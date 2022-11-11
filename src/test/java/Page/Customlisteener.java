package Page;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import test.Baseclass;
@Listeners(Listener.class)
public class Customlisteener extends Baseclass {
    @BeforeMethod
    public void Setup() {
        Setup();
    }
    @AfterMethod
    public void tearDown() {
        close();
    }
        @Test
        public void takescreenshot()
        {
            Assert.assertEquals(false, true);
        }
    }


