package Steps;

import org.junit.Assert;

import Base.baseClass;
import Pages.Locators_In_One_Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

/*import Base.baseClass;
import Pages.All_Locators_In_One_Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;*/

public class CostChecker_NHS_Wales extends baseClass{

	Locators_In_One_Page allInOnePage = new Locators_In_One_Page();

	@Before
	public void initialize() {
		browserInvoke();
	}

	@After
	public void tearDown() {
		browserQuit();
	}

	//******************************************Scenario 1***********************************************
	@Given("I am a person from Wales")
	public void i_am_a_person_from_Wales() throws InterruptedException {
		System.out.println("Opening NHS Cost Checker Site");
		openNHSCostCheckerSite();
		//Thread.sleep(2000);
		Wait(2000);

		//accept analytics cookies
		if(IsElepresent(allInOnePage.okWithCookies)) {
			ClickEle(allInOnePage.okWithCookies);
			Wait(2000);
		}
		//starting cost checker
		if(getWindowTitle().equals("Check what help you could get to pay for NHS costs") && IsElepresent(allInOnePage.startBtn)) {
			ClickEle(allInOnePage.startBtn);
			Wait(2000);
		}
		//selecting country wales
		if(getWindowTitle().equals("Which country do you live in?") && IsElepresent(allInOnePage.countryWalesRadioBtn) && IsElepresent(allInOnePage.AllPageNextBtn)) {
			ClickEle(allInOnePage.countryWalesRadioBtn);
			ClickEle(allInOnePage.AllPageNextBtn);
			Wait(2000);
		}

	}

	@Then("I should get a result of whether I will get help or not")
	public void i_should_get_a_result_of_whether_I_will_get_help_or_not() throws InterruptedException {
		if(getWindowTitle().equals("You get help with health costs")) {			
			System.out.println(GetText(allInOnePage.resultsText));
			Wait(2000);
		}

	}


	@When("^I put my circumstances into (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*) the Checker tool$")
	public void i_put_my_circumstances_into_Day_Month_Year_Living_With_Partner_Claim_Benefit_Tax_Is_Pregnant_Injury_Illness_Is_Diabetes_Is_Glaucoma_Livein_Carehome_GetHelpFor_CoucilTax_Savings_MoreThan_16000_Savings_MoreThan_24000_the_Checker_tool(String day, String month, String year, String livingWithPartner, String claimBenefitTax, String isPregnant, String injuryIllness, String isDiabetes, String isGlaocoma, String liveInCareHome, String getHelpForCounilTax, String moreThan16000, String moreThan24000) throws InterruptedException {

		//entering date of birth
		if(getWindowTitle().equals("What is your date of birth?")) {
			TypeText(allInOnePage.dobPageDay, day);
			TypeText(allInOnePage.dobPageMonth, month);
			TypeText(allInOnePage.dobPageYear, year);
			ClickEle(allInOnePage.AllPageNextBtn);
			Wait(2000);
			Match(getWindowTitle(), "Do you live with a partner?", "Matching Partner window title");
		}

		//answering partner question
		if(livingWithPartner.equals("No")) {
			ClickEle(allInOnePage.radioBtnNo);
			ClickEle(allInOnePage.AllPageNextBtn);
			Wait(2000);
			Match(getWindowTitle(), "Do you claim any benefits or tax credits?", "Matching your benefit and tax window title");
		}
		else {
			ClickEle(allInOnePage.radioBtnYes);
			ClickEle(allInOnePage.AllPageNextBtn);
			Wait(2000);
			Match(getWindowTitle(), "Do you or your partner claim any benefits or tax credits?", "Matching your partner's benefit and tax window title");
		}
		//answering benefits and tax question
		if(claimBenefitTax.equals("No")) {
			ClickEle(allInOnePage.radioBtnNo);
			ClickEle(allInOnePage.AllPageNextBtn);
			Wait(2000);
			Match(getWindowTitle(), "Are you pregnant or have you given birth in the last 12 months?", "Matching pregnancy window title");
		}
		//answering pregnancy question
		if(isPregnant.equals("No")) {
			ClickEle(allInOnePage.radioBtnNo);
			ClickEle(allInOnePage.AllPageNextBtn);
			Wait(2000);
			Match(getWindowTitle(), "Do you have an injury or illness caused by serving in the armed forces?", "Matching pregnancy window title");
		}
		else {
			ClickEle(allInOnePage.radioBtnYes);
			ClickEle(allInOnePage.AllPageNextBtn);
			Wait(2000);
			Match(getWindowTitle(), "Do you have an injury or illness caused by serving in the armed forces?", "Matching pregnancy window title");
		}
		//answering injury and illness question
		if(injuryIllness.equals("No")){
			ClickEle(allInOnePage.radioBtnNo);
			ClickEle(allInOnePage.AllPageNextBtn);
			Wait(2000);
			Match(getWindowTitle(), "Do you have diabetes?", "Matching pregnancy window title");					
		}
		else {
			ClickEle(allInOnePage.radioBtnYes);
			ClickEle(allInOnePage.AllPageNextBtn);
			Wait(2000);
			Match(getWindowTitle(), "Do you have diabetes?", "Matching pregnancy window title");
		}
		//answering diabetes question
		if(isDiabetes.equals("No")) {
			ClickEle(allInOnePage.radioBtnNo);
			ClickEle(allInOnePage.AllPageNextBtn);
			Wait(2000);
			Match(getWindowTitle(), "Do you have glaucoma?", "Matching pregnancy window title");
		}
		else {
			ClickEle(allInOnePage.radioBtnYes);
			ClickEle(allInOnePage.AllPageNextBtn);
			Wait(2000);
			Match(getWindowTitle(), "Do you have glaucoma?", "Matching pregnancy window title");
		}
		//answering glaucoma question
		if(isGlaocoma.equals("No")){
			ClickEle(allInOnePage.radioBtnNo);
			ClickEle(allInOnePage.AllPageNextBtn);
			Wait(2000);
			Match(getWindowTitle(), "Do you live permanently in a care home?", "Matching pregnancy window title");
		}
		else {
			ClickEle(allInOnePage.radioBtnYes);
			ClickEle(allInOnePage.AllPageNextBtn);
			Wait(2000);
			Match(getWindowTitle(), "Do you live permanently in a care home?", "Matching pregnancy window title");
		}
		//answering care home question
		if(liveInCareHome.equals("No")) {
			ClickEle(allInOnePage.radioBtnNo);
			ClickEle(allInOnePage.AllPageNextBtn);
			Wait(2000);
			Match(getWindowTitle(), "Do you have more than £16,000 in savings, investments or property?", "Matching pregnancy window title");
		}
		//answering earning, investment question
		if(moreThan16000.equals("No")) {
			ClickEle(allInOnePage.radioBtnNo);
			ClickEle(allInOnePage.AllPageNextBtn);
			Wait(2000);
			Match(getWindowTitle(), "You get help with health costs", "Matching pregnancy window title");
		}
		else {
			ClickEle(allInOnePage.radioBtnYes);
			ClickEle(allInOnePage.AllPageNextBtn);
			Wait(2000);
			Match(getWindowTitle(), "You get help with health costs", "Matching pregnancy window title");
		}
	}
	
