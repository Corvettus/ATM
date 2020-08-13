package ru.sbrf.atm.client.devices;

import ru.sbrf.atm.server.models.Account;
import ru.sbrf.atm.server.models.User;

import java.util.Currency;
import java.util.Map;

public class Card {
    private String number;
    private String owner;
    private short validity;
    private short CVC;
    private short PIN;

    private User user;
    private Map <Currency, Account> accounts;
}
