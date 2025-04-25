package edu.uth.wed_san_pham_cham_soc_da.Service;
import edu.uth.wed_san_pham_cham_soc_da.models.Account;
import edu.uth.wed_san_pham_cham_soc_da.models.AccountRole;
import edu.uth.wed_san_pham_cham_soc_da.models.Roles;
import edu.uth.wed_san_pham_cham_soc_da.repository.AccountRepository;
import edu.uth.wed_san_pham_cham_soc_da.repository.AccountRoleRepository;
import edu.uth.wed_san_pham_cham_soc_da.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AccountServiceiml implements AccountService {

    @Autowired
    private AccountRepository aRepo;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    AccountRoleRepository accountRoleRepository;

    @Autowired
    public AccountServiceiml(AccountRepository accountRepository) {
        this.aRepo = accountRepository;
    }

    @Override
    public Account findByUsername(String username) {
        return aRepo.findByUsername(username);
    }

    @Override
    public Account findByEmail(String email) {
        return aRepo.findByEmail(email);
    }

    @Override
    public Account findById(Integer id) {
        return aRepo.findById(id).orElse(null);
    }

    public Optional<Account> findAccountByUsername(String username){
        return aRepo.findAccountByUsername(username);
    }
    @Override
    public void registerAccount(Account account) {
        if (aRepo.findAccountByUsername(account.getUsername()).isPresent()) {
            throw new RuntimeException("Đã tồn tại username này rồi!");
        }


        // Mã hóa mật khẩu trước khi lưu
        account.setPassword(passwordEncoder.encode(account.getPassword()));
        Roles role = roleRepository.findRolesByName("KHACH").orElseThrow(() -> new RuntimeException("Role KHACH không tồn tại!"));

        AccountRole accountRole = new AccountRole(aRepo.save(account), role);
        accountRoleRepository.save(accountRole);
        aRepo.save(account);


    }

    @Override
    public List<Account> findAllAccounts(){
        return aRepo.findAll();
    }

    @Override
    public void updateAccount(Account account) {
        aRepo.save(account);
    }


}
