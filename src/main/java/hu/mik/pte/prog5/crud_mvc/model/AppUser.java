package hu.mik.pte.prog5.crud_mvc.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Set;

public record AppUser (
        String username,
        String passwordHash,
        Set<String> roles) {
}
