package hello.test.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank; // ← correct import

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Email is mandatory")
    private String email;

    // Constructors
    public User() {}

    // Getters
    public long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    // Setters
    public void setId(long id) { this.id = id; }      // ← this is what's missing
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
}