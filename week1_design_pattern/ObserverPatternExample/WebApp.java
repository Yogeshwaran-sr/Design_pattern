package ObserverPatternExample;

public class WebApp implements Observer {
    private String name;

    public WebApp(String name) {
        this.name = name;
    }

    public void update(int price) {
        System.out.println(name + "bought using web app of price " + price);
    }
}
