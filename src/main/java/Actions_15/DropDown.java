package Actions_15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get(
				"https://www.facebook.com/campaign/landing.php?campaign_id=15461201666&extra_1=s%7Cc%7C589521732875%7Cb%7Cfacebook%20%27%7C&placement=&creative=589521732875&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D15461201666%26adgroupid%3D130924380175%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9152582%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjw27mhBhC9ARIsAIFsETGBH7D8bac7Rtp0h3U6XZL9mdxyorgDe3jYgzgfeNj3dFlmIXybw0waAnFQEALw_wcB");
		WebElement dropdownselect = driver.findElement(By.xpath("//select[@id='month']"));

		Select select = new Select(dropdownselect);

		List<WebElement> options = select.getOptions();

		for (WebElement e : options) {

			String str = e.getText();
			System.out.println(str);
		}

	}

}
