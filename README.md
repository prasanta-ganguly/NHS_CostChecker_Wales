# NHS_CostChecker_Wales
This is a Maven project in BDD approach using Java and Cucumber

# Execute in your local:
1.	Clone this project to the desired location of your machine
2.	Open your CLI and go to the folder of the project
3.	And use command “mvn clean install” to run the project
4.  Check index.html under target -> HTMLReports to see the test result

# Execute in Jenkins:
1.	Create a new item and select Maven project
2.	Go to configure and select Source Code Management = GIT
3.	Enter Repository URL = https://github.com/prasanta-ganguly/NHS_CostChecker_Wales
4.	Branch Specifier = */master
5.	Under the build, Root POM = pom.xml
6.	Goals and options = clean install and save & apply
7.	Open the project from dashboard and click on Build Now
