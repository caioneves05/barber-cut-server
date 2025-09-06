package caioneves05.barber_cut_server.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Fullname must not be blank")
    @Column(nullable = false)
    String fullname;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email must not be blank")
    @Column(nullable = false, unique = true, length = 150)
    String email;

    @NotBlank(message = "Password must not be blank")
    @Column(nullable = false, length = 60)
    String password;

    @NotBlank(message = "Phone must not be blank")
    @Column(nullable = false, length = 15)
    String phone;

    @NotBlank(message = "Document must not be blank")
    @Column(nullable = false, unique = true, length = 14)
    String document;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}

