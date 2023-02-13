package webDriver_Launch_1;

public class Reddifmail6 {

	public static void main(String[] args) {
		BrowserUtil_4 b = new BrowserUtil_4();
		// Same Code Reuse for any webApplication
		// Ex:Reddif,Acetestuat,stage-medicare.uhc.com ..
		b.launchBrowser("Chrome");
		b.enterUrl("https://staging.allcloud.in/acetestuat/");

		String url = b.getAppCurrentUrl();
		System.out.println(url);

		String title = b.getPageTitle();
		if (title.contains("rediff")) {
			System.out.println("Title matched");
		} else {
			System.out.println("Title Not MAatched");
		}

		b.closeBrowser();

	}

}
