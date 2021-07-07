package model;

public class Company extends Usuario{ // Con extend se especifica que Company hereda de Usuario
    private Wallet wallet;

    public Company(String nNombre) {
        super();
        wallet = new Wallet(false);
        setNombre(nNombre);
    }

    public Wallet myWallet() {
        return wallet;
    }
}
