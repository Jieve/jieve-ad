package com.jieve.ad.dao;

import com.jieve.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jieve
 */
public interface AdUserRepository extends JpaRepository<AdUser, Long> {

    /**
     * 通过用户名称获取用户记录
     * @param username
     * @return
     */
    AdUser findByUsername(String username);
}
