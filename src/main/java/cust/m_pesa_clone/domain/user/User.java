package cust.m_pesa_clone.domain.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="User")
@Table(name="user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String numberPhone;

    public boolean isValidNumber() {
        return numberPhone != null &&
                numberPhone.length() == 9 &&
                (numberPhone.startsWith("84") || numberPhone.startsWith("85"));
    }
}
