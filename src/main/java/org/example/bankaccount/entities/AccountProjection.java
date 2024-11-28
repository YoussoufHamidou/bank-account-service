package org.example.bankaccount.entities;
import org.example.bankaccount.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = BankAccount.class,name = "p1")
public interface AccountProjection {
  public String getID();
  public AccountType getType();
  public double getBalance();
}
