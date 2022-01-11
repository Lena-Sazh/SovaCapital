<p align="right">
<a href="https://visitor-badge-reloaded.herokuapp.com/badge?page_id=Lena-sazh.SovaCapital&color=47C8C4&style=plastic&logo=Github&text=Hello_Visitors!">
  <img src="https://visitor-badge-reloaded.herokuapp.com/badge?page_id=Lena-sazh.SovaCapital&color=47C8C4&style=plastic&logo=Github&text=Hello_Visitors!"/>
</a>
</p>

![Logo Light](/src/test/resources/images/Sova_white.svg#gh-dark-mode-only)
![Logo Dark](/src/test/resources/images/Sova_black.svg#gh-light-mode-only)

# Test Automation Project :owl:
  
## Simple automated UI tests examples for <a href="https://sovacapital.com">Sova Capital website</a>

![Main Page](/src/test/resources/images/Sova_Capital.png)
____

*DISCLAIMER*

*This project does not contain any confidential information, so it cannot be a matter of GDPR breach or any other legal abuse concern*
____

## :hammer_and_pick: Project stack

<code><img height="50" title="IntelliJ IDEA" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Intelij_IDEA.svg"></code>
<code><img height="50" title="Java" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Java.svg"></code>
<code><img height="50" title="JUnit 5" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/JUnit5.svg"></code>
<code><img height="50" title="Gradle" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Gradle.svg"></code>
<code><img height="50" title="Selenide" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Selenide.svg"></code>
<code><img height="50" title="GitHub" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Github.svg"></code>
<code><img height="50" title="Jenkins" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Jenkins.svg"></code>
<code><img height="50" title="Selenoid" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Selenoid.svg"></code>
<code><img height="50" title="Allure Report" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Allure_Report.svg"></code>
<code><img height="50" title="Allure TestOps" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Allure_EE.svg"></code>
<code><img height="50" title="Telegram" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Telegram.svg"></code>
<code><img height="50" title="Telegram" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Jira.svg"></code>
____

<!--
## Table of Contents

- [Implemented UI tests](##implemented-ui-tests)
- [Jenkins Job](##jenkins-job)
- [Allure Report](##allure-report)
- [Allure TestOps](##allure-testops)
- [Notifications](##notifications)
- [JIRA Task](##jira-task)
- [Video](##video)
-->

## :heavy_check_mark: Implemented UI tests 

* **Main Page:**
  - Opens correctly
  - All information blocks are present
  - All tabs are present
* **Portals:**
  - Research Portal login button are present
  - Smart login button are present
  - Sova Events login button are present
* **Search:**
  - Search by keywords are correct
* **Logs:**
  - Console have no errors

____

## :gear: Jenkins Job

To run <a href="https://jenkins.autotests.cloud/job/SovaCapital_Tests/">job</a> we can choose "Run with parameters" option and pass **target params** for tests

![Jenkins job](/src/test/resources/images/Jenkins_params.png)
  
Or we can use these commands:
  
- with filled remote.properties:
```bash
gradle clean test
```

- without filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

- serve Allure Report:
```bash
allure serve build/allure-results
```
____  

## :bar_chart: Allure Report

After each test run we have detailed report about recent and previous test executions with test artifacts, attachments, history and graphs
  
### Overview 

![Allure overview](/src/test/resources/images/Overview.png)
  
### Suites

![Allure suites](/src/test/resources/images/Report.png)

### Timelines

![Allure timeline](/src/test/resources/images/Timeline.png)

### Attachments
  
![Allure attachments](/src/test/resources/images/Allure_Attach.png)

____

## :card_index_dividers: Allure TestOps

<a href="https://allure.autotests.cloud/project/657/dashboards/">Here</a> we also can see detailed information about test runs, but in addition we can manage test cases and create new ones
  
### Test Cases
  
![Allure test cases](/src/test/resources/images/TestCases.png)

  
### Dashboard
  
![Allure dashboard](/src/test/resources/images/Dashboard.png)

  
### Graphs
  
![Allure graph](/src/test/resources/images/Graph.png)

  
### Launches
  
![Allure launches](/src/test/resources/images/Launches.png)

____
  
## :mailbox: Notifications

Test results are also send by Telegram bot `@Lemo_0nka_Alert_bot` as notifications with clickable link to Allure report
  
![Telegram bot](/src/test/resources/images/Bot.png)

____

## :pushpin: JIRA Task

All test cases and test results are integrated with <a href="https://jira.autotests.cloud/browse/AUTO-474">JIRA</a>
  
![JIRA task](/src/test/resources/images/Jira_task.png)

____

## :arrow_forward: Video

And finally as an example there is a short video report of test case execution
  
![Video report](/src/test/resources/images/Video.gif)
