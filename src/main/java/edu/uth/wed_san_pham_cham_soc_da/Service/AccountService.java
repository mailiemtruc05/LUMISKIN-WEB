package edu.uth.wed_san_pham_cham_soc_da.Service;

import edu.uth.wed_san_pham_cham_soc_da.models.Account;
import edu.uth.wed_san_pham_cham_soc_da.models.Roles;

import java.util.List;
import java.util.Optional;


public interface AccountService {
    public void registerAccount(Account account);
    Account findByUsername(String username);
    Account findByEmail(String email);
    Account findById(Integer id);
    List<Account> findAllAccounts();
    Optional<Account> findAccountByUsername(String username);
    void updateAccount(Account account);

}
