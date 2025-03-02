package Browser;

public class Main {
    public static void main(String[] args) {
        Browser chrome=new Browser(5);
        chrome.visitPage("Google.com");
        chrome.visitPage("FB.com");
        chrome.back();
        chrome.forward();
        chrome.visitPage("twitter.com");
        chrome.back();
    }

}
