package webDriver_Launch_1;

public class Reddifmail_6 {

	public static void main(String[] args) {
		BrowserUtil_4 b = new BrowserUtil_4();
		// Same Code Reuse for any webApplication
		// Ex:Reddif,Acetestuat,stage-medicare.uhc.com ..
		// I just call those methods in to this class
		b.launchBrowser("Firefox");
		b.enterUrl("https://staging.allcloud.in/acetestuat/");

		String url = b.getAppCurrentUrl();
		System.out.println(url);

		String title = b.getPageTitle();
		System.out.println(title);
		if (title.contains("Welcome")) {
			System.out.println("Title matched");
		} else {
			System.out.println("Title Not MAatched");
		}

		b.QuitBrowser();

	}

}
