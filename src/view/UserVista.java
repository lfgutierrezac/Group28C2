package view;

import model.Owner;

public class UserVista {
    
    public static void main(String[] args) {
        Owner owner1 = new Owner("Susen");
        Owner owner2 = new Owner("Luisa");
        System.out.println(owner1.getNombre());
        System.out.println(owner2.getNombre());
        owner1.getWallet().putSaldo(100000);
    }
}
