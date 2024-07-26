package com.minicrm.serviceImpl;

import com.minicrm.entity.Account;
import com.minicrm.entity.Leads;
import com.minicrm.exception.ResourceNotFoundException;
import com.minicrm.payload.AccountDTO;
import com.minicrm.payload.LeadDTO;
import com.minicrm.repository.AccountRepository;
import com.minicrm.service.AccountService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImpl implements AccountService {


    private AccountRepository accountRepository;

    private ModelMapper mapper;

    public AccountServiceImpl(AccountRepository accountRepository, ModelMapper mapper) {
        this.accountRepository = accountRepository;
        this.mapper = mapper;
    }

    @Override
    public AccountDTO createAccount(AccountDTO accountDTO) {
        Account account=MapToEntity(accountDTO);
        Account account1=accountRepository.save(account);
        AccountDTO accountResponse=mapToDto(account1);
        return accountResponse;
    }

    @Override
    public AccountDTO getAccountById(Long id) {
        Account account=accountRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(""));
        return mapToDto(account);
    }

    @Override
    public AccountDTO updateAccount(AccountDTO accountDTO, Long id) {
        Account account=accountRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(""));
        account.setAccountId(accountDTO.getAccountId());
        account.setAccountName(accountDTO.getAccountName());
        account.setAccountOwner(accountDTO.getAccountOwner());
        account.setAccountSite(accountDTO.getAccountSite());
        account.setFax(accountDTO.getFax());
        account.setBillingAddress(accountDTO.getBillingAddress());
        account.setShippingAddress(accountDTO.getShippingAddress());
        account.setPhone(accountDTO.getPhone());
        Account updateAccount1=accountRepository.save(account);
        return mapToDto(updateAccount1);
    }

    @Override
    public AccountDTO deleteByAccountId(Long id) {

        Account account=accountRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(""));
         accountRepository.delete(account);
        return mapToDto(account);
    }



    private AccountDTO mapToDto(Account account)
    {
        AccountDTO accountDTO=mapper.map(account,AccountDTO.class);
        return accountDTO;
    }
    private Account MapToEntity(AccountDTO accountDTO)
    {
        Account account=mapper.map(accountDTO,Account.class);
        return account;
    }


}
