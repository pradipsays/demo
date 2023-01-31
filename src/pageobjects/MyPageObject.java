package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( urlQueryString = "Select ID from Account", title="My Page Object"                                
               , page="MyProfilePage"
               , object="Account"
               , connection="Admin"
     )             
public class MyPageObject {
	
}
