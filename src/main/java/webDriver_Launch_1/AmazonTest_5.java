package webDriver_Launch_1;

public class AmazonTest_5 {

	public static void main(String[] args) {
		// With Browser Util Code return in Good readable format ...
		BrowserUtil_4 b = new BrowserUtil_4();
		b.launchBrowser("Chrome");
		b.enterUrl("https://www.google.com/");

		String url = b.getAppCurrentUrl();
		System.out.println(url);

		String title = b.getPageTitle();
		if (title.contains("Google")) {
			System.out.println("Title matched");
		} else {
			System.out.println("Title Not MAatched");
		}

		b.closeBrowser();
	}

}
