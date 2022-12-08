import org.testng.annotations.Test;

public class ProjectTest extends BaseTest
{
    @Test
    void storeCart() throws InterruptedException {
        store.goToStoreURL();
        store.selectGalaxy();

        galaxy.addToCart();
        Thread.sleep(2000);
        galaxy.acceptAlert();

        store.goToStoreURL();
        store.scrollToHTC();
        store.selectHTC();

        htc.addToCart();
        Thread.sleep(2000);
        htc.acceptAlert();
        htc.goToCart();
        Thread.sleep(2000);

        cart.printTotalPrice();
        cart.deleteGalaxy();
        cart.deleteHTC();
    }
}
