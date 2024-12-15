package org.badis;

import proxy.BanqueService;
import proxy.BanqueService_Service;
import proxy.Compte;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BanqueService service = new BanqueService_Service().getBanqueServicePort();
        System.out.println("Tester la conversion");
        System.out.println(service.conversionEuroToMad(1000));
        System.out.println("--------------------------------");
        System.out.println("Tester Get compte");
        Compte compte = service.getCompte(1);
        System.out.println("Compte code: " + compte.getCode());
        System.out.println("Solde: " + compte.getSolde());
        System.out.println("Date de creation: " + compte.getDateCreation());
        System.out.println("--------------------------------");
        System.out.println("Tester la liste des comptes");
        List<Compte> comptes = service.listComptes();
        comptes.forEach(c ->
        {
            System.out.println("Compte code: " + c.getCode());
            System.out.println("Solde: " + c.getSolde());
            System.out.println("Date de creation: " + c.getDateCreation());
        });

    }
}