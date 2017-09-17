package com.apps.rafal.zientara.experiments.repository;

import com.apps.rafal.zientara.experiments.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
