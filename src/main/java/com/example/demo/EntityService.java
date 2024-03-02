package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface EntityService {

    Entity saveEntity(Entity entity);

    Optional<Entity> getEntityById(String id);

    List<Entity> getAllEntities();

    void deleteEntityById(String id);

    // Add more methods as needed for your application's requirements
}
