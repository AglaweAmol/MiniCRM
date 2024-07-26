package com.minicrm.service;

import com.minicrm.payload.AccountDTO;

public interface AccountService {

    AccountDTO createAccount(AccountDTO accountDTO);

    AccountDTO getAccountById(Long id);

    AccountDTO updateAccount(AccountDTO accountDTO,Long id);

    AccountDTO deleteByAccountId(Long id);


}
