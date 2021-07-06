package model;

public class Owner extends Usuario{ // Con extend se especifica que Owner hereda de Usuario
    private Wallet wallet;

    public Owner(String nNombre) {
        super();
        wallet = new Wallet(true, true);
        setNombre(nNombre);
    }

    public Wallet getWallet() {
        return wallet;
    }
}
