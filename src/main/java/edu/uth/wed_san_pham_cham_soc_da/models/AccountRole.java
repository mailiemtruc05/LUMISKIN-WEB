package edu.uth.wed_san_pham_cham_soc_da.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "account_role")
public class AccountRole
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uID", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name ="accountId",referencedColumnName = "uID")
    @JsonIgnore
    private Account account;

    @ManyToOne
    @JoinColumn(name = "roleId",referencedColumnName = "uID")
    @JsonIgnore
    private Roles role;

    public AccountRole() {}

    public AccountRole(Account account, Roles role) {
        this.account = account;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

}
