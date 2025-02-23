package com.minicrm.controller;


import com.minicrm.payload.AccountDTO;
import com.minicrm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountController {


    @Autowired
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/accounts")
    private ResponseEntity<AccountDTO> createAccount(@RequestBody AccountDTO accountDTO)
    {
        return new ResponseEntity<>(accountService.createAccount(accountDTO), HttpStatus.CREATED);
    }


    @GetMapping("/accounts/{id}")
    private ResponseEntity<AccountDTO> getAccountById(@PathVariable(name="id") long id)
    {
        return ResponseEntity.ok(accountService.getAccountById(id));
    }

    @PutMapping("/accounts/{id}")
    private ResponseEntity<AccountDTO> updateAccountById(@RequestBody AccountDTO accountDTO,@PathVariable(name="id") long id)
    {
    AccountDTO accountDTO1=accountService.updateAccount(accountDTO,id);
        return new ResponseEntity<>(accountDTO1,HttpStatus.OK);
    }

    @GetMapping("/accounts")
    public ResponseEntity<Page<AccountDTO>> getAllAccounts(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<AccountDTO> accounts = accountService.getAllAccounts(pageable);
        return ResponseEntity.ok(accounts);
    }

}
