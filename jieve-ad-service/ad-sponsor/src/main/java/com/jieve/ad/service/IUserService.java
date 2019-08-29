package com.jieve.ad.service;

import com.jieve.ad.exception.AdException;
import com.jieve.ad.vo.CreateUserRequest;
import com.jieve.ad.vo.CreateUserResponse;

/**
 * @author Jieve
 */
public interface IUserService {

    CreateUserResponse createUser(CreateUserRequest request) throws AdException;
}
