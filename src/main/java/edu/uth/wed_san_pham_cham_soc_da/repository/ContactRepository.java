package edu.uth.wed_san_pham_cham_soc_da.repository;

import edu.uth.wed_san_pham_cham_soc_da.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
    // Sử dụng tên thuộc tính "userID" trong entity Contact
    List<Contact> findByUserID_Id(Integer userID);
}
