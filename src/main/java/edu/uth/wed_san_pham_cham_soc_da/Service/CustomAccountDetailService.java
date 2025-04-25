package edu.uth.wed_san_pham_cham_soc_da.Service;
import edu.uth.wed_san_pham_cham_soc_da.models.Account;
import edu.uth.wed_san_pham_cham_soc_da.models.AccountRole;
import edu.uth.wed_san_pham_cham_soc_da.models.CustomAccountDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class CustomAccountDetailService implements UserDetailsService {
    @Autowired
    private AccountService accountService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("Đang kiểm tra user: " + username);
        Account account = accountService.findByUsername(username);

        if (account == null) {
            System.out.println("Không tìm thấy tài khoản!");
            throw new UsernameNotFoundException("Tên đăng nhập hoặc mật khẩu sai hoặc chưa đăng kí tài khoản !");
        }

        System.out.println("Tìm thấy tài khoản: " + account.getUsername());
        Collection<GrantedAuthority> grantedAuthorities = new HashSet<>();
        Set<AccountRole> role = account.getAccountRoles();

        for (AccountRole roles : role) {
            System.out.println("Gán quyền: " + roles.getRole().getName());
            grantedAuthorities.add(new SimpleGrantedAuthority(roles.getRole().getName()));
        }

        return new CustomAccountDetails(account, grantedAuthorities);
    }
}


