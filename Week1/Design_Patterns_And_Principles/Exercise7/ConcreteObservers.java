public class MobileApp implements Observer {
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println("MobileApp " + name + ": Stock price updated to " + stockPrice);
    }
}

public class WebApp implements Observer {
    private String name;

    public WebApp(String name) {
        this.name = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println("WebApp " + name + ": Stock price updated to " + stockPrice);
    }
}
