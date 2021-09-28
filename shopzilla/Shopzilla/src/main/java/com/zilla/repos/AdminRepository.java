package com.zilla.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zilla.models.AdminUser;

@Repository
public interface AdminRepository extends JpaRepository<AdminUser, String>{

}
