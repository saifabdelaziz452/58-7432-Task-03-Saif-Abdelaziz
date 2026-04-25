package com.scalable.task03.dto;

import org.jspecify.annotations.Nullable;

public record LoginRequest(String email, String password) {
    public String getEmail() {
        return null;
    }

    public @Nullable CharSequence getPassword() {
        return null;
    }
}
