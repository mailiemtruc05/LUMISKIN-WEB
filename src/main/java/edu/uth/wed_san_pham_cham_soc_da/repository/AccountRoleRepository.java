package edu.uth.wed_san_pham_cham_soc_da.repository;

import edu.uth.wed_san_pham_cham_soc_da.models.AccountRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRoleRepository extends JpaRepository<AccountRole, Integer> {
}
