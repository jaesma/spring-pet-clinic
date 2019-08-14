package com.manalangjames.app.services;

import com.manalangjames.app.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
