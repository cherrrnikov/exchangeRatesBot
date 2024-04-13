package com.chernikov.springExchangeRatesBot.service;

import com.chernikov.springExchangeRatesBot.exception.ServiceException;

public interface ExchangeRatesService {
    String getUSDExchangeRate() throws ServiceException;
    String getEURExchangeRate() throws ServiceException;
    void clearUSDCache();

    void clearEURCache();
}
