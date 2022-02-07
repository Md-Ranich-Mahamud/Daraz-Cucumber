package stape_definitions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step_definition extends Base {
	 WebDriverWait explicitWait;
	 Boolean expected = true;
	

   @Given("I am in Daraz.com.bd")
    public void i_am_in_Daraz_com_bd() {
	driver.get("https://www.daraz.com.bd/");
  
   }

   @And("I want to view the logo in left top side")
     public void i_want_to_view_the_logo_in_left_top_side() {
	   explicitWait = new WebDriverWait(driver,30);
	   WebElement logoOfDaraz = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.lzd-logo-content img")));
	   Boolean islogoDisplayed = logoOfDaraz.isDisplayed();
	   System.out.println("Logo is on left top side : "+ islogoDisplayed);
	   Assert.assertEquals(islogoDisplayed, expected);
	   
   }

   @And("I want to view the search bar in mid")
     public void i_want_to_view_the_search_bar_in_mid() {
	   explicitWait = new WebDriverWait(driver,30);
	   WebElement searchbarofDaraz = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#q")));
	   Boolean issearchBarinMiddle =  searchbarofDaraz.isDisplayed();
	   System.out.println("The search bar in middle : "+issearchBarinMiddle);
	   Assert.assertEquals(issearchBarinMiddle, expected);
 
   }

   @And("There must be a search button next to search bar")
     public void there_must_be_a_search_button_next_to_search_bar() {
	   explicitWait = new WebDriverWait(driver,30);
	   WebElement searchButton = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.search-box__button--1oH7")));
	   Boolean isSearchButtonDisplayed = searchButton.isDisplayed();
	   System.out.println("Search button is Displayed : "+isSearchButtonDisplayed);
	   Assert.assertEquals(isSearchButtonDisplayed, expected);
 
   }

   @And("Also I want to view cart option")
     public void also_I_want_to_view_cart_option() {
	   explicitWait = new WebDriverWait(driver,30);
	   WebElement viewCartOption = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.cart-icon")));
	   Boolean isViewcartoptionDisplayed = viewCartOption.isDisplayed();
	   System.out.println("Cart option is Displayed : "+isViewcartoptionDisplayed);
	   Assert.assertEquals(isViewcartoptionDisplayed, expected);
   
   }

   @Then("i want a category option")
     public void i_want_a_category_option() {
	   explicitWait = new WebDriverWait(driver,30);
	   WebElement category = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#hp-categories h3")));
	   Boolean isCategoryDisplayed = category.isDisplayed();
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].scrollIntoView();", category);
	   
	   System.out.println("Ctegory Option is Displayed : "+ isCategoryDisplayed );
	   Assert.assertEquals( isCategoryDisplayed , expected);
  
   }

   @And("In Category there must be sixteen categories")
     public void in_Category_there_must_be_sixteen_categories() {
	   explicitWait = new WebDriverWait(driver,30);
	   List<WebElement> categoryList = explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div#hp-categories a.card-categories-li-content")));
	  // Boolean categoryListIsDisplayed = categoryList.isDisplayed();
	   int category = categoryList.size();
	   System.out.println("Sixteen Category list is daisplayed : "+category);
	   Assert.assertEquals(category, 16);
  
   }

   @And("In landing page, there must be twelve menus in left side and assert every category")
     public void in_landing_page_there_must_be_twelve_menus_in_left_side_and_assert_every_category() {
	   explicitWait = new WebDriverWait(driver,30);
	   List<WebElement> menu = explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div.lzd-site-nav-menu-dropdown li.lzd-site-menu-root-item")));
	   int menuList =  menu.size();
	   System.out.println("Total menu categary is : "+menuList);
	   Assert.assertEquals(menuList, 12);
	   
   
   }

   @When("I want to pay,there must be shown five payment methods in the footer")
     public void i_want_to_pay_there_must_be_shown_five_payment_methods_in_the_footer() {
	   explicitWait = new WebDriverWait(driver,30);
	   List<WebElement> pament = explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='drz-footer-width-25 payment-column']//span")));
	   int pamentMethod = pament.size();
	   System.out.println("Total pament Method is : "+pamentMethod);
	   Assert.assertEquals(pamentMethod, 5);
   
   }

   @And("Internationally Daraz is available in five countries and shows in footer")
     public void internationally_Daraz_is_available_in_five_countries_and_shows_in_footer() {
	   explicitWait = new WebDriverWait(driver,30);
	   List<WebElement> Countries = explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@data-spm=\"venture\"]//a")));
	   int countriesList = Countries.size();
	   System.out.println("Total Countries is : "+countriesList);
	   Assert.assertEquals(countriesList, 5);
  
   }

}
