package com.elena_alvaro.musicLover.repository;

import com.elena_alvaro.musicLover.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
