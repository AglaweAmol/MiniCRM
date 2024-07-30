package com.minicrm.service;

import com.minicrm.payload.AccountDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AccountService {

    AccountDTO createAccount(AccountDTO accountDTO);

    AccountDTO getAccountById(Long id);

    AccountDTO updateAccount(AccountDTO accountDTO,Long id);

    AccountDTO deleteByAccountId(Long id);

    Page<AccountDTO> getAllAccounts(Pageable pageable);


}
