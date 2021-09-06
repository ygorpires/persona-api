package com.example.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {
    HOME("Home"),
    MOBILE("Mobile"),
    COMERCIAL("Comercial");

    private String description;
}

