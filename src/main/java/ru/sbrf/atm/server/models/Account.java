package ru.sbrf.atm.server.models;

import ru.sbrf.atm.client.devices.Card;
import ru.sbrf.atm.server.enums.Currency;

public abstract class Account {
    private long id;
    private Currency currency;
    private long balance;
    private Card card = null;
}
