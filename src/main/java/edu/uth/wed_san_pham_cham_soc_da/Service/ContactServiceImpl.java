package edu.uth.wed_san_pham_cham_soc_da.Service;

import edu.uth.wed_san_pham_cham_soc_da.models.Contact;
import edu.uth.wed_san_pham_cham_soc_da.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public Contact saveContact(Contact contact) {
        System.out.println("Dữ liệu nhận được từ frontend: " + contact);
        Contact savedContact = contactRepository.save(contact);
        System.out.println("Dữ liệu đã lưu vào database: " + savedContact);
        return savedContact;
    }

    @Override
    public List<Contact> getContactsByUserId(Integer userID) {
        return contactRepository.findByUserID_Id(userID);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
}
