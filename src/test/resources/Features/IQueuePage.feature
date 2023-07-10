@QueuePageTest
Feature: Testing queue page


  Scenario: User selects the Graph item and verifies the Page Title 
    Given user is on Home Page
    And user clicks the queue getstart link 
    Then user is on the queue Page 
    Then user checks for the title "Queue" in the queue page  
    
   
  Scenario Outline: User checks each of the topics in Graph with valid python code
    Given user clicks the queue getstart link 
    When The user select all option "<option>" from the queue page and Verifies the tryeditor Page with the valid python code for each option  "<sheetName>" and <Rownumber>     
    Then user should be presented with the run result in the screen "<outputresult>"
    Examples:
      | option                           			| sheetName                | Rownumber|outputresult|
      | Implementation of Queue in Python			| LLIntroduction           |   0      | hello world |
      | Implementation using collections.deque| LLCLinkedList            |   0      | hello world |
    	| Implementation using collections.deque| LLCLinkedList            |   0      | hello world |
    	| Implementation using array						| LLCLinkedList            |   0      | hello world |
    	| Queue Operations                      | LLCLinkedList            |   0      | hello world |
  
Scenario Outline: User checks each of the topics in Graph with invalid python code
    Given user clicks the queue getstart link 
    When The user select all option "<option>" and Verifies the tryeditor Page with the Invalid python code for each option  "<sheetName>" and <Rownumber>  in the queue page   
    Then user should get the "<erroroutput>" on the screen 
     Examples:
      | option                           			| sheetName                | Rownumber|outputresult|
      | Implementation of Queue in Python			| LLIntroduction           |   1      | hello world |
      | Implementation using collections.deque| LLCLinkedList            |   1      | hello world |
    	| Implementation using collections.deque| LLCLinkedList            |   1      | hello world |
    	| Implementation using array						| LLCLinkedList            |   1      | hello world |
    	| Queue Operations                      | LLCLinkedList            |   1      | hello world |