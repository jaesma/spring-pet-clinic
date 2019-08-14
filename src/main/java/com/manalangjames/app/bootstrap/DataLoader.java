package com.manalangjames.app.bootstrap;

import com.manalangjames.app.model.Owner;
import com.manalangjames.app.model.Vet;
import com.manalangjames.app.services.OwnerService;
import com.manalangjames.app.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        Owner owner2 = new Owner();
        owner2.setFirstName("Fionaasdasd");
        owner2.setLastName("Glenna");
        ownerService.save(owner1);
        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstName("James");
        owner3.setLastName("Manalang");
        ownerService.save(owner3);
        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet1);

        System.out.println("Loaded Vets...");

    }
}
