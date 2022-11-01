package co.com.choucair.certification.pruebaguia.runners.stepdefinitions;

import co.com.choucair.certification.pruebaguia.model.UstetData;
import co.com.choucair.certification.pruebaguia.questions.Answer;
import co.com.choucair.certification.pruebaguia.tasks.FormInformation;
import co.com.choucair.certification.pruebaguia.tasks.OpenUp;
import co.com.choucair.certification.pruebaguia.tasks.RegisterUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;



public class UtestPageStepDefintions {


    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^Maria enter the page Utest\\.com$")
    public void mariaEnterThePageUtestCom() {
        OnStage.theActorCalled("Maria").wasAbleTo(OpenUp.thePage(),(RegisterUser.onThePage()));
    }


    @When("^She enter the information in the form de register$")
    public void sheEnterTheInformationInTheFormDeRegister() {
        OnStage.theActorInTheSpotlight().attemptsTo(FormInformation.onThePage());
        //OnStage.theActorInTheSpotlight().attemptsTo(FormInformation.onThePage(UstetData.getStrFirstname()));
    }


    @Then("^User created successfully Message (.*)$")
    public void userCreatedSuccessfullyMessageWelcomeToWorldSLargestCommunityOfFreelanceSoftwareTesters(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
