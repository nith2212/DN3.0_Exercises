public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("http://example.com/image1.jpg");
        Image image2 = new ProxyImage("http://example.com/image2.jpg");

        // Images will be loaded from the server on the first display
        image1.display();
        image2.display();

        // Images will be cached and not loaded from the server again
        image1.display();
        image2.display();
    }
}
