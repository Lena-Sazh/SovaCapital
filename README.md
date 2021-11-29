![Logo Light](https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Sova_white.svg#gh-dark-mode-only)
![Logo Dark](https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Sova_black.svg#gh-light-mode-only)

## UI Test Automation Project :owl:
  
### Simple manual & automated tests examples for <a href="https://sovacapital.com">Sova Capital site</a>
____

*DISCLAIMER*

*This project does not contain any confidential information, so it cannot be a matter of any GDPR breach or other legal abuse concern*
____

### :hammer_and_pick: Project stack

<code><img height="30" title="IntelliJ IDEA" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Intelij_IDEA.svg"></code>
<code><img height="30" title="Java" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Java.svg"></code>
<code><img height="30" title="JUnit 5" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/JUnit5.svg"></code>
<code><img height="30" title="Gradle" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Gradle.svg"></code>
<code><img height="30" title="Selenide" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Selenide.svg"></code>
<code><img height="30" title="GitHub" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Github.svg"></code>
<code><img height="30" title="Jenkins" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Jenkins.svg"></code>
<code><img height="30" title="Selenoid" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Selenoid.svg"></code>
<code><img height="30" title="Allure Report" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Allure_Report.svg"></code>
<code><img height="30" title="Allure TestOps" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Allure_EE.svg"></code>
<code><img height="30" title="Telegram" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Telegram.svg"></code>
____

### :gear: Jenkins job
To run <a href="https://jenkins.autotests.cloud/job/SovaCapital_Tests/">job</a> we can choose "Run with parameters" option and pass **target params** for tests

<p align="left">
<img height="600" title="Jenkins job" src="https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Jenkins_params.png">
<p>
  
Or we can use these commands:
  
#### - with filled remote.properties:
```bash
gradle clean test
```

#### - without filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

#### - serve Allure report:
```bash
allure serve build/allure-results
```
____  

### :bar_chart: Allure Report

After each test run we have detailed report about recent and previous test executions with test artifacts, attachments, history and graphs
  
#### Overview 
<p align="left">
<img height="300" title="Allure overview" src="https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Overview.png">
<p>  
  
#### Suites
<p align="left">
<img height="350" title="Allure suites" src="https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Report.png">
<p> 

#### Timelines
<p align="left">
<img height="250" title="Allure timeline" src="https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Timeline.png">
<p> 
  
#### Attachments
<p align="left">
<img height="350" title="Allure attachments" src="https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Allure_Attach.png">
<p>

### :card_index_dividers: Allure TestOps

Here we also can see detailed information about test runs, but in addition we can manage test cases and create new ones
  
#### Test Cases
<p align="left">
<img height="350" title="Allure test cases" src="https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/TestCases.png">
<p>
  
#### Dashboard
<p align="left">
<img height="350" title="Allure dashboard" src="https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Dashboard.png">
<p>
  
#### Graphs
<p align="left">
<img height="300" title="Allure graph" src="https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Graph.png">
<p>
  
#### Launches
<p align="left">
<img height="350" title="Allure launches" src="https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Launches.png">
<p>
  
### :mailbox: Telegram Bot

Test results are also send by Telegram bot as notifications with clickable link to Allure report
  
<p align="left">
<img height="400" title="Telegram bot" src="https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Bot.png">
<p>

### :arrow_forward: Video report example

And finally there is a short video report of test case execution

<p align="left">
<img height="400" title="Video report" src="https://github.com/Lena-Sazh/SovaCapital/blob/master/src/test/resources/images/Video.gif">
<p>
