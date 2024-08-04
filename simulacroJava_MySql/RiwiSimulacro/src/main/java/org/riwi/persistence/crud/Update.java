package org.riwi.persistence.crud;

public interface Update <Entity, Id>{
    public Entity update(Entity entity, Id id);
}
