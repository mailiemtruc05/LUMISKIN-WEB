package edu.uth.wed_san_pham_cham_soc_da.models;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uID", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<AccountRole> accountRoles;

    // Constructors
    public Roles() {}

    public Roles(String name) {
        this.name = name;
    }

    // Getters & Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Set<AccountRole> getAccountRoles() { return accountRoles; }
    public void setAccountRoles(Set<AccountRole> accountRoles) { this.accountRoles = accountRoles; }

}
