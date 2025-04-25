package edu.uth.wed_san_pham_cham_soc_da.repository;
import edu.uth.wed_san_pham_cham_soc_da.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    Account findByEmail(String email);

    Account findByUsername(String username);
    Optional<Account> findAccountByUsername(String username);
}

