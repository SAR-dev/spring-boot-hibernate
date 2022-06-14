package fmh.controller;

import fmh.models.Account;
import fmh.models.Location;
import fmh.models.Post;
import fmh.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/account")
    public Account addAccount(@RequestBody Account account) {
        return accountService.addAccount(account);
    }

    @GetMapping("/account/list")
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/account/{id}")
    public Optional<Account> getAccountById(@PathVariable Integer id) {
        return accountService.getAccountById(id);
    }

    @GetMapping("/account/{id}/posts")
    public List<Post> getPostsByAccountId(@PathVariable Integer id){
        Optional<Account> account = accountService.getAccountById(id);
        if(account.isPresent()) {
            return  account.get().getPosts();
        }
        return null;
    }

    @GetMapping("/account/location/{id}")
    public List<Account> getAccountsByLocationId(@PathVariable Integer id) {
        return accountService.getAccountsByLocationId(id);
    }
}