	//*********************************************Scenario 2*********************************************
	
	@When("^I declare my circumstances into (.*), (.*), (.*)$")
	public void i_declare_my_circumstances_into_Day_Month_Year(String day, String month, String year) throws InterruptedException {
		//entering date of birth
				if(getWindowTitle().equals("What is your date of birth?")) {
					TypeText(allInOnePage.dobPageDay, day);
					TypeText(allInOnePage.dobPageMonth, month);
					TypeText(allInOnePage.dobPageYear, year);
					ClickEle(allInOnePage.AllPageNextBtn);
					Wait(2000);
					Match(getWindowTitle(), "Because you're under 16 you get help paying NHS costs", "Matching pregnancy window title");
	}
}

	
	//*************************************Scenario 3**************************************************
	
	@When("^I enter values into (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*)$")
	public void i_put_my_circumstances_into_Day_Month_Year_Full_Time_Education_Living_With_Partner_Claim_Benefit_Tax_Is_Pregnant_Injury_Illness_Is_Diabetes_Is_Glaucoma_Livein_Carehome_GetHelpFor_CoucilTax_Savings_MoreThan_16000_Savings_MoreThan_24000_the_Checker_tool(String day, String month, String year, String fullTimeEducation, String livingWithPartner, String claimBenefitTax, String isPregnant, String injuryIllness, String isDiabetes, String isGlaocoma, String liveInCareHome, String getHelpForCounilTax, String moreThan16000, String moreThan24000) throws InterruptedException {
	
		//entering date of birth
				if(getWindowTitle().equals("What is your date of birth?")) {
					TypeText(allInOnePage.dobPageDay, day);
					TypeText(allInOnePage.dobPageMonth, month);
					TypeText(allInOnePage.dobPageYear, year);
					ClickEle(allInOnePage.AllPageNextBtn);
					Wait(2000);
					Match(getWindowTitle(), "Are you in full time education?", "Matching education window title");
				}
				//answering full time education
				if(fullTimeEducation.equals("Yes")) {
					ClickEle(allInOnePage.radioBtnYes);
					ClickEle(allInOnePage.AllPageNextBtn);
					Wait(2000);
					Match(getWindowTitle(), "Because you're under 19 and in full time education you get help paying NHS costs", "Matching full time education result window title");
					System.out.println(GetText(allInOnePage.resultsText));
				}
				else {
					ClickEle(allInOnePage.radioBtnNo);
					ClickEle(allInOnePage.AllPageNextBtn);
					Wait(2000);
					Match(getWindowTitle(), "Do you claim any benefits or tax credits?", "Matching partner page window title");
					
				}
				
				//answering partner question
				if(livingWithPartner.equals("No")) {
					ClickEle(allInOnePage.radioBtnNo);
					ClickEle(allInOnePage.AllPageNextBtn);
					Wait(2000);
					Match(getWindowTitle(), "Do you claim any benefits or tax credits?", "Matching your benefit and tax window title");
				}
				else {
					ClickEle(allInOnePage.radioBtnYes);
					ClickEle(allInOnePage.AllPageNextBtn);
					Wait(2000);
					Match(getWindowTitle(), "Do you or your partner claim any benefits or tax credits?", "Matching your partner's benefit and tax window title");
				}
				//answering benefits and tax question
				if(claimBenefitTax.equals("No")) {
					ClickEle(allInOnePage.radioBtnNo);
					ClickEle(allInOnePage.AllPageNextBtn);
					Wait(2000);
					Match(getWindowTitle(), "Are you pregnant or have you given birth in the last 12 months?", "Matching pregnancy window title");
				}
				//answering pregnancy question
				if(isPregnant.equals("No")) {
					ClickEle(allInOnePage.radioBtnNo);
					ClickEle(allInOnePage.AllPageNextBtn);
					Wait(2000);
					Match(getWindowTitle(), "Do you have an injury or illness caused by serving in the armed forces?", "Matching pregnancy window title");
				}
				else {
					ClickEle(allInOnePage.radioBtnYes);
					ClickEle(allInOnePage.AllPageNextBtn);
					Wait(2000);
					Match(getWindowTitle(), "Do you have an injury or illness caused by serving in the armed forces?", "Matching pregnancy window title");
				}
				//answering injury and illness question
				if(injuryIllness.equals("No")){
					ClickEle(allInOnePage.radioBtnNo);
					ClickEle(allInOnePage.AllPageNextBtn);
					Wait(2000);
					Match(getWindowTitle(), "Do you have diabetes?", "Matching pregnancy window title");					
				}
				else {
					ClickEle(allInOnePage.radioBtnYes);
					ClickEle(allInOnePage.AllPageNextBtn);
					Wait(2000);
					Match(getWindowTitle(), "Do you have diabetes?", "Matching pregnancy window title");
				}
				//answering diabetes question
				if(isDiabetes.equals("No")) {
					ClickEle(allInOnePage.radioBtnNo);
					ClickEle(allInOnePage.AllPageNextBtn);
					Wait(2000);
					Match(getWindowTitle(), "Do you have glaucoma?", "Matching pregnancy window title");
				}
				else {
					ClickEle(allInOnePage.radioBtnYes);
					ClickEle(allInOnePage.AllPageNextBtn);
					Wait(2000);
					Match(getWindowTitle(), "Do you have glaucoma?", "Matching pregnancy window title");
				}
				//answering glaucoma question
				if(isGlaocoma.equals("No")){
					ClickEle(allInOnePage.radioBtnNo);
					ClickEle(allInOnePage.AllPageNextBtn);
					Wait(2000);
					Match(getWindowTitle(), "Do you live permanently in a care home?", "Matching pregnancy window title");
				}
				else {
					ClickEle(allInOnePage.radioBtnYes);
					ClickEle(allInOnePage.AllPageNextBtn);
					Wait(2000);
					Match(getWindowTitle(), "Do you live permanently in a care home?", "Matching pregnancy window title");
				}
				//answering care home question
				if(liveInCareHome.equals("No")) {
					ClickEle(allInOnePage.radioBtnNo);
					ClickEle(allInOnePage.AllPageNextBtn);
					Wait(2000);
					Match(getWindowTitle(), "Do you have more than £16,000 in savings, investments or property?", "Matching pregnancy window title");
				}
				//answering earning, investment question
				if(moreThan16000.equals("No")) {
					ClickEle(allInOnePage.radioBtnNo);
					ClickEle(allInOnePage.AllPageNextBtn);
					Wait(2000);
					Match(getWindowTitle(), "You get help with health costs", "Matching pregnancy window title");
				}
				else {
					ClickEle(allInOnePage.radioBtnYes);
					ClickEle(allInOnePage.AllPageNextBtn);
					Wait(2000);
					Match(getWindowTitle(), "You get help with health costs", "Matching pregnancy window title");
				}
	}
	

}

	

