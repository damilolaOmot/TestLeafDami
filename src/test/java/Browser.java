public class Browser {
    public void launchBrowser(String browserName){
        System.out.println("Browser" +browserName + " launched successfully");
    }
    public void loadUrl() {
        System.out.println("Application URL Loaded successfully");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Browser Obj1 = new Browser();
        Obj1.launchBrowser("Chrome");
        Obj1.loadUrl();

   /* public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
    }**/
}}
