package com.ouchin.exception;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(Long id) {
        super("Entity not found with id: " + id);
    }
}
