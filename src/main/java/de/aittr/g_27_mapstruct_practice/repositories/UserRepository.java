package de.aittr.g_27_mapstruct_practice.repositories;

import de.aittr.g_27_mapstruct_practice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}