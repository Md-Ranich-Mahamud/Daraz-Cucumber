$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/verify_home_page.feature");
formatter.feature({
  "name": "Home Page Functionality",
  "description": "    As a general users, I want to search for products\n    So that I canbuy products that I like",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "name": "Verify Home page Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in Daraz.com.bd",
  "keyword": "Given "
});
formatter.match({
  "location": "stape_definitions.step_definition.i_am_in_Daraz_com_bd()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to view the logo in left top side",
  "keyword": "And "
});
formatter.match({
  "location": "stape_definitions.step_definition.i_want_to_view_the_logo_in_left_top_side()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to view the search bar in mid",
  "keyword": "And "
});
formatter.match({
  "location": "stape_definitions.step_definition.i_want_to_view_the_search_bar_in_mid()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "There must be a search button next to search bar",
  "keyword": "And "
});
formatter.match({
  "location": "stape_definitions.step_definition.there_must_be_a_search_button_next_to_search_bar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Also I want to view cart option",
  "keyword": "And "
});
formatter.match({
  "location": "stape_definitions.step_definition.also_I_want_to_view_cart_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i want a category option",
  "keyword": "Then "
});
formatter.match({
  "location": "stape_definitions.step_definition.i_want_a_category_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In Category there must be sixteen categories",
  "keyword": "And "
});
formatter.match({
  "location": "stape_definitions.step_definition.in_Category_there_must_be_sixteen_categories()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In landing page, there must be twelve menus in left side and assert every category",
  "keyword": "And "
});
formatter.match({
  "location": "stape_definitions.step_definition.in_landing_page_there_must_be_twelve_menus_in_left_side_and_assert_every_category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to pay,there must be shown five payment methods in the footer",
  "keyword": "When "
});
formatter.match({
  "location": "stape_definitions.step_definition.i_want_to_pay_there_must_be_shown_five_payment_methods_in_the_footer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Internationally Daraz is available in five countries and shows in footer",
  "keyword": "And "
});
formatter.match({
  "location": "stape_definitions.step_definition.internationally_Daraz_is_available_in_five_countries_and_shows_in_footer()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});