package com.chgrivas.kata.playground;

import java.util.List;

public class AccountPrinter {

  public void print(List<Statement> statementsList) {
    statementsList.forEach(this::printStatement);
  }

  private void printStatement(Statement statement) {
    if (StatementType.DEPOSIT.equals(statement.getStatementType())) {
      printDepositStatement(statement);
    }
    printWithdrawStatement(statement);
  }

  private void printWithdrawStatement(Statement statement) {
    System.out.println("")
  }

  private void printDepositStatement(Statement statement) {
  }
}
