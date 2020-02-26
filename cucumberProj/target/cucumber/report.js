$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/home/TestFeature.feature");
formatter.feature({
  "name": "This is a sample feature file",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add Two Numbers",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "two numbers 10 and 15",
  "keyword": "Given "
});
formatter.match({
  "location": "com.home.stepDefinition1.inputNumbers(java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"sum\" should be 25",
  "keyword": "Then "
});
formatter.match({
  "location": "com.home.stepDefinition1.the_sum_should_be(java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Substract Two Numbers",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "two numbers 10 and 15",
  "keyword": "Given "
});
formatter.match({
  "location": "com.home.stepDefinition1.inputNumbers(java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"difference\" should be 5",
  "keyword": "Then "
});
formatter.match({
  "location": "com.home.stepDefinition1.the_sum_should_be(java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});