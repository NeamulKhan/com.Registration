package stepDefinationRegistration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilityRegistration.BaseClass_Registration;

public class Registration extends BaseClass_Registration {
	
	@Given("^Launch \"([^\"]*)\"$")
	public void launch(String URL) throws Throwable {
	    
		registrationLaunchURL(URL);
	}


@Then("^enter firstname,lastname,address,email and phone number$")
public void enter_firstname_lastname_address_email_and_phone_number() throws Throwable {
   
}

@Then("^click gender,hobbies,languages, select skills,country and county, date of birth, confirm dob and click submit button$")
public void click_gender_hobbies_languages_select_skills_country_and_county_date_of_birth_confirm_dob_and_click_submit_button() throws Throwable {
    
}

@Then("^click submit button$")
public void click_submit_button() throws Throwable {
   
}


}
