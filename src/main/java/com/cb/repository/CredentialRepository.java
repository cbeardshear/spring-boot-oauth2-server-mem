package com.cb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cb.domain.Credentials;

public interface CredentialRepository extends JpaRepository<Credentials,Long> {
    Credentials findByName(String name);
}
