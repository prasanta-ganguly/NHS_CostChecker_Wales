$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/CostChecket_NHS_Wales.feature");
formatter.feature({
  "name": "NHS Cost Checker for Wales",
  "description": "  To test the NHS cost for people from Wales",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Checking NHS costs for people from Wales with multiple data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am a person from Wales",
  "keyword": "Given "
});
formatter.step({
  "name": "I put my circumstances into \u003cDay\u003e, \u003cMonth\u003e, \u003cYear\u003e, \u003cLiving_With_Partner\u003e, \u003cClaim_Benefit_Tax\u003e, \u003cIs_Pregnant\u003e, \u003cInjury_Illness\u003e, \u003cIs_Diabetes\u003e, \u003cIs_Glaucoma\u003e, \u003cLivein_Carehome\u003e, \u003cGetHelpFor_CoucilTax\u003e, \u003cSavings_MoreThan_16000\u003e, \u003cSavings_MoreThan_24000\u003e the Checker tool",
  "keyword": "When "
});
formatter.step({
  "name": "I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Day",
        "Month",
        "Year",
        "Living_With_Partner",
        "Claim_Benefit_Tax",
        "Is_Pregnant",
        "Injury_Illness",
        "Is_Diabetes",
        "Is_Glaucoma",
        "Livein_Carehome",
        "GetHelpFor_CoucilTax",
        "Savings_MoreThan_16000",
        "Savings_MoreThan_24000"
      ]
    },
    {
      "cells": [
        "10",
        "10",
        "1990",
        "No",
        "No",
        "No",
        "No",
        "No",
        "No",
        "No",
        "No",
        "No",
        ""
      ]
    },
    {
      "cells": [
        "05",
        "02",
        "1980",
        "Yes",
        "No",
        "Yes",
        "Yes",
        "No",
        "Yes",
        "No",
        "No",
        "Yes",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Checking NHS costs for people from Wales with multiple data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a person from Wales",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.CostChecker_NHS_Wales.i_am_a_person_from_Wales()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I put my circumstances into 10, 10, 1990, No, No, No, No, No, No, No, No, No,  the Checker tool",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.CostChecker_NHS_Wales.i_put_my_circumstances_into_Day_Month_Year_Living_With_Partner_Claim_Benefit_Tax_Is_Pregnant_Injury_Illness_Is_Diabetes_Is_Glaucoma_Livein_Carehome_GetHelpFor_CoucilTax_Savings_MoreThan_16000_Savings_MoreThan_24000_the_Checker_tool(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.CostChecker_NHS_Wales.i_should_get_a_result_of_whether_I_will_get_help_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Checking NHS costs for people from Wales with multiple data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a person from Wales",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.CostChecker_NHS_Wales.i_am_a_person_from_Wales()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I put my circumstances into 05, 02, 1980, Yes, No, Yes, Yes, No, Yes, No, No, Yes,  the Checker tool",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.CostChecker_NHS_Wales.i_put_my_circumstances_into_Day_Month_Year_Living_With_Partner_Claim_Benefit_Tax_Is_Pregnant_Injury_Illness_Is_Diabetes_Is_Glaucoma_Livein_Carehome_GetHelpFor_CoucilTax_Savings_MoreThan_16000_Savings_MoreThan_24000_the_Checker_tool(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.CostChecker_NHS_Wales.i_should_get_a_result_of_whether_I_will_get_help_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Under 16 year old",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am a person from Wales",
  "keyword": "Given "
});
formatter.step({
  "name": "I declare my circumstances into \u003cDay\u003e, \u003cMonth\u003e, \u003cYear\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Day",
        "Month",
        "Year"
      ]
    },
    {
      "cells": [
        "05",
        "03",
        "2010"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Under 16 year old",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a person from Wales",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.CostChecker_NHS_Wales.i_am_a_person_from_Wales()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I declare my circumstances into 05, 03, 2010",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.CostChecker_NHS_Wales.i_declare_my_circumstances_into_Day_Month_Year(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.CostChecker_NHS_Wales.i_should_get_a_result_of_whether_I_will_get_help_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "For school-college-university students",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am a person from Wales",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter values into \u003cDay\u003e, \u003cMonth\u003e, \u003cYear\u003e, \u003cFull_Time_Education\u003e, \u003cLiving_With_Partner\u003e, \u003cClaim_Benefit_Tax\u003e, \u003cIs_Pregnant\u003e, \u003cInjury_Illness\u003e, \u003cIs_Diabetes\u003e, \u003cIs_Glaucoma\u003e, \u003cLivein_Carehome\u003e, \u003cGetHelpFor_CoucilTax\u003e, \u003cSavings_MoreThan_16000\u003e, \u003cSavings_MoreThan_24000\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Day",
        "Month",
        "Year",
        "Full_Time_Education",
        "Living_With_Partner",
        "Claim_Benefit_Tax",
        "Is_Pregnant",
        "Injury_Illness",
        "Is_Diabetes",
        "Is_Glaucoma",
        "Livein_Carehome",
        "GetHelpFor_CoucilTax",
        "Savings_MoreThan_16000",
        "Savings_MoreThan_24000"
      ]
    },
    {
      "cells": [
        "02",
        "11",
        "2003",
        "No",
        "No",
        "No",
        "No",
        "No",
        "No",
        "No",
        "No",
        "No",
        "No",
        ""
      ]
    },
    {
      "cells": [
        "12",
        "08",
        "2002",
        "No",
        "Yes",
        "No",
        "Yes",
        "Yes",
        "No",
        "Yes",
        "No",
        "No",
        "Yes",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "For school-college-university students",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a person from Wales",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.CostChecker_NHS_Wales.i_am_a_person_from_Wales()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter values into 02, 11, 2003, No, No, No, No, No, No, No, No, No, No, ",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.CostChecker_NHS_Wales.i_put_my_circumstances_into_Day_Month_Year_Full_Time_Education_Living_With_Partner_Claim_Benefit_Tax_Is_Pregnant_Injury_Illness_Is_Diabetes_Is_Glaucoma_Livein_Carehome_GetHelpFor_CoucilTax_Savings_MoreThan_16000_Savings_MoreThan_24000_the_Checker_tool(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.CostChecker_NHS_Wales.i_should_get_a_result_of_whether_I_will_get_help_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "For school-college-university students",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a person from Wales",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.CostChecker_NHS_Wales.i_am_a_person_from_Wales()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter values into 12, 08, 2002, No, Yes, No, Yes, Yes, No, Yes, No, No, Yes, ",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.CostChecker_NHS_Wales.i_put_my_circumstances_into_Day_Month_Year_Full_Time_Education_Living_With_Partner_Claim_Benefit_Tax_Is_Pregnant_Injury_Illness_Is_Diabetes_Is_Glaucoma_Livein_Carehome_GetHelpFor_CoucilTax_Savings_MoreThan_16000_Savings_MoreThan_24000_the_Checker_tool(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.CostChecker_NHS_Wales.i_should_get_a_result_of_whether_I_will_get_help_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});