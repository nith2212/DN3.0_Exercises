public class RealImage implements Image {
    private String imageUrl;

    public RealImage(String imageUrl) {
        this.imageUrl = imageUrl;
        loadImageFromServer();
    }

    private void loadImageFromServer() {
        System.out.println("Loading image from " + imageUrl);
        // Simulate loading image from a remote server
    }

    @Override
    public void display() {
        System.out.println("Displaying image from " + imageUrl);
    }
}
