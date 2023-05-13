package WebDriver_castings_2;

public class WebDriver_Castings {

	public static void main(String[] args) {
		// ______1 & 4 are Most Useful in Industries_____

		// (1). WD ----- CD => Industry Standard
		// WebDriver driver=new ChromeDriver();

		// CD ----CD
		// (2).ChromeDriver driver=new ChromeDriver();

		// (3).RWD ----CD
		// RemoteWebDriver driver = new ChromeDriver();
		// driver. == Able to find all webDriver Methods ...

		// Run On Remote Machine:-
		// ------------------------
		// (4). WD ----RWD --- remote MachineServer/vm/Docker/Cloud/Cloud vendor
		// In this case we can use this Combination ....
		// WebDriver wd=new RemoteWebDriver("192.45.1.10:4444", capabilities);

		// (5).SC -----CD [N't an Industry Standard]
		// SearchContext sc=new ChromeDriver();
		// sc. === I'm able to find 2 methods Only ..

		// (6).SC -----RWD [N't an Industry Standard]
		// SearchContext sc=newRemotewebDriver("192.45.1.10:4444", capabilities);
		// sc. === I'm able to find 2 methods Only ..

	}

}
