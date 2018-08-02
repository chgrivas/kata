package com.chgrivas.kata.playground;

import java.util.Date;

public class Statement {

  private Date statementDate;
  private StatementType statementType;
  private int amount;
  private int currentBalance;

  public Date getStatementDate() {
    return statementDate;
  }

  public void setStatementDate(Date statementDate) {
    this.statementDate = statementDate;
  }

  public StatementType getStatementType() {
    return statementType;
  }

  public void setStatementType(StatementType statementType) {
    this.statementType = statementType;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getCurrentBalance() {
    return currentBalance;
  }

  public void setCurrentBalance(int currentBalance) {
    this.currentBalance = currentBalance;
  }
}
