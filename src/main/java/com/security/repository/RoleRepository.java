package com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.models.ERole;
import com.security.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	public Role findByName(ERole name);
}
