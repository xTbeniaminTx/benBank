package com.front.bank.userfrontbank.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.math.BigDecimal;
import java.util.List;

public class SavingsAccount {

  private Long id;
  private int accountNumber;
  private BigDecimal accountBalance;

//  @OneToMany(mappedBy = "savingsAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//  @JsonIgnore
  private List<SavingsTransaction> savingsTransactionList;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public BigDecimal getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(BigDecimal accountBalance) {
    this.accountBalance = accountBalance;
  }

  public List<SavingsTransaction> getSavingsTransactionList() {
    return savingsTransactionList;
  }

  public void setSavingsTransactionList(List<SavingsTransaction> savingsTransactionList) {
    this.savingsTransactionList = savingsTransactionList;
  }
}
