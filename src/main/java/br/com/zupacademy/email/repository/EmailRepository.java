package br.com.zupacademy.email.repository;

import br.com.zupacademy.email.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {
}
