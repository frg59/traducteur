Feature: compare two words not written in the same way 

 Scenario: matches same word
   Given input "azertyeee"
   When compare to "azERtyEEE"
   Then MATCH    
    
 Scenario: Asslema and 3aslema
   Given input "Asslema"
   When compare to "3aslema"
   Then MATCH
   
  Scenario: ana and ena
   Given input "ana"
   When compare to "ena"
   Then MATCH
  
  Scenario: enti and inti
   Given input "enti"
   When compare to "inti"
   Then MATCH
   
  Scenario: k and 9
   Given input "kawa"
   When compare to "9awa"
   Then MATCH
   
  Scenario: 2a and a
   Given input "2a"
   When compare to "a"
   Then MATCH
      
  Scenario: 5 and R  
   Given input "Ramsa"
   When compare to "5amsa"
   Then MATCH   
   
  Scenario: Gh and R
   Given input "Ghodwa"
   When compare to "Rodwa"
   Then MATCH
   
  Scenario: KH and R
   Given input "okht"
   When compare to "ort"
   Then MATCH
      
  Scenario: w and ou
   Given input "w"
   When compare to "ou"
   Then MATCH
   
  Scenario: 7 and h
   Given input "7"
   When compare to "h"
   Then MATCH
   
  Scenario: 7 and hh
   Given input "7"
   When compare to "hh"
   Then MATCH   
   