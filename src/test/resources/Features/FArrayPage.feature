@ArrayTest
Feature: Test Array page

  Scenario Outline: The user is able to navigate to all options in array page
    Given The user is on the "Array" after logged in
    When The user clicks "<options>" button
    Then The user in  "<options>" page
  Examples:
			|	options	|
			|	Arrays in Python	|  
 			|Arrays Using List |
 			|Basic Operations in Lists |	
 			|	Applications of Array |
 	
 	Scenario Outline: The user is able to navigate to all options in array page
    Given The user is on the "Array" after logged in
    When The user clicks "<options>" button
    And The user clicks tryEditor with a Run button to test on Arraypage
    Then The user in "tryEditor" page
  Examples:
 			|	options	|
			|	Arrays in Python	|  
 			|Arrays Using List |
 			|Basic Operations in Lists |	
 			|	Applications of Array |
 	
 	
 		Scenario Outline: The user is able run code in tryEditor 
    Given The user is in a "<options>" page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
		And The user clicks on run button
		Then The user should be presented with Run result
		 Examples: 
   		| options | Sheetname  | RowNumber |
      | Arrays in Python |array|  0 |
    	|Arrays Using List |array|0|
 			|Basic Operations in Lists |array|0|	
 			|	Applications of Array |array|0|

 		Scenario Outline: The user is able run code in tryEditor 
    Given The user is in a "<options>" page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
		And The user clicks on run button
		Then The user should be presented with error message
		 Examples: 
   		| options | Sheetname  | RowNumber |
      | Arrays in Python |array|  1 |
    	|Arrays Using List |array|1|
 			|Basic Operations in Lists |array|1|	
 			|	Applications of Array |array|1|
 			
  @Tag
  Scenario: The user is able to navigate to Practice page
  	Given The user is on the Arrays in Python after logged in
 		When The user clicks Practice Questions link
 		Then The user should be redirected to "practice" page
 		
 	
 Scenario Outline:The user is able to navigate to all practice questions
 		Given The user is on the Arrays in Python after logged in
 		When The user clicks Practice Questions link
 		Then The user should be redirected to "practice" page
		And The user should redirect to "<options>" practice question page
		Examples: 
   		|						 options 											| 			Sheetname  		|			 RowNumber		|
      | Search the array 												|	array		|				  0 				|
    	| Max Consecutive Ones 										|	array		|					0					|
 			|	Find Numbers with Even Number of Digits	|	array		|					0					|	
 			|	Squares of a Sorted Array 							|	array		|					0					|	
		
 		
 		Scenario Outline: The user is able to run code in Practice session of Array in python
 		Given The user is in a "<options>"  practice page having an tryEditor with a Run button to test
 		When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
 		And The user clicks on run button
 		Then The user should be presented with Run result
 		 Examples: 
   		|						 options 											| 			Sheetname  		|			 RowNumber		|
      | Search the array 												|	array		|				  0 				|
    	| Max Consecutive Ones 										|	array		|					0					|
 			|	Find Numbers with Even Number of Digits	|	array		|					0					|	
 			|	Squares of a Sorted Array 							|	array		|					0					|	
 
 
 Scenario Outline: The user is able to run code in tryEditor for Practice session of Array in python
 		Given The user is in a "<options>"  practice page having an tryEditor with a Run button to test
 		When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
 		And The user clicks on run button
 		And The user clicks on submit
		Then The user should be presented with Run result
		 Examples: 
   		|						 options 											| 			Sheetname  		|			 RowNumber		|
      | Search the array 												|	array		|				  0 				|
    	| Max Consecutive Ones 										|	array		|					0					|
 			|	Find Numbers with Even Number of Digits	|	array		|					0					|	
 			|	Squares of a Sorted Array 							|	array		|					0				|	

 Scenario Outline: The user is able to run invald code in tryEditor for Practice session of Array in python
 		Given The user is in a "<options>"  practice page having an tryEditor with a Run button to test
 		When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
 		And The user clicks on run button
 		Then The user should be presented with error message
		 Examples: 
   		|						 options 											| 			Sheetname  		|			 RowNumber		|
      | Search the array 												|	array		|				  1 				|
    	| Max Consecutive Ones 										|	array		|					1					|
 			|	Find Numbers with Even Number of Digits	|	array		|			    1					|	
 			|	Squares of a Sorted Array 							|	array		|					1			  	|	
 
  