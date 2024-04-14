package com.ugnius.carmarketplace.repositories;

import com.ugnius.carmarketplace.models.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Repository> {

    Optional<Token> findByToken(String token);
}
