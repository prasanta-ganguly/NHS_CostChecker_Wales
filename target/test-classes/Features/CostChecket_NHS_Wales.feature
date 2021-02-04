Feature: NHS Cost Checker for Wales
  To test the NHS cost for people from Wales
  
  
  #Scenario 1: with parameterization
  Scenario Outline: Checking NHS costs for people from Wales with multiple data
    Given I am a person from Wales
    When I put my circumstances into <Day>, <Month>, <Year>, <Living_With_Partner>, <Claim_Benefit_Tax>, <Is_Pregnant>, <Injury_Illness>, <Is_Diabetes>, <Is_Glaucoma>, <Livein_Carehome>, <GetHelpFor_CoucilTax>, <Savings_MoreThan_16000>, <Savings_MoreThan_24000> the Checker tool
    Then I should get a result of whether I will get help or not

    Examples: 
      | Day | Month | Year | Living_With_Partner | Claim_Benefit_Tax | Is_Pregnant | Injury_Illness | Is_Diabetes | Is_Glaucoma | Livein_Carehome | GetHelpFor_CoucilTax | Savings_MoreThan_16000 | Savings_MoreThan_24000 |
      |  10 |    10 | 1990 | No                  | No                | No          | No             | No          | No          | No              |        No             | No                     |                        |
      |  05 |    02 | 1980 | Yes                 | No                | Yes         | Yes            | No          | Yes         | No              |        No             | Yes                    |                        |


  #Scenario : 2
  Scenario Outline: Under 16 year old
    Given I am a person from Wales
    When I declare my circumstances into <Day>, <Month>, <Year>
    Then I should get a result of whether I will get help or not

    Examples: 
      | Day | Month | Year |
      |  05 |    03 | 2010 |


  #Scenario : 3
  Scenario Outline: For school-college-university students
    Given I am a person from Wales
    When I enter values into <Day>, <Month>, <Year>, <Full_Time_Education>, <Living_With_Partner>, <Claim_Benefit_Tax>, <Is_Pregnant>, <Injury_Illness>, <Is_Diabetes>, <Is_Glaucoma>, <Livein_Carehome>, <GetHelpFor_CoucilTax>, <Savings_MoreThan_16000>, <Savings_MoreThan_24000>
    Then I should get a result of whether I will get help or not

    Examples: 
      | Day | Month | Year | Full_Time_Education | Living_With_Partner | Claim_Benefit_Tax | Is_Pregnant | Injury_Illness | Is_Diabetes | Is_Glaucoma | Livein_Carehome | GetHelpFor_CoucilTax | Savings_MoreThan_16000 | Savings_MoreThan_24000 |
      |  02 |    11 | 2003 | No                  | No                  | No                | No          | No             | No          | No          | No              | No                   | No                     |                        |
      |  12 |    08 | 2002 | No                  | Yes                 | No                | Yes         | Yes            | No          | Yes         | No              | No                   | Yes                    |                        |
