package com.UserApi.demo.DataBases;

import com.UserApi.demo.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDBA extends JpaRepository <User, Long> {
}
