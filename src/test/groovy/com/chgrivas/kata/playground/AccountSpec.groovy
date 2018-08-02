package com.chgrivas.kata.playground

import spock.lang.Specification


class AccountSpec extends Specification {

  def "I can make a deposit in my account"() {
    given:
      Console console = new Console()
      Account account = new Account(console)
    when:
      account.deposit(1000)
      account.deposit(2000)
      account.withdraw(500)
      account.printStatement()
    then:
      console.values.size() == 4
      console.values.get(0) == "date || credit || debit || balance"
      console.values.get(1) == "14/01/2012 || || 500.00 || 2500.00"
      console.values.get(2) == "13/01/2012 || 2000.00 || || 3000.00"
      console.values.get(3) == "10/01/2012 || 1000.00 || || 1000.00"
  }
}
