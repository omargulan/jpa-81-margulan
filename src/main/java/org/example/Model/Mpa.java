package org.example.Model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Mpa {
    G("для всех возростов"),
    PG("Рекомендуется присутствие родителей"),
    PG_13("Детям до 13 лет просмотр не желателен"),
    NC_17("Лицам до 18 лет просмотр запрещен"),
    R("Лицам до 17 лет обязательно присутствие взрослого");
    private  final String displayName;


}
