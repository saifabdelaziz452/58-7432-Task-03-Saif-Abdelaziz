package com.scalable.task03.dto;

import com.scalable.task03.model.Role;
import org.jspecify.annotations.Nullable;

public record RegisterRequest(String name, String email, String password) {
    public String getEmail() {
        return null;
    }

    public Role getRole() {
        return null;
    }

    public @Nullable CharSequence getPassword() {
        return null;
    }
}
