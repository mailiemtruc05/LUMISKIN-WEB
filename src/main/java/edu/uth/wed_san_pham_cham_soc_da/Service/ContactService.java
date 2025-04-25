package edu.uth.wed_san_pham_cham_soc_da.Service;

import edu.uth.wed_san_pham_cham_soc_da.models.Contact;
import java.util.List;

public interface ContactService {
    Contact saveContact(Contact contact);
    List<Contact> getContactsByUserId(Integer userId);  // Đảm bảo đúng tên biến
    List<Contact> getAllContacts();
}