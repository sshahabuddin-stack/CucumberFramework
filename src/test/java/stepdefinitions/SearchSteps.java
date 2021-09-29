package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
	    System.out.println("Step 1: I am on Search Page");
	    
	}

	@When("I search a product with name {string} and price {int}")
	public void i_search_a_product_with_name_and_price(String productName, Integer Price) {
		System.out.println("Step 2: Search the product with name: " 
	                        +productName + "Price: " + Price);
	   
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
	    System.out.println("Step 3:product " + productName +" is displayed");
	    
	}


}
