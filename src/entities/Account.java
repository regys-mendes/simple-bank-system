package entities;


import services.OperationsBalance;

public class Account {

    private String name;
    private String password;
    private String email;

    private OperationsBalance op;
    private TaxAccount taxAccount;

    public Account(String name, String password, String email, TaxAccount taxAccount) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.taxAccount = taxAccount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TaxAccount getTaxAccount() {
        return taxAccount;
    }
}
