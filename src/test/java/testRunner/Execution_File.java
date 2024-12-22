package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {".//FeatureFile/SmokeTest/001_Login.feature", ".//FeatureFile/SmokeTest/002_Create_opportunity.feature", ".//FeatureFile/SmokeTest/003_Qoute_and_Proposal.feature", ".//FeatureFile/SmokeTest/004_Project.feature", ".//FeatureFile/SmokeTest/005_Change_Orders.feature"},
				  //features= {".//FeatureFile/SmokeTest/"},
				 //features= {".//FeatureFile/001_Login.feature"},
				 //features= {".//FeatureFile/Createnewopp.feature"},
	              //features= {".//FeatureFile/Sanity_and_Smoke_Test.feature"}, 	
                 //features= {"@target/rerun.txt"},    

				   
                 glue= "stepDefinitions",
                 
                 plugin={ "pretty", "html:reports/myreport.html", "rerun:target/rerun.txt", "json:target/cucumber-reports/cucumber.json",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 
                 dryRun=false,
                 
                 monochrome=true,
                 
                 publish=true
                     
                                                                                                           )
public class Execution_File {

}
