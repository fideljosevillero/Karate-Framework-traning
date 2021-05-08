Feature: quotes

  Background:
    * url 'http://localhost:8080'

  Scenario: Fetch random quote

    #Given url 'http://localhost:8080/algo'
    Given path '/algo'
    When method GET
    Then status 200
    And match $ == {id:'#notnull', date:'#notnull', city: #notnull, address: #notnull}
