package com.chgrivas.kata.playground;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Account {

  private AccountPrinter accountPrinter;
  private int balance = 0;
  private List<Statement> statements = new ArrayList<>();

  public Account(AccountPrinter accountPrinter) {
    this.
    statements.add("date || credit || debit || balance");
  }

  public Account(Console console) {

  }

  void deposit(int amount) {
    Date date = new Date();
    balance += deposit;
    statements.add(date.toString() + " ||")
  }

  void withdraw(int amount) {

  }

  void printStatement() {
    accountPrinter.print(statements);
  }
}
