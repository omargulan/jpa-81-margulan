package org.example.Model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Role {
    USER("Пользователь"),
    MODER("Модератор"),
    ADMIN("Администратор"),
    OWNER("Владелец");
    private final String displayName;
}
